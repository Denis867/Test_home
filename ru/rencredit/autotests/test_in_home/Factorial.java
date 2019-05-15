package ru.rencredit.autotests.test_in_home;

public class Factorial {
    public Factorial(int expected) {

    }

    public static void main (String [] args){
    int n = 5;
    int fact = 1;
        for (int i = 1; i <= n; i++)
        fact = fact * i;
        System.out.println(fact);
    }

}
