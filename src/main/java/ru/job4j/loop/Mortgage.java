package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double persent) {
       int year = 0;
        while (amount >= 0) {
            amount = amount + amount * persent * 0.01;
            amount -= salary;
            year++;
        }
         return year;
    }
}
