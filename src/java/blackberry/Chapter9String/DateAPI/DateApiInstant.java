package blackberry.Chapter9String.DateAPI;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/25/20 19:02
 * Create By IntelliJ IDEA
 */
public class DateApiInstant {
    /**
     *  Instant的使用
     *  类似java.util.Date类
     */
    public static void main (String[] args) {
        //  now()：获取本初子午线对应的标准时间
        Instant now = Instant.now ();
        System.out.println(now);        //  2020-11-25T11:03:30.130Z   这是本初子午线的时间
        //  添加时间的偏移量
        OffsetDateTime offsetDateTime = now.atOffset (ZoneOffset.ofHours (8));
        System.out.println(offsetDateTime); //  东八区，加上8个小时的偏移量2020-11-25T19:06:28.461+08:00

        //  toEpochMilli（）：获取自1970年1月1日0时0分0秒（UTC）开始的毫秒数  Date()类的getTime方法
        long l = now.toEpochMilli ();
        System.out.println (l);     //  1606302611138

        //  通过给定的毫秒数，获取instant实例     类似Date(long millis)
        Instant instant = Instant.ofEpochMilli (1606302611138L);    //  传入long型参数
        System.out.println (instant);       //  2020-11-25T11:10:11.138Z


        /**
         *  DateTimeFormatter:格式化或解析日期、时间，类似于SimpleDateFormat
         */

    }
}
