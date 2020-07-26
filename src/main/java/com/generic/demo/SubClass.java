package com.generic.demo;

import com.generic.demo.erasure.Person;

/**
 * @author XXX
 * @description: XXX
 * @date 2020/7/26 9:32
 */
public class SubClass<T> implements SuperInterface<T> {

   T obj;


   @Override
   public T getObj() {
      System.out.println("getObj");
      return obj;
   }

   @Override
   public void setObj(T obj) {
      System.out.println("setObt " + obj);
   }

   /**
    * 泛型方法
    */
   public <T> int getGenericMethod(T obj) {

      if (obj instanceof Person) {

         return ((Person)obj).getAge();
      }

      return 18;
   }

}
