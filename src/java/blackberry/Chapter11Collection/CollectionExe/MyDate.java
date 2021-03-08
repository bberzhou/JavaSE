package blackberry.Chapter11Collection.CollectionExe;

import java.util.Comparator;

public class MyDate implements Comparable {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
    //  除了在Test里面去实现comparator，也可以在MyDate里面实现Comparable接口来实现排序的方法
    @Override
    public int compareTo(Object o) {
        if (o instanceof MyDate){
            MyDate myDate = (MyDate) o;
            int minusYear = this.getYear()-myDate.getYear();
            if (minusYear != 0){
                return minusYear;
            }
            int minusMonth = this.getMonth() - myDate.getMonth();
            if (minusMonth != 0){
                return minusMonth;
            }
            return this.day - myDate.day;

        }
        throw new ClassCastException("传入数据有误");
    }


}
