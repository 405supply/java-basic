package assignment;

import java.util.Scanner;

public class Chap04Conditions {
    Scanner scanner = new Scanner(System.in);

    public void level02NormalOne() {
        System.out.println("1~10 사이의 정수 입력 : ");
        int num = scanner.nextInt();

        if (num < 0 || num > 10 ) {
            System.out.println("반드시 1~10 사이의 정수를 입력하시오");
        }
        else {
            if (num % 2 == 0) {
                System.out.println("짝수다");
            }
            else {
                System.out.println("홀수다");
            }
        }
    }

    public void level02NormalTwo() {
        System.out.println("체중 입력 : ");
        double weight = scanner.nextDouble();
        System.out.println("신장 입력 : ");
        double height = scanner.nextDouble();

        height /= 100;

        double bmi = weight / (height * height);

        if (bmi < 20) {
            System.out.println("당신은 저체중입니다.");
        }
        else if (bmi < 25) {
            System.out.println("당신은 정상체중입니다.");
        }
        else if (bmi < 30) {
            System.out.println("당신은 과체중입니다.");
        }
        else {
            System.out.println("당신은 비만입니다.");
        }
    }

    public void level03HardOne() {
        System.out.println("첫 번째 숫자 입력 : ");
        int num1 = scanner.nextInt();
        System.out.println("두 번째 숫자 입력 : ");
        int num2 = scanner.nextInt();
        System.out.println("연산자 입력 : ");
        String s = scanner.next();
        char op = s.charAt(0);

        switch(op) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다");
                    break;
                }
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case '%':
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;
            default:
                System.out.println("입력하신 연산은 없습니다.");
                break;
        }
    }

    public void level03HardTwo() {
        System.out.println(" -- 상품 가격 --\n" +
                "사과 :  1000원\n" +
                "바나나 : 3000원\n" +
                "복숭아 : 2000원\n" +
                "키위 : 5000원");

        System.out.println("과일 이름을 입력하세요 : ");
        String fruit = scanner.next();

        switch (fruit) {
            case "사과":
                System.out.println("사과의 가격은 1000원입니다.");
                break;
            case "바나나":
                System.out.println("바나나의 가격은 3000원입니다.");
                break;
            case "복숭아":
                System.out.println("복숭아의 가격은 2000원입니다.");
                break;
            case "키위":
                System.out.println("키위의 가격은 5000원입니다.");
                break;
            default:
                System.out.println("준비된 상품이 없습니다.");
                break;
        }
    }

    public void level04AdvancedOne() {
        System.out.println("국어 점수 입력 : ");
        int korean = scanner.nextInt();
        System.out.println("영어 점수 입력 : ");
        int english = scanner.nextInt();
        System.out.println("수학 점수 입력 : ");
        int math = scanner.nextInt();

        boolean approved = true;

        double avg = (double) (korean + english + math) / 3;

        if (korean < 40) {
            System.out.println("국어 점수 미달로 불합격입니다.");
            approved = false;
        }

        if (english < 40) {
            System.out.println("영어 점수 미달로 불합격입니다.");
            approved = false;
        }

        if (math < 40) {
            System.out.println("수학 점수 미달로 불합격입니다.");
            approved = false;
        }

        if (avg < 60) {
            System.out.println("평균 점수 미달로 불합격입니다");
            approved = false;
        }

        if (approved) {
            System.out.println("합격입니다!");
        }
    }

    public void level04AdvancedTwo() {
        System.out.println("월 급여 입력: ");
        int monthlyWage = scanner.nextInt();
        System.out.println("매출액 입력: ");
        int totalEarning = scanner.nextInt();

        double bonus = 0f;

        System.out.println("* -- 매출액 대비 보너스율 -- \n" +
                "*   매출액       보너스율\n" +
                "* 5천만원 이상      5%\n" +
                "* 3천만원 이상      3%\n" +
                "* 1천만원 이상      1%\n" +
                "* 1천만원 미만      0%");

        if (totalEarning >= 50000000) {
            bonus = 0.05;
        }
        else if (totalEarning >= 30000000) {
            bonus = 0.03;
        }
        else if (totalEarning >= 10000000) {
            bonus = 0.01;
        }
        else {
            bonus = 0;
        }
        System.out.println("============");
        System.out.println("매출액 : " + totalEarning);
        System.out.println("보너스율 : " + (bonus * 100) + "%");
        System.out.println("월 급여 : " + monthlyWage);
        System.out.println("보너스 급액 : " + (monthlyWage * bonus));
        System.out.println("총 급여 : " + (monthlyWage + monthlyWage * bonus));
    }



}
