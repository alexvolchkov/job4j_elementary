package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean reference = data[0];
        for (boolean el : data) {
            if (reference != el) {
                result = false;
                break;
            }
        }
        return result;
    }
}
