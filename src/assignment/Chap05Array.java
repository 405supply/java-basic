package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Chap05Array {
    Scanner s = new Scanner(System.in);
    public void level01BasicOne() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }

    public void level01BasicTwo() {
        String[] arr = new String[]{"딸기", "바나나", "복숭아", "키위", "사과"};

        System.out.print("0~4 사이의 정수를 입력하세요 : ");
        int idx = s.nextInt();
        if (idx < 0 || idx > 4) {
            System.out.println("준비된 과일이 없습니다.");
        }
        else {
            System.out.println(arr[idx]);
        }
    }

    public void level02NormalOne() {
        System.out.print("문자열을 입력하세요 : ");
        String str = s.next();
        char[] carr = str.toCharArray();

        System.out.print("검색할 문자 하나를 입력하세요 : ");
        String str2 = s.next();
        char search = str2.charAt(0);

        int count = 0;

        for (int i = 0; i < carr.length; i++) {
            if (carr[i] == search) count++;
        }

        System.out.println("입력하신 문자열 " + str + " a에서 찾으시는 문자 " + search + "는 " + count + "개입니다.");
    }

    public void level02NormalTwo() {
        System.out.print("주민등록번호를 입력하세요 (123456-7890123) : ");
        String str = s.next();
        char[] code = str.toCharArray();

        boolean flag = false;
        int hideIndex = 0;

        for (int i = 0; i < code.length; i++) {
            if (code[i] == '-') {
                hideIndex = i + 2;
                break;
            }
        }

        for (int i = hideIndex; i < code.length; i++) {
            code[i] = '*';
        }

        System.out.println(code);
    }

    public void level03HardOne() {
        int num = 0;
        while (true) {
            System.out.print("양의 홀수 입력 : ");
            num = s.nextInt();
            if (num % 2 == 0 || num < 0) {
                System.out.println("양의 홀수를 입력해주세요.");
            }
            else break;
        }

        int[] arr = new int[num];
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (i < num / 2) {
                arr[i] = count++;
            }
            else {
                arr[i] = count--;
            }
        }

        System.out.print("출력 : ");
        for (int n : arr) System.out.print(n);
    }

    public void level04AdvancedOne() {
        int[] lottery = new int[7];
        int select = 0;
        int count = 0;
        boolean flag = false;

        while (true) {
            select = ((int) (Math.random() * 100) % 45) + 1;

            for (int n : lottery) {
                if  (select == n) {
                    flag = true;
                }
            }
            if (flag) continue;

            lottery[count++] = select;
            if (count >= 7) break;
        }
        Arrays.sort(lottery);
        for (int n : lottery) System.out.print(n + " ");
    }

    public void level04AdvancedTwo() {
        int count = 10;
        int pick = 0;
        int[] base = new int[4];
        String str;
        boolean flag = false;

        while (true) {
            int select = (int) (Math.random() * 10) % 10;

            for (int n : base) {
                if (select == n) {
                    flag = true;
                    break;
                }
            }
            if (flag) continue;

            base[pick++] = select;
            if (pick >= 4) break;
        }
//        System.out.print("For debug base is : ");
//        for (int n : base) System.out.print(n);

        while (count > 0) {
            int strike = 0;
            int ball = 0;
            System.out.println("\nAttempts left : " + count--);
            System.out.print("Guess 4 numbers : ");
            str = s.next();

            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < base.length; j++) {
                    if (Character.getNumericValue(str.charAt(i)) == base[j]) {
                        if (i == j) strike++;
                        else ball++;
                    }
                }
            }

            if (strike == 4) {
                System.out.println("Congratulations! You win!");
                break;
            }
            else {
                System.out.println("You hit it with " + strike + "S " + ball +"B");
            }
        }
    }
}
