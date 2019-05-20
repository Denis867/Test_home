package ru.rencredit.autotests.tasks;
//Проверяет вводимые значения и выдает true если они по убыванию/возрастанию или false если не по порядку
import java.util.Scanner;

class Boolean_rost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        //boolean result = (num1 >= num2 && num2 >= num3 && num3 <= num1) || (num1 <= num2 && num2 <= num3 && num3 >= num1); --можно еще так
        boolean result = (num1 >= num2 && num2 >= num3) || (num1 <= num2 && num2 <= num3);
        System.out.println(result);

        // put your code here
    }
}