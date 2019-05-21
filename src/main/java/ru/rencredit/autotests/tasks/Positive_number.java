package ru.rencredit.autotests.tasks;
//YES если число положительное;
import java.util.Scanner;

public class Positive_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println("YES");
        }        else {System.out.println("NO");}
        // put your code here
    }
}

