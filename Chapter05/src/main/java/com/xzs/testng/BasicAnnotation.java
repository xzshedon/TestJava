package com.xzs.testng;
import org.testng.annotations.*;

public class BasicAnnotation {
    @BeforeMethod
    public void beforMethod(){
        System.out.println("测试执行 前");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("测试执行 后");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("测试套件 前");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("测试套件 后");
    }

    // 最基本的注解，用来把方法标记为测试
    @Test
    public void testCase1(){
        System.out.println("执行用例 1");
    }

    // 添加enable控制是否执行测试
    @Test(enabled = false)
    public void testCase2(){
        System.out.println("执行用例 2");
    }
}
