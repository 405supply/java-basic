import java.util.Arrays;

public class Chap12Generics {
    public <T> void  swap(T[] array, int idx1, int idx2) {
        T temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    public void level01NormalOne() {
        Chap12Generics chap12Generics = new Chap12Generics();
        Integer[] intArr = {1, 2, 3, 4, 5};

        System.out.println("Before swap: " + Arrays.toString(intArr));
        chap12Generics.swap(intArr, 0, 4);
        System.out.println("After swap: " + Arrays.toString(intArr));

        String[] strArr = {"hello", "world", "alpha", "beta", "gamma"};

        System.out.println("Before swap: " + Arrays.toString(strArr));
        chap12Generics.swap(strArr, 1, 2);
        System.out.println("After swap: " + Arrays.toString(strArr));
    }

}
