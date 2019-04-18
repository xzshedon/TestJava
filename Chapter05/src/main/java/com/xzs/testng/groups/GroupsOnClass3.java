package com.xzs.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher(){
        System.out.println("class3 teacher1");
    }

    public void teacher2(){
        System.out.println("class3 teacher2");
    }
}
