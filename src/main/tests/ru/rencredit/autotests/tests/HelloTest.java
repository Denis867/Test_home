package ru.rencredit.autotests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.rencredit.autotests.tasks.Hello;

public class HelloTest {

    @Test
    public void testMain(String[] args) {
        String expected = "Hello World !!!";
        Hello hello = new Hello(expected);
        Assert.assertEquals("Ura", hello, expected);
    }
}