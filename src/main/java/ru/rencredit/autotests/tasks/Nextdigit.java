package ru.rencredit.autotests.tasks;
//выводит следующее четное число после оригинального
class NextDigit {
    public static void main (String [] args){
        int num1 = 1;
        if (num1%2 != 0) {
            num1 = num1+1;}
        else {num1 = num1+2;
        }
        System.out.println(num1);
    }
}
