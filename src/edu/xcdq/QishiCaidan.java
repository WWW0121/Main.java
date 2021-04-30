package edu.xcdq;

import java.nio.file.SimpleFileVisitor;
import java.util.Scanner;

/**
 * @author wangwenbo
 * @data 2021/4/2 10:38
 */
public class QishiCaidan {


    public static void show(){
        System.out.println("欢迎使用商场后台管理系统");
        System.out.println("******************************");
        System.out.println("1 查看商品信息");
        System.out.println("2 新增商品信息");
        System.out.println("3 删除商品信息");
        System.out.println("4 卖出商品");
        System.out.println("5 商品销售排行榜");
        System.out.println("6 退出");
        System.out.println("******************************");
        System.out.println("请选择对应的操作");
        Scanner scanner = new Scanner(System.in);
        int gongnengBianhao = scanner.nextInt();
        switch (gongnengBianhao){

            case 1:
                System.out.println("查看商品信息");
            break;
            case 2:
                System.out.println("新增商品信息");
            break;
            case 3:
                System.out.println("删除商品信息");
            break;
            case 4:
                System.out.println("卖出商品");
            break;
            case 5:
                System.out.println("商品销售排行榜");
                break;
            case 6:
                System.out.println("谢谢使用");
            break;
            default:
                System.out.println("您输入的编号有误");
            break;
        }

    }

    public void chakanShangpin(){
        ShangpinGuanli spgl = new ShangpinGuanli();
        spgl.chushiCangku();

        for (int i = 0; i < spgl.cangku1.cangku.length; i++) {
            if (spgl.cangku1.cangku[i] != null);{
                spgl.cangku1.cangku[i].print(i);
            }
        }
    }

    public void xinzengshangping(){

    }

    public void shanchushanhping(){

    }
    public void maichushangpin(){

    }
    public void paihangbang(){

    }
}
