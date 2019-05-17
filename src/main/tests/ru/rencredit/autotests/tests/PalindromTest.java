package ru.rencredit.autotests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.rencredit.autotests.tasks.Palindrom;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static org.testng.Assert.*;

public class PalindromTest {

    private Palindrom palindrom = new Palindrom();

    @Test
    public void testPalindrom() {
        Assert.assertEquals("madam", palindrom.palindromix(toLowerCase("MaDaM")));

    }
}