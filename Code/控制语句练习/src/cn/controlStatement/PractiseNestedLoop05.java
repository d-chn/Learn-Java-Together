package cn.controlStatement;

/**
 * 使用嵌套循环，打印5X5的*和#交替点阵（效果可运行查看）
 */
public class PractiseNestedLoop05 {
    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for(int j=i;j<=i+4;j++){
//                if(j%2==0){
//                    System.out.print("#"+"\t");
//                }
//                else {
//                    System.out.print("*"+"\t");
//                }
//            }
//            System.out.println();
//        }
          for(int i=1;i<=5;i++){
              for(int j=1;j<=5;j++){
                  if((i+j)%2==0){
                      System.out.print("*"+"\t");
                  }
                  else{
                      System.out.print("#"+"\t");
                  }
              }
              System.out.println();
          }
    }
}
