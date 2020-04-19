package cn.controlStatement;

/**
 * 循环0-120之间的数字，打印出能被5整除的数字
 */
public class PractiseWhile03 {
    public static void main(String[] args) {
        System.out.println("1-120之间能被5整除的数字有：");
        int i = 0;
        while(i<=120){
            if(i%5==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
