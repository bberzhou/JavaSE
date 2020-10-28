package blackberry.day7OOP1.Exc;

/**
 * @Description: testPlus
 * @author: bberzhou@gmail.com
 * @date: 4/8/20 15:43
 * Create By IntelliJ IDEA
 */
public class StudentTestPlus {
    //  此代码十多StudentTest的改进，将操作数组的方法改进一下，封装起来

    public static void main (String[] args) {
        //  声明一个Student类型的数组,对象数组
        Student1[] students1 = new Student1[20];
        //  遍历这个数组，给数组元素赋值，每个都new一个student对象
        for (int i = 0 ; i < students1.length ; i++) {
            students1[i] = new Student1 ();
            //  给每个student对象的number属性赋值
            students1[i].number = (i + 1);
            //  给state属性赋值 [1,6]年级范围
            //  公式：求一个 (int)(Math.random()*(b-a+1)+a);
            students1[i].state = (int) (Math.random () * (6) + 1);
            //  成绩[0,100]
            students1[i].score = (int) (Math.random () * (100 + 1));
        }
        StudentTestPlus studentTestPlus = new StudentTestPlus ();
        //  一，遍历学生信息的操作
        studentTestPlus.print (students1);
        //  二，打印年级为3年级的信息
        studentTestPlus.searchState (students1, 3);
        System.out.println ("------------------");
        //  三，使用冒泡排序对分数进行排序
        studentTestPlus.sort (students1);
        //  排序之后再打印
        studentTestPlus.print (students1);


//        System.out.println ("*******************************");
//        //  冒泡排序完成之后输出学生信息；
//        for (int i = 0 ; i < students1.length ; i++) {
//            System.out.println (students1[i].info ());
//        }
    }

    //  遍历student1[]数组,封装成一个方法
    public void print (Student1[] stu) {
        for (int i = 0 ; i < stu.length ; i++) {
            //  显示学生信息
            System.out.println (stu[i].info ());
        }
    }

    /**
     * @return void
     * @Author bberzhou@gmail.com
     * @Description 打印出Student1数组中指定年级的学生信息的一个方法
     * @Date 16:02 4/8/20
     * @Param Student1[] stu,需要查找的数组  int state：需要查找的年级参数
     */
    public void searchState (Student1[] stu, int state) {
        //  问题一：打印出3年级（state值为3）的学生信息
        for (int i = 0 ; i < stu.length ; i++) {
            if (stu[i].state == 3) {
                //  调用info()方法显示信息
                System.out.println (stu[i].info ());
            }
        }
    }

    /**
     * @return
     * @Author bberzhou@gmail.com
     * @Description 使用冒泡排序按学生成绩排序，并遍历学生信息
     * @Date 16:14 4/8/20
     * @Param Student1[] stu,需要排序的数组student1
     */


    public void sort (Student1[] stu) {
        //   问题二：使用冒泡排序按学生成绩排序，并遍历学生信息
        for (int i = 0 ; i < stu.length ; i++) {
            for (int j = 0 ; j < stu.length - i - 1 ; j++) {
                //  对分数进行冒泡排序
                if (stu[j].score > stu[j + 1].score) {
                    //  注意这里的错误，这里交换的是整个数组里面的student对象，而不是只交换分数
//                    int temp = students[j].score;
//                    students[j].score = students[j+1].score;
//                    students[j+1].score = temp;
                    Student1 temp = stu[j];
                    stu[j] = stu[j + 1];
                    stu[j + 1] = temp;
                }
            }

        }

    }
}

class Student1 {
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
