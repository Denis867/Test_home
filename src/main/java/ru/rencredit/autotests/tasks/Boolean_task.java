package ru.rencredit.autotests.tasks;
//Проверяет принадлежит ли вводимое значение граница от 0 до 10
import java.util.Scanner;

class Boolean_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean result = num > 0 && num < 10;
        System.out.println(result);
        // put your code here
    }
}