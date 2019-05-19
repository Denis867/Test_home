package ru.rencredit.autotests.tasks;

import java.util.Scanner;

class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);       // put your code here
        int num1 = scanner1.nextInt();
        int num2 = scanner1.nextInt();
        System.out.println(num2 + " " + num1);
    }
}