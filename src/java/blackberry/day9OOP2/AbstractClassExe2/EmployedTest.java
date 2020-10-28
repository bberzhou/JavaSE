package blackberry.day9OOP2.AbstractClassExe2;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @Description: 员工测试类
 * @author: bberzhou@gmail.com
 * @date: 4/30/20 23:02
 * Create By IntelliJ IDEA
 */
public class EmployedTest {
    /*
        定义Employed类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
        利用循环结构遍历数组元素，输出各个对象的类型，name,number,birthday，
        当键盘输入本月月份值时，如果是某个Employee对象的生日，还要输出增加工资100信息

     */
    public static void main (String[] args) {
//        //  方式一键盘输入本月月份
//        Scanner in = new Scanner (System.in);
//        System.out.println("请输入当前月的月份：");
//        int month = in.nextInt ();

        //  方式二，利用Calendar类获取当前的月份
        Calendar calendar = Calendar.getInstance ();
        int month = calendar.get (Calendar.MONTH) + 1;  //  因为这个类中的月份从0开始，所以月份要+1

        //  Employee类型的数组,里面放的是Employee的子类对象
        Employee[] employees = new Employee[2];
        employees[0] = new SalariedEmployee ("liming", 43, new Mydate (2020, 4, 24), 3000);
        employees[1] = new HourlyEmployee ("Jan", 45, new Mydate (2020, 4, 29), 50, 20);
        for (int i = 0 ; i < employees.length ; i++) {
            System.out.println (employees[i].toString ());
            //  这里的earnings方法就是各自子类重写
            System.out.println (employees[i].earnings ());
            /*
                SalariedEmployee{name='liming', number=43, birthday=2020年4月24日,3000.0}
                3000.0
                HourlyEmployee{name='Jan', number=45, birthday=2020年4月29日, wage=50, hour=20}
                1000.0
             */

            //  判断是否某个员工的生日
            if (employees[i].getBirthday ().getMonth () == month) {
                System.out.println (employees[i].getName () + "生日快乐，工资加100," + (employees[i].earnings () + 100));
            }
        }


    }
}
