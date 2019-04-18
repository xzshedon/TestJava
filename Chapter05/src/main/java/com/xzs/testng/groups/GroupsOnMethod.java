package com.xzs.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void  test1(){
        System.out.println("服务测试1");
    }

    @Test(groups = "server")
    public void  test2(){
        System.out.println("服务测试2");
    }

    @Test(groups = "client")
    public void  test3(){
        System.out.println("客户测试1");
    }

    @Test(groups = "client")
    public void  test4(){
        System.out.println("客户测试2");
    }

    @BeforeGroups("server")
    public void beforGroupsOnServer(){
        System.out.println("服务之前");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("服务测试之后");
    }
}
