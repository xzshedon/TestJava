package com.xzs.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreasOnAnnotation {

    // 起三个线程，跑10次测试用例
    // %s%n是格式化输出字符串并换行
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread id: %s%n", Thread.currentThread().getId());
    }
}
