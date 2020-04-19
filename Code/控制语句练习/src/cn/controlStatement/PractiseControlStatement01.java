package cn.controlStatement;
import java.lang.module.FindException;
import java.util.Scanner;

/**
 * 写一个薪水计算器：
 * （1）通过键盘输入用户的薪水，每年发几个月薪水
 * （2）输出用户的年薪
 * （3）直到键盘输入"exit"，则退出程序（使用break退出循环）
 * （4）输入中途，键盘输入"next"，则这个用户退出计算，算下一位用户的年薪
 */
public class PractiseControlStatement01 {
    public static void main(String[] args) {
        //先写一个简单的乘法，月薪乘以月数
        //再写一个两步的循环，一步输入月薪，一步输入月数
        //再等待用户输入exit或者next，分别对应break和continue
        System.out.println("我的年薪计算器");
        while(true) {
            int flag = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("请输入当前用户的月薪(只能为数字，单位：元)：");
            int monthSalary = input.nextInt();
            System.out.print("请输入当前用户领取薪水的月数(只能为数字，单位：月)：");
            int month = input.nextInt();
            int yearSalary = monthSalary * month;
            System.out.println("该用户的年薪为：" + yearSalary);
            System.out.print("你是要继续使用（输入next）还是退出软件（输入exit）？其他任意字符表示继续执行");
            input.nextLine();                //此行作用为让input获取掉之前nextInt留在缓冲区的换行符，否则Status无法获得下一次键盘输入
            String status = input.nextLine();
            if (status.equals("next")) {
                System.out.println("软件继续执行了");
                continue;
            } else if (status.equals("exit")) {
                System.out.println("软件退出了");
                break;
            }
        }
    }
}