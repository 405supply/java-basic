package assignment.javaBasic;

import java.util.Random;

public class Chap03MethodAndApiNormal {
    public int randomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
}
