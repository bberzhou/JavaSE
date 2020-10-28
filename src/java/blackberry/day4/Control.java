package blackberry.day4;

/**
 * @author bberzhou@gmail.com
 * @date 3/23/20 18:29
 * Create By IntelliJ IDEA
 */
public class Control {
    public static void main (String[] args) {
        /*
            流程控制语句:if-else  分支结构（条件判断结构）
            第一种：if(条件表达式){执行表达式}
            第二种：if(条件表达式){
                        执行表达式1
                    }else{
                        执行表达式2
                        }
         */

        int age = 10;
        if (age < 0) {
            System.out.println ("年龄不合格！");
        } else if (age < 20) {
            System.out.println ("青少年时期");
        } else if (age < 35) {
            System.out.println ("中年时期");
        }
    }
}
