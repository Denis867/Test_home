package ru.rencredit.autotests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.rencredit.autotests.tasks.Parta1;

public class PartaTest {
    private Parta1 parta = new Parta1();

    @Test
    public void testParta (){
        int x1 = 100500;//scanner.nextInt();
       // int x2 = 18;//scanner.nextInt();
       // int x3 = 20;//scanner.nextInt();
        Assert.assertEquals(50250 , parta.Parta(x1));
    }
}
