package blackberry.day8OOp2.ObjectClassExecise2;

import java.util.Objects;

/**
 * @Description: Mydate类
 * @author: bberzhou@gmail.com
 * @date: 4/21/20 09:48
 * Create By IntelliJ IDEA
 */
public class MyDate {
    private int day;
    private int month;
    private int year;
    //  重写equals()方法


//    @Override
//    public boolean equals (Object o) {
//        if (this == o) return true;
//        if (o == null || getClass () != o.getClass ()) return false;
//        MyDate myDate = (MyDate) o;
//        return day == myDate.day &&
//            month == myDate.month &&
//            year == myDate.year;
//    }


    @Override
    public boolean equals (Object Obj) {
        //  当前对象和Obj相等则返回true
        if (this == Obj) {
            return true;
        }
        if (Obj instanceof MyDate) {
            //  向下强转，让Obj可以调用属性
            MyDate myDate = (MyDate) Obj;
            return this.day == myDate.day && this.month == myDate.month && this.year == myDate.year;
        }
        //  不相等时就return false
        return false;
    }


    //  带参数的构造器
    public MyDate (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //  空参数构造器
    public MyDate () {

    }

    public void setDay (int day) {
        this.day = day;
    }

    public void setMonth (int month) {
        this.month = month;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public int getDay () {
        return day;
    }

    public int getMonth () {
        return month;
    }

    public int getYear () {
        return year;
    }
}
