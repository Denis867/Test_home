package ru.rencredit.autotests.test_in_home;
import java.lang.String;

public class Palindrom {

    public static void main(String[] args) {
        String text = "Madam, I'm Adam!";
        boolean rev = false;
        text = text.replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder strBuffer;
        strBuffer = new StringBuilder(text);
        strBuffer.reverse(); //делает реверс слова
        System.out.println(strBuffer.toString()); //выводит реверсивное слово
        System.out.println(strBuffer.toString().equalsIgnoreCase(text)); //сравнивает реверсное слово с оригиналом и выводит true or false
        //    isPalindrome = true;} else {isPalindrome = false;}
        //return isPalindrome; // your implementation here

        /*System.out.println(new StringBuilder(text.replaceAll("[^a-zA-Z0-9]", ""))
                .reverse().toString().equalsIgnoreCase(text.replaceAll("[^a-zA-Z0-9]", "")));*/
    }
}