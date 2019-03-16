/**
 * Create Date:2019年3月12日
 */
package maven02;

import org.junit.Test;

import com.bawei.entity.Hello;

import junit.framework.Assert;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:张冲冲
 * <br>Date:2019年3月12日
 */

public class TestHello {
  @Test
  public void sayHello() {
    Hello h = new Hello();
    String str = h.sayHello();
    System.out.println(str);
    Assert.assertEquals("我去年买了个表", str);
  }
}
