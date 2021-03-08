package blackberry.Chapter11Collection.CollectionExe;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmpTest {
    /**
     * 练习
     */

    //  问题一、使用自然排序
    @Test
    public void test1() {
        TreeSet treeSet = new TreeSet();
        Employee employee1 = new Employee("liudehua", 55, new MyDate(1965, 6, 8));
        Employee employee2 = new Employee("zhangxueyou", 45, new MyDate(1975, 4, 4));
        Employee employee3 = new Employee("guofucheng", 65, new MyDate(1980, 8, 9));
        Employee employee4 = new Employee("liming", 45, new MyDate(1985, 9, 15));
        Employee employee5 = new Employee("zhoujielun", 55, new MyDate(1970, 10, 8));
        //  因为employee类里面已经重写了Compare方法，所以能成功的调用add方法添加进去
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);
        treeSet.add(employee5);

        //  循环输出,输出结果就是按照Employee对象的姓名进行排序的
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    //  按照生日日期的先后顺序来排序，
    @Test
    public void test2() {
        //  方式一、使用Comparator的方式,按照生日的先后顺序排序，也可以直接在MyDate里面实现Comparable接口来实现排序，见MyDate类里面的实现
        Comparator comparator = new Comparator() {
            @Override
            //  Returns: a negative integer, zero, or a positive integer as the first argument is less than,
            //  equal to, or greater than the second.
            //  compare方法会传入两个形参：o1 - the first object to be compared.o2 - the second object to be compared.，
            //  返回值为负数，第一个参数小，返回值为0，相等；返回值为正数，第一个参数大
            public int compare(Object o1, Object o2) {
                //  1、首先判断传入的两个形参，是否为employee的对象
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    //  2、强转为Employee的对象
                    Employee employee1 = (Employee) o1;
                    Employee employee2 = (Employee) o2;
                    //  3、先获取对象的MyDate属性
                    MyDate d1 = employee1.getMyDate();
                    MyDate d2 = employee2.getMyDate();

                    //  4、先比较年份
                    int minusYear = d1.getYear() - d2.getYear();
                    if (minusYear != 0) {
                        return minusYear;
                    }

                    //  5、比较月份
                    int minusMonth = d1.getMonth() - d2.getMonth();
                    if (minusMonth != 0) {
                        return minusMonth;
                    }


                    // 6、比较日
                    return d1.getDay() - d2.getDay();
                }
                throw new ClassCastException("传入参数有误！");
            }
        };

        TreeSet treeSet = new TreeSet(comparator);
        Employee employee1 = new Employee("liudehua", 55, new MyDate(1965, 6, 8));
        Employee employee2 = new Employee("zhangxueyou", 45, new MyDate(1975, 4, 4));
        //  这里如果MyDate相同的话，在插入的时候，liming就不会被插入到集合中去
//        Employee employee3 = new Employee("guofucheng", 65, new MyDate(1980, 8, 9));
        Employee employee3 = new Employee("guofucheng", 65, new MyDate(1981, 8, 9));
        Employee employee4 = new Employee("liming", 45, new MyDate(1980, 8, 9));
        Employee employee5 = new Employee("zhoujielun", 55, new MyDate(1970, 10, 8));
        //  因为employee类里面已经重写了Compare方法，所以能成功的调用add方法添加进去
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);
        treeSet.add(employee5);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }



    @Test
    public void test3(){

        //  方式二、直接在MyDate里面实现Comparable接口，来实现排序功能
        //  使用Comparator的方式,按照生日的先后顺序排序，也可以直接在MyDate里面实现Comparable接口来实现排序，见MyDate类里面的实现
        Comparator comparator = new Comparator() {
            @Override
            //  Returns: a negative integer, zero, or a positive integer as the first argument is less than,
            //  equal to, or greater than the second.
            //  compare方法会传入两个形参：o1 - the first object to be compared.o2 - the second object to be compared.，
            //  返回值为负数，第一个参数小，返回值为0，相等；返回值为正数，第一个参数大
            public int compare(Object o1, Object o2) {
                //  1、首先判断传入的两个形参，是否为employee的对象
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    //  2、强转为Employee的对象
                    Employee employee1 = (Employee) o1;
                    Employee employee2 = (Employee) o2;
                    //  3、先获取对象的MyDate属性
                    MyDate d1 = employee1.getMyDate();
                    MyDate d2 = employee2.getMyDate();


                    //  这里就可以直接比较对象的MyDate属性
                    return d1.compareTo(d2);
                }
                throw new ClassCastException("传入参数有误！");
            }
        };

        TreeSet treeSet = new TreeSet(comparator);
        Employee employee1 = new Employee("liudehua", 55, new MyDate(1965, 6, 8));
        Employee employee2 = new Employee("zhangxueyou", 45, new MyDate(1975, 4, 4));
        Employee employee3 = new Employee("guofucheng", 65, new MyDate(1981, 8, 9));
        Employee employee4 = new Employee("liming", 45, new MyDate(1980, 8, 9));
        Employee employee5 = new Employee("zhoujielun", 55, new MyDate(1970, 10, 8));
        //  因为employee类里面已经重写了Compare方法，所以能成功的调用add方法添加进去
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);
        treeSet.add(employee5);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
