package cn.controlStatement;

/**
 * 使用嵌套循环，打印5X5的*点阵
 */
public class PractiseNestedLoop04 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
