/**
 * Create Date:2019锟斤拷3锟斤拷12锟斤拷
 */
package com.bawei.test;

import org.junit.Test;

import com.bawei.entity.Hello;

import junit.framework.Assert;

/**
 * <br>Title:TODO 锟斤拷锟斤拷锟�
 * <br>Description:TODO 锟洁功锟斤拷锟斤拷锟斤拷
 * <br>Author:锟脚筹拷锟�
 * <br>Date:2019锟斤拷3锟斤拷12锟斤拷
 */
public class TestHelloMaven {

  @Test
  public void testSayHwlloMaven() {
    Hello h = new Hello();
    String str = h.sayHello();
    System.out.println(str);
    Assert.assertEquals("妈的zz", str);
  }
}
