/**
 * Create Date:2019��3��12��
 */
package maven02;

import org.junit.Test;

import com.bawei.entity.Hello;

import junit.framework.Assert;

/**
 * <br>Title:TODO �����
 * <br>Description:TODO �๦������
 * <br>Author:�ų��
 * <br>Date:2019��3��12��
 */

public class TestHello {
  @Test
  public void sayHello() {
    Hello h = new Hello();
    String str = h.sayHello();
    System.out.println(str);
    Assert.assertEquals("��ȥ�����˸���", str);
  }
}
