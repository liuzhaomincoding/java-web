package com.github.astutesparrow.javaweb.testng;

import org.testng.annotations.Test;

/**
 * User: 智深
 * Date: 13-5-4
 *
 * mvn test -DskipTests=false -DwantedGroups=dependency
 */
public class TestNGDepencency {

    // 使用了组以后，method1,也必须配置组
    @Test(groups = "dependency")
    public void method1() {
        System.out.println("This is method 1");
    }

    @Test(dependsOnMethods={"method1"}, groups = "dependency")
    public void method2() {
        System.out.println("This is method 2");
    }

}
