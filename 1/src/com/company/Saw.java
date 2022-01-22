package com.company;


public class Saw {


    public static void main(String[] args) {
        triangle(5);
        sawtooth(5, 3);
    }

    private static void sawtooth(int rows, int iterations) {
        for (var i = 0; i < iterations; i++) {
            triangle(rows);
        }
    }

    private static void triangle(int rows) {
        String[] output = new String[rows];

        for (int row = 0; row < rows; row++) {
            output[row] = "";
            for (int line = 0; line <= row; line++) {
                output[row] += "x";
            }
        }

        printArray(output);
    }

    private static void printArray(String[] array) {
        for (String line: array) {
            System.out.println(line);
        }
    }
}
