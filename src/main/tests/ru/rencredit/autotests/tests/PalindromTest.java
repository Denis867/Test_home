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
        String text = "1ma dam55555";
        text = text.replaceAll("[^a-zA-Z]", "");
        Assert.assertEquals(text, palindrom.palindromix(toLowerCase("MaDaM")));
    }
}