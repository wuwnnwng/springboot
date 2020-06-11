package com.baozun.test;

/**
 * @ProjectName: springboot
 * @Package: com.baozun.test
 * @ClassName: Singleton
 * @Author: wwn
 * @Description: 单例类
 * @Date: 2020/6/7 13:10
 * @Version: 1.0
 */
public class Singleton extends SingeltonP {

  //
//  private static final Singleton singleton = new Singleton();
  private static Singleton singleton = new Singleton();

  public static Singleton getInstance() {

    return singleton;
  }

 /* public static Singleton getInstance(){
    return singleton;
  }*/

}
