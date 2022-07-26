package com.epam;

import org.testng.Assert;

public class TestCase {

    @org.testng.annotations.Test
    public void verify() {
        int a = 1;
        int b = 0;
        int c = b + 1;
        System.out.println("Verify test");
        Assert.assertEquals(c, a, "+ isn't working");
    }

}
