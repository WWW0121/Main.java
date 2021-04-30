package edu.xcdq;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wangwenbo
 * @data 2021/4/2 9:35
 */
public class ShangpinGuanli {
    // 按照仓库模板创建一个是实体的创建对象
      ShangpinCangku cangku1 = new ShangpinCangku();
        // 往仓库中存储一些初始商品
@Test
      public  void  chushiCangku(){
          // 创建一个商品
          Shangpin xiaomi12 = new Shangpin();
          xiaomi12.shezhiShangpin("小米12",3,999,0);

          //再创建一个商品
          Shangpin iphone12 = new Shangpin();
          iphone12.shezhiShangpin("苹果12",9999,7888,12);

          //再创建一个商品
          Shangpin oneplus = new Shangpin();
          oneplus.shezhiShangpin("一加",333,1999,50);

          //再创建一个商品
          Shangpin huawei = new Shangpin();
          huawei.shezhiShangpin("华为手机",666,2999,60);

          cangku1.cangku[0] = xiaomi12;
          cangku1.cangku[1] = iphone12;
          cangku1.cangku[2] = oneplus;
          cangku1.cangku[3] = huawei;

          System.out.println(Arrays.toString(cangku1.cangku));
      }
}
