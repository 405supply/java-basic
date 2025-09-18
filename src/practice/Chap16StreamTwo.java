package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Chap16StreamTwo {
    private String[] arr = {"java", "db", "jdbc", "spring", "jpa", "lombok"};
    private Stream<String> str1 = Arrays.stream(arr);
    private Stream<String> str2 = Arrays.stream(arr, 0, 2);

    public void act1() {
        str1.forEach(this::print);
    }

    public void act2() {
        str2.forEach(this::print);
    }

    public void act3() {
        Stream<String> str3 = Stream.<String>builder()
                .add("nvidia")
                .add("cocacola")
                .add("microsoft")
                .add("amazon")
                .add("goldmansacs")
                .build();
    }

    public void act4() {
        Stream<Integer> ins = Stream.iterate(10, value->value*2).limit(10);

        ins.forEach(this::print);
    }

    public void act5() {
        Stream<Double> doubleStream = new Random().doubles(6).boxed();

        doubleStream.forEach(this::print);
    }

    public void act6() {
        Stream<String> split = Pattern.compile(" ")
                .splitAsStream("hi im who u know im fine thank you well");

        split.forEach(this::print);
    }

    public void act7() {
        IntStream ins = IntStream.range(0, 20);
        ins.filter(i -> i % 3 == 0).forEach(this::print);
    }

    public void print(String s) {
        System.out.print(s + "   ");
    }

    public void print(int i) {
        System.out.println(i + "   ");
    }

    public void print(double d) {
        System.out.println(d + "   ");
    }
}
