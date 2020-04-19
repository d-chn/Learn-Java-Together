package cn.controlStatement;
/**
 * 测试switch分支结构
 */
public class PractiseSwitch01 {
    public static void main(String[] args) {
        int grade = 1;  //grade表示工作年数
        switch (grade){
            case 1:
                System.out.println("新人，好好学习");
                break;
            case 2:
                System.out.println("有经验了，但是还不熟练");
                break;
            case 3:
                System.out.println("已经是一只老鸟，可以独当一面了");
                break;
            default:
                System.out.println("是时候考虑进一步的发展了");
        }
//        int mouth = 5;
//        switch (mouth){
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("春天");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("夏天");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("秋天");
//                break;
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("冬天");
//                break;
//        }

    }
}
