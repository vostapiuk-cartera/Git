package com.epam;

import org.testng.Assert;

public class TestCase {

    @org.testng.annotations.Test
    public void verifyAdd() {
        int a = 1;
        int b = 0;
        int c = b + a;
        System.out.println("Verify test");
        Assert.assertEquals(c, a, "+ isn't working");
    }

    @org.testng.annotations.Test
    public void verifyMultiply() {
        int a = 1;
        int b = 0;
        int c = b * a;
        System.out.println("Verify test");
        Assert.assertEquals(c, b, "* isn't working");
    }

}
