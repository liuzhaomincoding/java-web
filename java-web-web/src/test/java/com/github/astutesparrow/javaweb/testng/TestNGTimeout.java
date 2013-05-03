package com.github.astutesparrow.javaweb.testng;

import org.testng.annotations.Test;

/**
 * User: 智深
 * Date: 13-5-4
 *
 * mvn test -DskipTests=false -DwantedGroups=timeout
 */
public class TestNGTimeout {

    @Test(timeOut = 1000, groups = "timeout")
    public void infinity() {
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
