package com.baozun.test;

import java.util.Objects;

/**
 * @ProjectName: springboot
 * @Package: com.baozun.test
 * @ClassName: SingeltonP
 * @Author: wwn
 * @Description: 单例的父类
 * @Date: 2020/6/7 17:58
 * @Version: 1.0
 */
public class SingeltonP {

  private int A;

  public static void getStr() {
    System.out.println(123);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(A);
  }

  public int getA(){
    return A;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (null == obj) {
      return false;
    }
    if(getClass()!=obj.getClass()){
      return false;
    }
    SingeltonP other = (SingeltonP)obj;
    if(this.getA()==other.getA()){
      return true;
    }
    return  false;
  }
}
