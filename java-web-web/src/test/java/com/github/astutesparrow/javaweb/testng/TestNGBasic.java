package com.github.astutesparrow.javaweb.testng;

import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Collection;

/**
 * User: 智深
 * Date: 13-5-4
 *
 * 测试此类时，注释掉maven-surefire-plugin插件的groups配置
 *
 * mvn test -DskipTests=false -DwantedGroups=basic
 *
 * mvn test -DskipTests=false 使用默认group
 *
 * mvn test 默认不执行测试
 */
public class TestNGBasic {

    private Collection<String> collection;

    @BeforeGroups(groups = {"basic"})
    public void beforeGroups() {
        collection = new ArrayList<>();
        System.out.println("@BeforeGroups - beforeGroups");
    }

    @AfterGroups(groups = {"basic"})
    public void afterGroups() {
        collection.clear();
        System.out.println("@AfterGroups - afterGroups");
    }

    @BeforeClass
    public void oneTimeSetUp() {
        System.out.println("@BeforeClass - oneTimeSetUp");
    }

    @AfterClass
    public void oneTimeTearDown() {
        System.out.println("@AfterClass - oneTimeTearDown");
    }

    @BeforeMethod
    public void setUp() {
        collection = new ArrayList<>();
        System.out.println("@BeforeMethod - setUp");
    }

    @AfterMethod
    public void tearDown() {
        collection.clear();
        System.out.println("@AfterMethod - tearDown");
    }

    @Test(groups = "basic")
    public void testEmptyCollection() {
        Assert.assertEquals(collection.isEmpty(),true);
        System.out.println("@Test - testEmptyCollection");
    }

    @Test(groups = "basic")
    public void testOneItemCollection() {
        collection.add("itemA");
        Assert.assertEquals(collection.size(), 1);
        System.out.println("@Test - testOneItemCollection");
    }

}
