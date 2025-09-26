package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Chap16Stream {
    private final ArrayList<String> arr = new ArrayList<>(
        Arrays.asList("hello", "hello2", "world")
);
    public void act1() {
        // List에서 데이터들을 조회화는 전통적인 방법


        System.out.println("Normal");

        arr.forEach(this::print);

    }

    public void act2() {
        System.out.println("doing parallel stream");

        arr.parallelStream().forEach(this::print);
        arr.parallelStream().forEach(this::print);

    }

    public void print(String s) {
        System.out.println(s + " : " + Thread.currentThread().getName());
    }



}
