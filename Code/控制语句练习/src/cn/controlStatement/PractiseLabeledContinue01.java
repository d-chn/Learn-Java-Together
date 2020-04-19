package cn.controlStatement;

/**
 * 控制循环嵌套跳转，打印100-150之间的质数
 */
public class PractiseLabeledContinue01 {
    public static void main(String[] args) {
        outer:for(int i=100;i<=150;i++){
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    continue outer; //若不在此处跳转到outer，则此出的for循环会一直进行下去
                }
            }
            System.out.println(i+"\t");
        }
    }
}
