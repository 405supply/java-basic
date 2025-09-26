package practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Chap16Map {
    public void act1() {
        IntStream ins = IntStream.range(0, 30);
        ins.filter(i -> i % 3 == 0).map(i -> i * 2).forEach(System.out::println);
    }

    public void act2() {
        List<List<String>> dList = Arrays.asList(
                Arrays.asList("hello", "helloo", "hellooooo"),
                Arrays.asList("hahahhah", "hahah 2", "yooo")
        );

        List<String> flatten = dList.stream().flatMap(Collection::stream).toList();

        System.out.println();
        System.out.println(dList);
        System.out.println(flatten);
    }

    public void act3() {
        List<Integer> inl = IntStream.of(4,6,7,11,43,78,39).boxed().sorted().toList();

        inl.forEach(System.out::println);
    }

    public void act4() {
        long count = IntStream.range(0, 100).count();
        long sum = IntStream.range(0, 200).sum();

        System.out.println("count " + count);
        System.out.println("sum" + sum);
    }

    public void act5() {
        OptionalInt max = IntStream.range(1, 200).max();

        if (Math.random() > 0.5d) max = null;
    }

    public void act6() {
        OptionalInt param = IntStream.rangeClosed(1, 100)
                .reduce((a, b) -> {System.out.println("a: " + a + ", b: " + b); return Integer.sum(a, b);}
                );

        // hello iwannagohome

        System.out.println(param);
    }
}
