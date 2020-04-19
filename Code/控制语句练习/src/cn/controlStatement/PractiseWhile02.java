package cn.controlStatement;

/**
 * 计算1-100所有偶数的和，所有奇数的和。
 */
public class PractiseWhile02 {
    public static void main(String[] args) {
        int i = 0;
        int oddSum = 0;
        int evenSum = 0;
        while (i<=100){
            if(i%2==0){
                evenSum += i;
            }else
            {
                oddSum += i;
            }
            i++;
        }
        System.out.println("1-100奇数的和为："+oddSum+",偶数的和为："+evenSum);
//        int a = 1;
//        int b = 2;
//        int sum1 = 0;   //存奇数的和
//        int sum2 = 0;   //存偶数的和
//        while(a<=99){
//            sum1 += a;
//            a = a+2;
//        }
//        while(b<=100){
//            sum2 += b;
//            b = b+2;
//        }
//        System.out.println("1-100奇数的和为："+sum1+" "+"1-100偶数的和为："+sum2);
    }
}
