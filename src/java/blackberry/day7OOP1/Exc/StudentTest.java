package blackberry.day7OOP1.Exc;

/**
 * @Description: StudentExercise
 * @author: bberzhou@gmail.com
 * @date: 4/8/20 10:55
 * Create By IntelliJ IDEA
 */
public class StudentTest {
    /*
        对象数组题目：
        定义一个类student，
        包含三个属性：学号（number）,年级state（int)，成绩score（int），创建20个学生对象
        问题一：打印出3年级（state值为3）的学生信息
        问题二：使用冒泡排序按学生成绩排序，并遍历学生信息

        提示：
            1。生成随机数：Math.random()，返回值为0.0~1.0 double类型
            2。四舍五入取整：Math。round(double d)，返回值为long。
     */


    public static void main (String[] args) {
        //  声明一个Student类型的数组,对象数组
        Student[] students = new Student[20];
        //  遍历这个数组，给数组元素赋值，每个都new一个student对象
        for (int i = 0 ; i < students.length ; i++) {
            students[i] = new Student ();
            //  给每个student对象的number属性赋值
            students[i].number = (i + 1);
            //  给state属性赋值 [1,6]年级范围
            //  公式：求一个 (int)(Math.random()*(b-a+1)+a);
            students[i].state = (int) (Math.random () * (6) + 1);
            //  成绩[0,100]
            students[i].score = (int) (Math.random () * (100 + 1));
        }
//        for (int i = 0 ; i < students.length ; i++) {
//            //  显示学生信息
////            System.out.println(students[i].number+students[i].state);
//            System.out.println(students[i].info ());
//        }
        //  问题一：打印出3年级（state值为3）的学生信息
        for (int i = 0 ; i < students.length ; i++) {
            if (students[i].state == 3) {
                //  调用info()方法显示信息
                System.out.println (students[i].info ());
            }
        }

        //   问题二：使用冒泡排序按学生成绩排序，并遍历学生信息
        for (int i = 0 ; i < students.length ; i++) {
            for (int j = 0 ; j < students.length - i - 1 ; j++) {
                //  对分数进行冒泡排序
                if (students[j].score > students[j + 1].score) {
                    //  注意这里的错误，这里交换的是整个数组里面的student对象，而不是只交换分数
//                    int temp = students[j].score;
//                    students[j].score = students[j+1].score;
//                    students[j+1].score = temp;
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }

        }
        System.out.println ("*******************************");
        //  冒泡排序完成之后输出学生信息；
        for (int i = 0 ; i < students.length ; i++) {
            System.out.println (students[i].info ());
        }
    }


}

class Student {
    //  学号
    int number;
    //  年级
    int state;
    //  成绩
    int score;

    public String info () {
        return "学号：" + number + "，年级：" + state + ",分数：" + score;
    }

}
