package assignment.javaBasic;

public class Chap12Generics2 <T extends Number> {
    public <K extends Number> double sum(K[] list) {
        double num = 0;
        for (Number n : list) {
            num += n.doubleValue();
        }
        return num;
    }
    public void level01BasicOne() {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer 합계 : " + sum(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double 합계 : " + sum(doubleArray));

        String[] strArray = {"A", "B", "C"};

        /*This causes compile error*/
        // System.out.println("String 합계 : " + sum(strArray));

    }
}
