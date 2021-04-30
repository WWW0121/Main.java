package edu.xcdq;

/**
 * 自定义的数据类型  Article
 */
public class Shangpin {
    String name ;   // 商品，名称
    int amount ;    // 商品库存
    double price ; // 单价
    int number ;  /// 已售商品

    public void shezhiShangpin(String mingzi,int shuliang,double danjia,int shouchushuliang){
        name = mingzi;
        amount = shuliang;
        price = danjia;
        number = shouchushuliang;
    }
    //  查看商品对象的时候不再是看不懂的内存地址，而是以下显示格式
    public void print(int index){
        System.out.println(index+"/t"+name+"/t"+amount+"/t"+price+"/t"+number);
    }
}
