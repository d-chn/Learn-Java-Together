package cn.controlStatement;

/**
 * 输出0-100的随机数，直到生成88为止
 */
public class PractiseBreak01 {
    public static void main(String[] args) {
        int total = 0;
        while (true){
            total++;
            int i = (int)(Math.round(Math.random()*100));
            if(i==88){
                System.out.println(i);
                break;
            }
        }
        System.out.println("总共运行了："+total+"次，"+"得到了数字88");
    }
}
