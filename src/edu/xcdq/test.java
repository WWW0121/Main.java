package edu.xcdq;

/**
 * @author wangwenbo
 * @data 2021/4/2 10:21
 */
public class test {
    public static void main(String[] args) {


    ShangpinGuanli test = new ShangpinGuanli();
    test.chushiCangku();

        for (int i = 0; i < 3; i++) {
            test.cangku1.cangku[i].print(i);
        }
        QishiCaidan.show();

}
}