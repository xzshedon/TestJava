package com.xzs.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 什么时候会用到异常测试
     * 在期望结果为某个异常的时候
     * 比如：我们传入了某些不合法的参数，程序抛出了异常
     * 也就是说我们的预期就是这个异常
     */

    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptonFail(){
        System.out.println("这个测试会失败");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这个测试会成功");
        throw new RuntimeException();
    }

}
