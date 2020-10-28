package blackberry.day4;

import java.util.Scanner;

/**
 * @author bberzhou@gmail.com
 * @date 3/23/20 22:07
 * Create By IntelliJ IDEA
 */
public class TestIf {
    public static void main (String[] args) {
        //  if语句例题
        /*
            针对于条件表达式：如果多个条件表达式之间是互斥的关系（或没有交集），哪个判断和执行语句声明在上面还是下面都没关系
            但是如果多个条件表达式之间是有交集的关系，需要根据实际情况，考虑该先放哪一个
         */
        int score;
        System.out.println ("请输入小鹏的考试成绩:");
        Scanner in = new Scanner (System.in);
        score = in.nextInt ();
        if (score == 100) {
            System.out.println (score + "奖励一辆BMW");
        } else if (score > 80 && score <= 99) {
            System.out.println (score + "奖励一台iPhoneX");
        } else if (score >= 60 && score <= 80) {
            System.out.println (score + "奖励一个iPad");
        } else {
            System.out.println ("没有奖励");
        }
    }
}
