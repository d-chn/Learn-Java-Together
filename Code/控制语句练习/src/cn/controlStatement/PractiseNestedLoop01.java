package cn.controlStatement;

/**
 * 练习嵌套循环
 */
public class PractiseNestedLoop01 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}
