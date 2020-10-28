package blackberry.day8OOP3.WrapperClassExecise;

import java.util.Scanner;
import java.util.Vector;

/**
 * @Description: 包装类的一个测试
 * @author: bberzhou@gmail.com
 * @date: 4/22/20 14:14
 * Create By IntelliJ IDEA
 */
public class StudentScoreTest {
    /*
        利用Vector替代数组：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
        提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道其长度。
            而，向量类，java.util.Vector可以根据需要动态的伸缩

       创建Vector对象：Vector v = new Vector();
       给向量添加元素：V.addElement(Object obj):    // obj必须是对象
       取出向量中的元素：Object obj = V.elementAt(index);
       注意第一个元素的下标是0，返回值是 Object类型，
       计算向量的长度，v.size();
       如果与最高分   相差10分---》A等
                    相差20分---》B等
                    相差30分---》C等
                    其他----》D等



       */

    public static void main (String[] args) {
        //  1.实例化scanner，用于从键盘输入学生成绩
        System.out.println ("情输入学生成绩");
        Scanner scanner = new Scanner (System.in);

        //  2。创建Vector对象，Vector v = new Vector():相当于动态数组
        Vector v = new Vector ();
        //  3.通过for(;;) 或者while(true)的方式，给vector中添加数组：v.addElement(Object obj)
        //      当输入的是负数时，跳出循环

        //  定义一个最高分
        int maxScore = 0;
        for ( ; ; ) {
            System.out.println ("请输入学生成绩（以负数代表结束）：");
            int score = scanner.nextInt ();
            //  当分数<0时
            if (score < 0) {
                //  小于0就结束循环，
                break;
            }
            //  当分数大于100时
            if (score > 100) {
                System.out.println ("分数不合法，请重新输入：");
                //  大于100时，结束当次循环
                continue;
            }
            //  当程序执行到这里时，表明不是负数。同时利用多态将score添加到Vector里面

            //  4。获取学生成绩的最大值
            if (score > maxScore) {
                maxScore = score;
            }
//            v.addElement (new Integer(score));    JDK 5.0以前的写法

            v.addElement (score);   //  JDK 5.0之后的写法，自动装箱
        }


        //  5。遍历Vector，得到每个学生的成绩，并与最大成绩比较，得到每个学生的等级

        //  定义一个char类型等级变量
        char level;
        for (int i = 0 ; i < v.size () ; i++) {
            //  循环取出vector里面的对象
            Object obj = v.elementAt (i);
            //  JDK5.0之前
//            Integer inScore = (Integer) obj;
//            int score = inScore.intValue ();

            //  在JDK5.0之后：
            int score = (int) obj;
            if (maxScore - score <= 10) {
                level = 'A';
            } else if (maxScore - score <= 20) {
                level = 'B';
            } else if (maxScore - score <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }

            //  输出学生的等级
            System.out.println ("student " + i + " score is " + score + ", level is " + level);

        }

    }


}
