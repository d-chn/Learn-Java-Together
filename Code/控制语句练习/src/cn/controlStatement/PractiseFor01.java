package cn.controlStatement;

public class PractiseFor01 {
    public static void main(String[] args) {
        int i = 1;          //初始化
        while (i<=3){       //判断条件，一个布尔表达式
            System.out.println("我什么都不是，所以我什么都是");   //循环体
            i++;            //迭代因子
        }
        for(int a=0;a<=3;a++){  //for(初始化表达式；布尔表达式；迭代因子)
            System.out.println("I am nobody,so i am anyone");
        }
    }
}
