package assignment.javaBasic;

import static java.util.Arrays.stream;

public class Chap03MethodAndApiBasic {
    public void checkMethod() {

    }

    public int sum1to10() {
        int sum = 0;
        for (int i = 1; i <=10; i++) {
            sum += i;
        }
        return sum;
    }

    public void checkMaxNumber(int a, int b) {
        if (a > b) {
            System.out.println(a);
        }
        else if (a == b) {
            System.out.println("They are the same.");
        }
        else {
            System.out.println(b);
        }
    }

    public void sumTwoNumber(int a, int b) {
        System.out.println(a + b);
    }

    public void minusTwoNumber(int a, int b) {
        System.out.println(a - b);
    }
}
