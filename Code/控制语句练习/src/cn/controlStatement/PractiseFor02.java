package cn.controlStatement;

/**
 * for的控制表达式中的逗号表达式
 */
public class PractiseFor02 {
    public static void main(String[] args) {
        for(int i=1,j=i;i<=3;i++,j=i*2){
            System.out.println("i为:"+i+" j为:"+j);
        }
    }
}
