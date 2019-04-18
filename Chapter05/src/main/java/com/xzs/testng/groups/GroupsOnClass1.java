package com.xzs.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("class1 stu1");
    }

    public void stu2(){
        System.out.println("class1 stu2");
    }
}
