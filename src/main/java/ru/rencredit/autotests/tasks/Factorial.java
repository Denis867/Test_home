package ru.rencredit.autotests.tasks;

public class Factorial {

   public static void main(String[] args) {
    }
    public int factresult (int fact ){
            int n = fact;
            fact = 1;
            for (int i = 1; i <= n; i++)
                fact = fact * i;
                System.out.println("Вычисленный факториал =  " + fact);
                return fact;
        }
}


