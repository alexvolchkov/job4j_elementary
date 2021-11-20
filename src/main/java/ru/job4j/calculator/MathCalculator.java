package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDifAndDiv(double first, double second) {
        return sum(difference(first, second), div(first, second));
    }

    public static double sumSumMultiplyDifDiv(double first, double second) {
        return sum(sum(first, second), multiply(first, second)) + sum(difference(first, second), div(first, second));
    }

    public static void main(String[] args) {

        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumDifAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumSumMultiplyDifDiv(10, 20));
    }
}
