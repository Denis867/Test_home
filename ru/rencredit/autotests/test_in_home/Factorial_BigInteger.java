package ru.rencredit.autotests.test_in_home;

import java.math.BigInteger;

public class Factorial_BigInteger {
    public static void main (String [] args){
        int n = 4;
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++)
            fact = fact.multiply(BigInteger.valueOf(i));
        System.out.println(fact);
    }

}