package blackberry.Chapter9String.DateAPI;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/20/20 20:52
 * Create By IntelliJ IDEA
 */
public class  SimpleDateFormatTest {
    /**
     * SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析
     * 1。两个操作：
     * 格式化：日期------->字符串
     * 解析：格式化的的逆过程，字符串------->日期
     * <p>
     * 2。SimpleDateFormat的实例化
     */

    @Test
    public void testSimpleDateFormat () {
        //  实例化SimpleDateFormat：使用默认的构造器
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat ();

        //  格式化：日期----->字符串
        Date date = new Date ();
        System.out.println (date);   //  Fri Nov 20 20:57:33 CST 2020
        String format = simpleDateFormat.format (date);
        System.out.println (format);     //  得到一个字符串 11/20/20 8:58 PM

        //  解析：格式化的逆过程：字符串------->日期

//        String  str = "11/10/20 9:00 ";   java.text.ParseException: Unparseable date: "11/10/20 9:00 "
        String str = "11/10/20 9:00 AM";   //  注意格式的问题
        try {
            //  这里可能会有错误，所以使用try-catch，String类型的转换成Date对象
            Date date1 = simpleDateFormat.parse (str);
            System.out.println (date1);  //  Tue Nov 10 09:00:00 CST 2020
        } catch (ParseException e) {
            e.printStackTrace ();
        }

    }

    @Test
    public void testSimpleDateFormat1 () {
        //  实例化SimpleDateFormat：使用带参数的构造器       Pattern
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("yyyy.MMMMM.dd GGG hh:mm aaa");
        Date date = new Date ();
        String format = simpleDateFormat.format (date);
        System.out.println (format);    //  输出结果：2020.November.22 AD 09:47 AM

        //  指定的方式进行格式化和解析，调用带参数的构造器
        //  yyyy：year MM:month dd:day hh:hour mm:minutes ss:second
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        Date date1 = new Date ();
        //  格式化
        String format1 = simpleDateFormat1.format (date1);
        System.out.println (format1);        //  2020-11-22 09:51:39:年-月-日 时分秒

        //  解析：要求字符串必须是符合SimpleDateFormat所识别的格式
        try {
            //  注意这里使用的simpleDateFormat1对象,如果使用simpleDateFormat就会报错，java.text.ParseException: Unparseable date: "2020-11-22 09:51:39"
            //  因为两个对象使用的构造器格式不一样
//            Date date2 = simpleDateFormat.parse ("2020-11-22 09:51:39");
            //  将一个格式化的String解析为一个Date对象
            String str = "2020-11-22 09:51:39";
            Date date2 = simpleDateFormat1.parse (str);
            System.out.println (date2);  //  Sun Nov 22 09:51:39 CST 2020
        } catch (ParseException e) {
            // 这里会出现异常，就是因为传入的字符串格式，与造的对象所用的构造器不匹配
            e.printStackTrace ();
        }


    }


    /**
     * SimpleDateFormat 练习
     */
    //  练习一：字符串"2020-09-08"转换为java,sql.Date
    @Test
    public void test1 () {
        String str = "2020-09-08";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("yyyy-MM-dd");
        try {
            //  第一步：先将String类型的转换为Date格式
            Date date = simpleDateFormat.parse (str);
            System.out.println (date);  //   Tue Sep 08 00:00:00 CST 2020
            //  将Date格式的日期，利用date.getTime()方法转换为sql.Date 的格式
            java.sql.Date date1 = new java.sql.Date (date.getTime ());
            System.out.println (date1);  //  2020-09-08
        } catch (ParseException e) {
            e.printStackTrace ();
        }
    }

    //  练习二："三天打渔两天晒网"，从1990-01-01开始算，那么 XXXX-XX--XX 打渔还是在晒网？
    //  例如：2020-09-08 这天是在打渔还是晒网？
    //  总天数 % 5 ==1，2，3 ：打渔
    //  总天数 % 5 ==4，0：晒网
    //  如何计算总天数呢？，
    //  方式一：先转换成毫秒数 (date2.getTime() -date.getTime()) /(1000*60*60*24) --->变成天数
    //  如果除不尽的话，需要在后面+1

    //  方式二：
    @Test
    public void test2 () {



    }

    public static void main (String[] args) throws ParseException {
//        System.out.println("请输入年份：");
//        Scanner scanner = new Scanner (System.in);
//        String year = scanner.next ();
//        System.out.println("请输入月份：");
//        String month = scanner.next ();
//        System.out.println("请输入日期：");
//        String day = scanner.next ();
//        String input = year+"-"+month+"-"+day;
//        System.out.println(input);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("yyyy-MM-dd");
//        Date date = simpleDateFormat.parse (input);
//        System.out.println(date);
        Date date1 = new Date ();
        System.out.println(date1);

    }















}
