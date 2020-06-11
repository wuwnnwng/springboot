package com.baozun.test;

import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.springframework.context.ApplicationContext;

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
//    ExecutorService executorService = Executors.newSingleThreadExecutor();
   /* ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
    for (int i = 0; i < 10; i++) {
//      scheduledExecutorService.schedule(tTest,10, TimeUnit.SECONDS);
      scheduledExecutorService.scheduleAtFixedRate(tTest, 1, 3, TimeUnit.SECONDS);
    }*/
  /*  Thread th1 = new Thread(tTest, "T1");
    Thread th2 = new Thread(tTest, "T2");
    th1.start();
    th2.start();*/
  /*StringBuffer sb = new StringBuffer();
  sb.append("123456");
    ApplicationContext applicationContext = new ApplicationContext();
    System.out.println(sb.reverse());
  }
  */
  /*  ok:
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.println("i=" + i + ",j=" + j);
        if (j == 5) {
          break ok;
        }

      }
    }   dg
    SingeltonP singeltonP = new SingeltonP();
    SingeltonP.getStr();*/

   /* int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    for (int i = 0; i <arr.length ; i++) {
      for (int j = 0; j <arr[i].length ; j++) {
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }*/
  /*  HashSet<Double> set = new HashSet<>();
    while(set.size()<10){
      set.add(Math.random()*10);
    }
    for (Double dos:set) {
      System.out.println(dos);
    }*/
 /*   Lock lock = new ReentrantLock();
    lock.lock();
    try {很久很久骨結核骨結核共和國
      System.out.println("开启锁");
    }catch (Exception e){

    }finally {
      System.out.println("关闭锁");
      lock.unlock();
    }*/

  }
}
