package practice;

public class Chap15Lambda {
    public void task1() {
        // default implemented class
        Calculator calc = new CalculatorImpl();
        System.out.println(calc.sum(1, 3));
    }

    public void task2() {
        // Anonymous class
        Calculator calc = new Calculator() {
            @Override
            public int sum(int a, int b) { return a + b; }
        };
        System.out.println(calc.sum(1, 3));
    }

    public void task3() {
        // lambda
        Calculator calc = (a, b) -> a + b;
        System.out.println(calc.sum(1, 3));
    }

    public void task4() {
        // Method reference
        Calculator calc = Integer::sum;
        System.out.println(calc.sum(1, 3));
    }

}
