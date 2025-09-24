package assignment.javaBasic;

import assignment.reqClass.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Chap16Stream3 {
    private static final List<Student> students = Arrays.asList(
            new Student("철수", "수학", 95),
            new Student("철수", "영어", 80),
            new Student("영희", "수학", 90),
            new Student("영희", "영어", 91),
            new Student("민수", "수학", 85),
            new Student("민수", "영어", 88)
    );

    public void getAvg() {
        Map<String, Double> averageScoreByStudent = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getName,
                        Collectors.averagingInt(Student::getScore)
                ));
        System.out.println(averageScoreByStudent);
    }

    public void getHighInMath() {
        List<String> highScorersInMath = students.stream()
                .filter(student -> Objects.equals(student.getSubject(), "수학"))
                .filter(student -> student.getScore() >= 90)
                .map(Student::getName)
                .toList();

        System.out.println(highScorersInMath);
    }

    public void getBestStudent() {
        String topStudent = students.stream()
                .collect(Collectors.groupingBy(
                Student::getName, Collectors.averagingDouble(Student::getScore)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow();

        System.out.println(topStudent);
    }
}
