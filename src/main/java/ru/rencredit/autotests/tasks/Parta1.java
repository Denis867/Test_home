package ru.rencredit.autotests.tasks;

import java.lang.*;

public class Parta1 {
  /*  public static void main(String[] args) {}
        //Scanner scanner = new Scanner(System.in);
*/
    public int Parta (int x1) {
        int part;
        //int x1; scanner.nextInt();
        //  int x2 = 18;//scanner.nextInt();
        //  int x3 = 20;//scanner.nextInt();        // put your code here*/
        if ((x1%2) == 0) {
            part = (x1/*+x2+x3*/ / 2);
        } else {
            part = (x1/*+x2+x3*/) / 2 + 1;
        }
        System.out.println(part);
        return part;
    }
}
