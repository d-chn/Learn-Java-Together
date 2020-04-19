package cn.controlStatement;
import java.util.Scanner;

/**
 * 写一个个人所得税计算器
 * （1）通过键盘输入用户的月薪
 * （2）根据不同薪资段不同税收比例的方法计算出应收的税款
 * （3）直到键盘输入"exit"，则退出程序（使用break退出循环）
 */
public class PractiseControlStatement02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("请输入用户的月薪：");
            double mouthSalary = input.nextDouble();
            if (mouthSalary > 5000) {
                mouthSalary = mouthSalary * 0.03;
            }
            System.out.println("您应该上交的税款为：" + mouthSalary);
            System.out.println("退出程序，请输入exit。其他任意字符表示继续执行。");
            String statement = input.next();
            if (statement.equals("exit")) {
                break;
            }
        }
    }
}
