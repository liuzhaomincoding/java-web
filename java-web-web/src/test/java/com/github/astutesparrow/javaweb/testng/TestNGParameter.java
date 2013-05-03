package com.github.astutesparrow.javaweb.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Vector;

/**
 * User: 智深
 * Date: 13-5-4
 *
 * mvn test -DskipTests=false -DwantedGroups=parameter
 */
public class TestNGParameter {

    @Test(dataProvider = "Data-Provider-Function", groups = "parameter")
    public void parameterIntTest(Class clzz, String[] number) {
        System.out.println("Parameterized Number is : " + number[0]);
        System.out.println("Parameterized Number is : " + number[1]);
    }

    @DataProvider(name = "Data-Provider-Function")
    public Object[][] parameterIntTestProvider() {
        return new Object[][]{
                {Vector.class, new String[] {"java.util.AbstractList",
                        "java.util.AbstractCollection"}},
                {String.class, new String[] {"1", "2"}},
                {Integer.class, new String[] {"1", "2"}}
        };
    }

}
