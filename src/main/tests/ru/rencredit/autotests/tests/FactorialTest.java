package ru.rencredit.autotests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.rencredit.autotests.tasks.Factorial;

public class FactorialTest {
    private Factorial factorial = new Factorial();

    @Test
    public void testMain() {
        int expected = 720;
        System.out.println("Ожидаемый факториал = " + expected);
        Assert.assertEquals(expected,factorial.factresult(6));
    }
}