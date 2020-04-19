package cn.controlStatement;

/**
 * 测试if-else结构
 */
public class PractiseIf02 {
    public static void main(String[] args) {
        double r = Math.random()*4;
        double area = Math.PI*r*r;
        double circle = Math.PI*r*2;
        System.out.println("半径是："+r);
        System.out.println("面积是："+area);
        System.out.println("周长是："+circle);
        if(area>=circle){
            System.out.println("面积的数值大于等于周长的数值。");
        }else {
            System.out.println("面积的数值小于周长的数值。");
        }
    }
}