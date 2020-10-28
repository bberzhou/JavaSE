package blackberry.day4;

/**
 * @author bberzhou@gmail.com
 * @date 3/27/20 10:16
 * Create By IntelliJ IDEA
 */
public class SwitchCase {
    public static void main (String[] args) {
        /*
            switch-case流程分支语句
            格式：switch(表达式){
            case 常量1:
                执行语句1；
                //break
            case 常量2：
                执行语句
                //break

           注意：
            1、根据switch表达式中的值，依次匹配各个case中的常量。一旦匹配成功就会进入相应的case结构中，调用其执行语句
                直到遇到break关键字或者是程序结尾
            2、break关键字可以在switch-case结构中
            3、switch-case结构中的表达式，只能是如下6种数据类型
                byte、short、char、int、枚举类型、string类型，不能使用布尔类型
            4、case之后只能声明常量，而不能声明范围
            5、break关键字是可选的
            6、default也是可选的，但是位置比较灵活
         */

        int number = 2;
        switch (number) {
            case 0:
                System.out.println ("0");
                break;
            case 1:
                System.out.println ("1");
                break;
            case 2:
                System.out.println ("2");
                break;
            case 3:
                System.out.println ("3");
                break;
            default:
                System.out.println ("other");
        }


//        boolean isHandsome = true;
//        switch (isHandsome){
//            case true;
//        }  System.out.println("测试");

    }
}
