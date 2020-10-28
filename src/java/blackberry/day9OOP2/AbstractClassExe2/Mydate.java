package blackberry.day9OOP2.AbstractClassExe2;

import blackberry.day8OOp2.ObjectClassExecise2.MyDate;

/**
 * @Description: mydate类
 * @author: bberzhou@gmail.com
 * @date: 4/29/20 23:07
 * Create By IntelliJ IDEA
 */
public class Mydate {
    /*
        mydate类包含
        private 成员变量：year month day
        toDateString()方法返回日期对应的字符串：XXX年XX月XX日
     */
    private int year;
    private int month;
    private int day;

    //  空参构造器
    public Mydate () {

    }

    public Mydate (int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

    }

    public int getYear () {
        return year;
    }

    public int getMonth () {
        return month;
    }

    public int getDay () {
        return day;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public void setMonth (int month) {
        this.month = month;
    }

    public void setDay (int day) {
        this.day = day;
    }

    public String toDateString () {
        return year + "年" + month + "月" + day + "日";
    }

}
