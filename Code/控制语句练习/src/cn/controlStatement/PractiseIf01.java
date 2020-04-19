package cn.controlStatement;

/**
 * 用一个简单的骰子小游戏测试if控制语句
 */
public class PractiseIf01 {
    public static void main(String[] args){
        double d = Math.random();   //生成[0,1)之间的随机数字
        int a = (int)(Math.random()*6)+1;   //生成[1,6]之间随机的一个整数
        int b = (int)(Math.random()*6)+1;   //生成[1,6]之间随机的一个整数
        int c = (int)(Math.random()*6)+1;   //生成[1,6]之间随机的一个整数
        int count = a+b+c;
        System.out.println("三个数字分别是："+a+" "+b+" "+c+"，总数为："+count);
        if(count>15){
            System.out.println("手气不错，再来一次吧！");
        }
        if(count<=15&&count>=10){
            System.out.println("手气还不错，喝口水再来吧~");
        }
        if(count<10){
            System.out.println("手气不太好，改天再来吧~~");
        }
    }
}
