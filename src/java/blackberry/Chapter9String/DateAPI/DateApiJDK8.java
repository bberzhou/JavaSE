package blackberry.Chapter9String.DateAPI;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/24/20 21:37
 * Create By IntelliJ IDEA
 */
public class DateApiJDK8 {
    /**
     *  JDK8新出现的API相关测试
     *  可变性：像日期和时间这样的类应该是不可变的
     *  偏移性：Date中的年份是从1900年开始的，而月份都是从0开始    3920==1900+2020
     *  格式化：格式化只对Date有用，Calendar则不行
     *  此外，它们也不是线程安全的，不能出来闰秒等问题,世界时间调秒
     *
     *  JDK8 吸收了Joda-Time的精华
     *  java.time Api 包含了（本地日期，localDate）、本地时间（localTime）、本地日期时间（LocalDateTime）、时区（ZonedDateTime）、持续时间（Duration）类
     *
     *  Joda-Time ---包含值对象的基础包
     *  java.time.chrono --- 提供对不同的日历系统的访问
     *  java.time.format ----格式化和解析时间和日期
     *  java.time.temporal ---包括底层框架和扩展特性
     *  java.time.zone -----  包含时区支持的类
     *
     *
     *
     */
    public static void main (String[] args) {
        Date date = new Date ();    //  默认构造器
        System.out.println(date);   //Tue Nov 24 21:48:27 CST 2020

        Date date1 = new Date (2020,9,8);   //  带参构造器
        System.out.println(date1);  //  Fri Oct 08 00:00:00 CST 3920==1900+2020 实际上是：year+1900


        // localDate、localTime、LocalDateTime的使用,now获取当前的日期、时间或者日期+时间，有点像Calendar
        // 并且now是一个静态方法：根据当前时间创建对象/指定时区的对象
        LocalDate localDate = LocalDate.now ();
        LocalTime now = LocalTime.now ();
        LocalDateTime now1 = LocalDateTime.now ();

        System.out.println (localDate); //  2020-11-25
        System.out.println (now);       //  18:43:38.761，
        System.out.println (now1);      //  2020-11-25T18:43:38.761

        //  off()：静态方法，根据指定日期/时间创建对象
        //  设定指定的年月日时分秒，没有偏移量
        LocalDateTime of = LocalDateTime.of (2020, 10, 11, 15, 10);
        System.out.println (of);    //  2020-10-11T15:10


        //  getXXX(),使用LocalDateTime的对象获取相关信息
        System.out.println (now1.getYear ());   //  year        2020
        System.out.println (now1.getDayOfMonth ()); //  day of this month   25
        System.out.println (now1.getDayOfWeek ());  //  get the day of this week    WEDNESDAY
        System.out.println (now1.getMonthValue ()); //  get the month   ,11 没有偏移量

        //  withXXX,体现了不可变性，在使用with()相关方法之后，返回的是一个新的对象
        LocalDateTime localDateTime = now1.withDayOfMonth (16); //  to set the day number
        System.out.println (now1);  //  2020-11-25T18:53:46.442 now date
        System.out.println (localDateTime); //  2020-11-16T18:53:46.442 with setting day number

        //  日期的加减操作 plusXXX, minusXXX
        LocalDateTime localDateTime1 = now1.plusMonths (1); //  month +1 ,and return a new LocalDateTime object
        System.out.println (now1);              //  2020-11-25T18:58:14.686
        System.out.println (localDateTime1);    //  2020-12-25T18:58:14.686  月份+1

        LocalDateTime localDateTime2 = now1.minusMonths (2);
        System.out.println (now1);              //  2020-11-25T18:58:14.686
        System.out.println (localDateTime2);    //  2020-09-25T18:58:14.686  月份减2








    }


















}
