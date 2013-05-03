package com.github.astutesparrow.javaweb.testng;

import org.testng.annotations.Test;

/**
 * User: 智深
 * Date: 13-5-4
 *
 * mvn test -DskipTests=false -DwantedGroups=exception
 */
public class TestNGException {

    @Test(expectedExceptions = ArithmeticException.class, groups = "exception")
    public void divisionWithException() {
        int i = 1/0;
    }

}
