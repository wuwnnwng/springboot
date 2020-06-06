package com.baozun.test;

/**
 * @ProjectName: springboot
 * @Package: com.baozun.test
 * @ClassName: ThreadMain
 * @Author: wwn
 * @Description: 多线程测试类
 * @Date: 2020/6/6 9:52
 * @Version: 1.0
 */
public class ThreadMain {
  public static void main(String[] args) {
    ThreadTest tTest = new ThreadTest();

    Thread th1 = new Thread(new ThreadTest(), "T1");
    Thread th2 = new Thread(new ThreadTest(), "T2");
    th1.start();
    th2.start();
  }
}
