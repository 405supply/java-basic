package assignment.javaBasic;

import java.util.Scanner;

public class Chap05SecondDimensional {
    Scanner s = new Scanner(System.in);

    public void level01BasicOne() {
        int x = 3;
        int y = 4;
        int count = 1;
        int[][] grid = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                grid[i][j] = count++;
            }
        }

        for (int[] row : grid) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public void level03HardOne() {
        System.out.print("input x : ");
        int x = s.nextInt();
        System.out.print("input y : ");
        int y = s.nextInt();

        char[][] grid = new char[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int offset = (int) ((Math.random() * 1000) % 26);
                grid[i][j] = (char) ('A' + offset);
            }
        }

        for (char[] row : grid) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
