package assignment;

import java.util.Scanner;

public class Chap04Iterations {
    Scanner scanner = new Scanner(System.in);
    public void level02NormalOne() {
        System.out.println("문자열을 입력하세요 : ");
        String str = scanner.next();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + " : " + str.charAt(i));
        }
    }

    public void level02NormalTwo() {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print((char)i);
        }
    }

    public void level02NormalThree() {
        System.out.print("정수를 입력하세요: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print("수");
            }
            else {
                System.out.print("박");
            }
        }
    }

    public void level03HardOne() {
        int num = 0;
        while(true) {
            System.out.print("2보다 큰 정수 입력 : ");
            num = scanner.nextInt();

            if (num <= 2) {
                System.out.println("잘못 입력하셨습니다.");
            }
            else {
                break;
            }
        }

        boolean flag = true;
        int divisor = 0;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = false;
                divisor = i;
                break;
            }
        }

        if (flag) {
            System.out.println("소수입니다.");
        }
        else {
            System.out.println(divisor + "로 나누어지므로 소수가 아닙니다.");
        }
    }

    public void level03HardTwo() {
        int randNum = (int) ((Math.random() * 100) % 100);
        int guessNum = 0;

        int guesses = 0;

        while (true) {
            System.out.print("추측할 정수 입력 : ");
            guessNum = scanner.nextInt();
            guesses += 1;

            if (guessNum < randNum) {
                System.out.println("입력하신 정수보다 큽니다");
                continue;
            }
            else if (guessNum > randNum) {
                System.out.println("입력하신 정수보다 작습니다");
                continue;
            }
            else {
                System.out.println("정답입니다. " + guesses + "회 만에 정답을 맞추셨습니다.");
                break;
            }
        }
    }

    public void level03HardThree() {
        System.out.print("문자열 입력 : ");
        String str = scanner.next();
        System.out.print("문자 입력 : ");
        String search = scanner.next();

        char c = search.charAt(0);

        int count = 0;
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                System.out.println("영문이 아닌 문자가 포함되어 있습니다.");
                flag = false;
                break;
            }

            if (str.charAt(i) == c) {
                count++;
            }
        }

        if (flag) {
            System.out.println("포함된 갯수 : " + count);
        }
    }

    public void level04AdvancedOne() {
        System.out.print("문자열 입력 : ");
        String str = scanner.next();

        System.out.print("숫자 입력 : ");
        int push = scanner.nextInt() % 26;

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            newStr.append(Character.isUpperCase(str.charAt(i)) ? (char) ('A' + (str.charAt(i) - 'A' + push) % 26) : (char) ('a' + (str.charAt(i) - 'a' + push) % 26));
        }

        System.out.println("바뀐 문자열 : " + newStr);
    }
}
