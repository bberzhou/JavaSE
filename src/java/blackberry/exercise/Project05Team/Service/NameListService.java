package blackberry.exercise.Project05Team.Service;

import blackberry.exercise.Project05Team.Domain.*;

import static blackberry.exercise.Project05Team.Service.Data.*;

/**
 * @Description: 此类负责将Data类中的数据封装到employee[]数组中，同时提供相关操作employee[]的方法
 * @author: bberzhou@gmail.com
 * @date: 10/4/20 16:51
 * Create By IntelliJ IDEA
 */
public class NameListService {
    /**
     * employees用来保存公司所有员工对象，
     * NameListService()构造器，
     * <p>
     * ，
     * Data类在service包里面
     */
    private Employee[] employees;

    //  空参构造器
    public NameListService () {
        /**
         * 给employees以及数组元素初始化
         * 1、根据项目提供的Data类构建相应大小的employees数组，
         * 2、再根据data类中的数据构建不同的对象，包括employee，programer，architect对象，以及相关联的
         *  equipment子类的对象
         * 3、将对象存于数组中
         */
        //  数组长度根据data数据长度确定
        employees = new Employee[EMPLOYEES.length];
        //  循环创建对象，但是需要注意创建的是employee 、programmer、Designer
        for (int i = 0 ; i < employees.length ; i++) {
            /*
              因为EMPLOYEES数组是string类型的，所以需要进行转换
                  int EMPLOYEE = 10;
                  int PROGRAMMER = 11;
                  int DESIGNER = 12;
                  int ARCHITECT = 13;

               type用于获取员工的类型
             */

            int type = Integer.parseInt (Data.EMPLOYEES[i][0]);
            //  每个员工都有id, name, age, salary这四个基本属性,就抽离出来
            int id = Integer.parseInt (EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt (EMPLOYEES[i][3]);
            double salary = Double.parseDouble (EMPLOYEES[i][4]);

            //  声明一个equipment、bonus、stock来保存不共有的属性
            Equipment equipment;
            double bonus;
            int stock;

            //  switch根据不同的type创建不同的对象
            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee (id, name, age, salary);
                    break;
                case PROGRAMMER:
                    //  因为programmer有装备，所以需要写一个方法来获取
                    equipment = createEquipment (i);
                    employees[i] = new Programmer (id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment (i);
                    bonus = Double.parseDouble (EMPLOYEES[i][5]);
                    employees[i] = new Designer (id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment (i);
                    bonus = Double.parseDouble (EMPLOYEES[i][5]);
                    stock = Integer.parseInt (EMPLOYEES[i][6]);
                    employees[i] = new Architect (id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }

    }

    /**
     * @return 返回一个equipment对象
     * @Author bberzhou@gmail.com
     * @Description 获取指定index上的员工设备
     * @Date 17:27 10/4/20
     * @Param 参数index表示第几个
     */

    private Equipment createEquipment (int index) {
        int type = Integer.parseInt (EQUIPMENTS[index][0]);
        switch (type) {
            case PC:
                //  如果数字是21，直接new一个PC并给属性赋值
                return new PC (EQUIPMENTS[index][1], EQUIPMENTS[index][2]);
            case NOTEBOOK:
                //  如果数字是22，直接new一个notebook并给属性赋值
                return new Notebook (EQUIPMENTS[index][1], Double.parseDouble (EQUIPMENTS[index][2]));
            case PRINTER:
                //  如果数字是23，直接new一个Print并给属性赋值
                return new Printer (EQUIPMENTS[index][1], EQUIPMENTS[index][2]);
        }
        return null;
    }

    //  获取当前status
//    private Status createStatus(int index){
//
//
//    }
    //  获取所有的employee，返回一个包含所有员工对象的数组
    public Employee[] getAllEmployees () {

        return employees;
    }

    //  获取指定id员工信息

    /**
     * @param id 指定员工的id
     * @return 指定员工对象
     * 异常：找不到指定的员工
     * 在service子包里面提供自定义异常类，TeamException
     */
    public Employee getEmployee (int id) throws TeamException {
        for (int i = 0 ; i < employees.length ; i++) {
            //  比较基本数据类型时可以用 == ，比较的是值，但是如果是两个对象的话比较的就是两个对象的地址值
            if (employees[i].getId () == id) {
                //  如果有，直接返回该员工对象
                return employees[i];
            }

        }
        throw new TeamException ("找不到指定id的员工");
    }
}
