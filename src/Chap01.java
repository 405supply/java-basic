public class Chap01 {
    public static void level01BasicOne() {
        int a = 20;
        int b = 30;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("더하기 결과 : " + sum);
        System.out.println("빼기 결과 : " + sub);
        System.out.println("곱하기 결과 : " + mul);
        System.out.println("나누기한 몫 : " + div);
        System.out.println("나누기한 나머지 : " + mod);
    }

    public static void level01BasicTwo() {
        double width = 12.5;
        double height = 36.4;

        double area = width * height;
        double perimeter = width * 2 + height * 2;

        System.out.println("면적 : " + area);
        System.out.println("둘레 : " + perimeter);

    }

    public static void level02NormalOne() {
        char oneLetter = 'a';
        int oneLetterToInt = oneLetter;

        System.out.println("문자 a의 unicode : " + oneLetterToInt);

    }

    public static void level02NormalTwo() {
        double nationalLanguage = 80.5;
        double math = 50.6;
        double english = 70.8;

        int sum = (int) (nationalLanguage + math + english);
        int avg = (int) ((nationalLanguage + math + english) / 3);

        System.out.println("총점: " + sum);
        System.out.printf("평균 : " + avg);
    }
}
