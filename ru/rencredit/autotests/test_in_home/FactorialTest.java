package ru.rencredit.autotests.test_in_home;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    private Object Factorial;

    @Test
    public void testMain() {
        int expected = 120;
        Assert.assertEquals("UraFact", expected, Factorial);

    }
}