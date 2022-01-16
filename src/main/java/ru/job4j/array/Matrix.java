package ru.job4j.array;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = multiple(9);
        try (FileOutputStream out = new FileOutputStream("result.txt")) {
            for (int[] row : array) {
                for (int column : row) {
                    out.write(String.valueOf(column).getBytes());
                    out.write(" ".getBytes());
                }
                out.write(System.lineSeparator().getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
