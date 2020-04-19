package cn.controlStatement;

/**
 * 把100-150之间的不能被3整除的数字输出，每行输出五个
 */
public class PractiseContinue01 {
    public static void main(String[] args) {
        int count=0;
        for(int i=100;i<=150;i++){
            if(i%3==0){
                continue;
            }else {
                System.out.print(i+"\t");
                count++;
            }
            if(count%5==0){
                System.out.println();
            }
        }
    }
}
