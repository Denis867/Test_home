package ru.rencredit.autotests.test_in_home;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void testMain(String[] args) {
        String expected = "Hello World !!!";
        Hello hello = new Hello(expected);
        Assert.assertEquals("Ura", hello, expected);
    }
}