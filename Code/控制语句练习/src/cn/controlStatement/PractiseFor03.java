package cn.controlStatement;

/**
 * 使用for循环打印a-z的26个字母
 */
public class PractiseFor03 {
    public static void main(String[] args) {
        for(char i='a';i<='a'+25;i++){
            System.out.println(i);
        }
//        char c='a';
//        char cc=(char)(c+1);      //此处必须进行强制类型转换，因为c+1的结果为c的ASCII码值加一。
//        System.out.println(cc);
    }
}
