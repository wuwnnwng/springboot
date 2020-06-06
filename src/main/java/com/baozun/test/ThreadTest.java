package com.baozun.test;

/**
 * @ProjectName: springboot
 * @Package: com.baozun.test
 * @ClassName: ThreadTest
 * @Author: wwn
 * @Description: 测试多线程
 * @Date: 2020/6/6 9:25
 * @Version: 1.0
 */
public class ThreadTest  implements Runnable{

  int count = 0;

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName()+"当前count:"+count++);
  }
}
