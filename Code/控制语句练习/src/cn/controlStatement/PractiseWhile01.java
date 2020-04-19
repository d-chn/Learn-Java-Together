package cn.controlStatement;

/**
 * 测试循环
 */
public class PractiseWhile01 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i<=100){
            sum += i;
            i++;
        }
        System.out.println("1-100的和为："+sum);
    }
}
