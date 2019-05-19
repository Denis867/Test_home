package ru.rencredit.autotests.tasks;

public class SumDigits {
    public static void main (String [] args) {
        int x = 111;
        int y = x / 100; //4,76 - целое число = 4
        int z = (x / 10)% 10; // остаток = 7
        int f = x% 10; // остаток = 6
        System.out.println (y + z + f);
    }
}
