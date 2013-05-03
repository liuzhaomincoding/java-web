package com.github.astutesparrow.javaweb.testng;

import org.testng.annotations.Test;

/**
 * User: 智深
 * Date: 13-5-4
 */
public class TestNGIgnore {

    @Test(enabled=false, groups = "ignore")
    public void divisionWithException() {
        System.out.println("Method is not ready yet");
    }

}
