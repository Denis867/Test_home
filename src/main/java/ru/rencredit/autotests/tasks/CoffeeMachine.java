package ru.rencredit.autotests.tasks;

import java.util.Scanner;

//Для приготовления одной чашки кофе кофеварке требуется 200 мл воды, 50 мл молока и 15 г кофейных зерен.

public class CoffeeMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int howwater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int howmilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int howcoffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int howcupcoffee = scanner.nextInt();
        int cup = 0;
        if (howwater/200 <= howmilk/50 && howwater/200 <= howcoffee/15){
            cup = howwater/200;}
            else if (howmilk/50 <= howwater/200 && howmilk/50 <= howcoffee/15){
            cup = howmilk/50;}
            else if (howcoffee/15 <= howwater/200 && howcoffee/15 <= howmilk/50){
            cup = howcoffee/15;}                  //вычисляем минимальное кол-во чашек, которое можем сделать

       // if (Integer.toString(cup).equals(Integer.toString(howcupcoffee))){
         if (cup == howcupcoffee){
            System.out.println("Yes, I can make that amount of coffee");}
            else if (cup < howcupcoffee){
             System.out.println("No, I can make only " + cup + " cup(s) of coffee");}
             else if (cup > howcupcoffee){
             System.out.println("Yes, I can make that amount of coffee (and even " + (cup-howcupcoffee) + "more than that)");
         }
     }
}
