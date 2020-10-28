package blackberry.day6Array;


import java.util.Scanner;

/**
 * @author bberzhou@gmail.com
 * @date 8/24/19 14:33
 * Create By IntelliJ IDEA
 */
public class ArrayTest2 {
    public static void main (String[] args) {
//        1.使用Scanner从键盘输入学生的个数
        Scanner in = new Scanner (System.in);
        System.out.print ("请输入学生的个数：");
        int num = in.nextInt ();


        //  创建存储成绩的数组，可以在给学生成绩赋值的时候就顺便将最大值给求出来
        int[] scores = new int[num];
        int maxScore = 0;
        System.out.println ("请输入" + num + "个学生的成绩:");
        for (int i = 0 ; i < scores.length ; i++) {
            scores[i] = in.nextInt ();
            //  比较数组元素与maxScore的大小，并赋值给maxScore
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }
        System.out.println ("学生中的最高分为：" + maxScore);


//        //  获取数组元素的最大值:即是最高分
//        int maxScore = 0;
//        for (int score : scores) {
//            if (maxScore < score) {
//                maxScore = score;
//            }
//        }

        // 5。计算每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
        char level;
        for (int i = 0 ; i < scores.length ; i++) {
            if (maxScore - scores[i] <= 10) {
                level = 'A';
            } else if (maxScore - scores[i] <= 20) {
                level = 'B';

            } else if (maxScore - scores[i] <= 30) {
                level = 'D';
            } else {
                level = 'D';
            }
            int stu = i + 1;
            System.out.println ("学生" + stu + "成绩是:" + scores[i] + "  " + "等级为:" + level);
        }

    }
}

