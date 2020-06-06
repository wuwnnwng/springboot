package com.baozun.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

//    ExecutorService executorService = Executors.newFixedThreadPool(5);
//    ExecutorService executorService = Executors.newCachedThreadPool();
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    for (int i = 0; i < 10; i++) {
      executorService.execute(tTest);
    }
  /*  Thread th1 = new Thread(tTest, "T1");
    Thread th2 = new Thread(tTest, "T2");
    th1.start();
    th2.start();*/

  }
}
