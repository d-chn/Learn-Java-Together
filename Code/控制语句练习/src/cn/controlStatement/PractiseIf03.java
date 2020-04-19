package cn.controlStatement;

/**
 * 测试if多分支结构
 */
public class PractiseIf03 {
    public static void main(String[] args) {
        int age = (int)(Math.random()*100);
        System.out.print("年龄是"+age+"，属于");
        if(age<20){
            System.out.println("少年");
        }
        else if(age<35){
            System.out.println("青年");
        }
        else if(age<50){
            System.out.println("壮年");
        }
        else if(age<65){
            System.out.println("中老年");
        }
        else if(age<80){
            System.out.println("老年");
        }
        else{
            System.out.println("暮年");
        }
    }
}
