package blackberry.exercise.project03.View;

import blackberry.exercise.project03.Bean.Customer;
import blackberry.exercise.project03.Controller.CustomerList;
import blackberry.exercise.project03.Util.CMUtil;

/**
 * @Description: customerView主模块，负责菜单的显示和处理用户操作
 * @author: bberzhou@gmail.com
 * @date: 4/12/20 11:34
 * Create By IntelliJ IDEA
 */
public class CustomerView {
    //  创建一个长度为10的customer对象数组
    private CustomerList customerList = new CustomerList (10);

    /**
     * @return
     * @Author bberzhou@gmail.com
     * @Description 进入主页面的操作，显示客户信息管理软件界面
     * @Date 17:21 4/12/20
     * @Param
     */
    public void enterMainMenu () {
        boolean isFlag = true;
        //  因为选择了之后，还要显示主界面，所以需要多次的循环
        while (isFlag) {
            System.out.println ("--------------------客户信息管理软件--------------------");
            System.out.println ("                    1 添加客户");
            System.out.println ("                    2 修改客户");
            System.out.println ("                    3 删除客户");
            System.out.println ("                    4 客户列表");
            System.out.println ("                    5 退出系统");
            System.out.println ("                    请选择（1-5）:");
            System.out.println ();
            System.out.println ();
            //  在菜单里面调用CMutil类的readMenuSelection()方法，获取用户的选择
            char menu = CMUtil.readMenuSelection ();
            //  根据用户的选择执行不同的操作
            switch (menu) {
                case '1':
                    //  字符1，就是执行添加操作
                    addNewCustomer ();
                    break;
                case '2':
                    //  字符2，执行修改操作
                    modifyCustomer ();
                    break;
                case '3':
                    //  字符3 删除客户
                    deleteCustomer ();
                    break;
                case '4':
                    //  字符4 客户列表
                    listAllCustomer ();
                    break;
                case '5':
                    //  字符5 退出系统
//                    System.out.println("退出");
                    System.out.print ("确认是否退出系统(Y/N)：");
                    char choice = CMUtil.readConfirmSelection ();
                    //  这里只需要判断是否为Y ，当为Y时就修改flag为false，退出while循环，N不用判断
                    if (choice == 'Y') {
                        isFlag = false;
                    }
            }
        }
    }

    /**
     * @return
     * @Author bberzhou@gmail.com
     * @Description 添加客户的操作
     * @Date 17:20 4/12/20
     * @Param
     */
    private void addNewCustomer () {
//        System.out.println("添加客户的操作：");
//        Customer customer = new Customer ("刘亦菲",'女',34,"134634541","liu@eamil.com");
//        customerList.addCustomer (customer);
        System.out.println ("----------------------添加客户--------------------");
        System.out.print ("姓名：");
        //  从键盘读取姓名，并限制字符长度为10
        String name = CMUtil.readString (10);
        System.out.print ("性别：");
        char gender = CMUtil.readChar ();
        System.out.print ("年龄：");
        int age = CMUtil.readInt ();
        System.out.print ("电话：");
        String phone = CMUtil.readString (11);
        System.out.print ("邮箱：");
        String email = CMUtil.readString (20);
        Customer customer = new Customer (name, gender, age, phone, email);
        boolean isSuccess = customerList.addCustomer (customer);
        if (isSuccess) {
            System.out.println ("----------------------添加成功--------------------");
        } else {
            System.out.println ("-------------------客户已满，添加失败-------------------");
        }
    }

    /**
     * @return
     * @Author bberzhou@gmail.com
     * @Description 删除客户的操作
     * @Date 17:35 4/12/20
     * @Param
     */
    private void deleteCustomer () {
        System.out.println ("----------------------删除客户--------------------");
        //  需要删除的元素位置
        int index;
        for ( ; ; ) {
            System.out.println ("请选择需要删除客户的编号(-1退出)：");
            index = CMUtil.readInt ();
            // 当用户输入 -1时，直接return，退出当前的方法，回到主menu
//             if (index == -1){
//                 return;
//             }
            if (index <= 0 || index > customerList.getTotal ()) {
                System.out.println ("输入有误，请重新输入");
            } else {
                break;
            }
        }
        System.out.println ("确认是否删除(Y/N):");
        //  readConfirmSelection，调用此方法，返回用户输入的Y或N
        char isConfirm = CMUtil.readConfirmSelection ();
        if (isConfirm == 'Y') {
            boolean isDeleted = customerList.deleteCustomer (index - 1);
            if (isDeleted) {
                System.out.println ("----------------------删除成功--------------------");

            } else {
                System.out.println ("----------------------删除失败--------------------");

            }
        }
    }

    /**
     * @return
     * @Author bberzhou@gmail.com
     * @Description 修改客户的操作
     * @Date 17:21 4/12/20
     * @Param
     */
    private void modifyCustomer () {
        System.out.println ("----------------------修改客户--------------------");
        //  声明一个customer对象
        Customer cust;
        //  number为用户输入需要修改的位置
        int number;
        //  不知道明确的执行次数
        for ( ; ; ) {
            System.out.println ("请选择待修改的客户编号(-1退出)：");
            number = CMUtil.readInt ();
            if (number == -1) {
                //  当用户输入的是-1时，直接return，这样就会结束当前modifyCustomer()方法，并且继续回到menu界面
                return;
            }
            //  如果用户不退出可以用通过
            //  1，利用total来判断所找的元素，
            //  2，利用customerList.getCustomer(number)获取到的元素是否为null来判断，元素是否存在,数组的下标从0开始number需要减1
            cust = customerList.getCustomer (number - 1);
            if (cust == null) {
                System.out.println ("无法找到指定的客户!");
            } else {
                //  找到来对应的元素之后，直接跳出循环，继续执行后面的代码
                break;
            }
        }
        //  修改当前获取的对象信息
        System.out.print ("姓名（" + cust.getName () + "):");
        //  调用readString方法，如果用户没有输入信息，就返回当前的name，如果输入就返回用户输入的那个信息
        String name = CMUtil.readString (10, cust.getName ());
        System.out.print ("姓别（" + cust.getGender () + "):");
        char gender = CMUtil.readChar (cust.getGender ());
        System.out.print ("年龄（" + cust.getAge () + "):");
        int age = CMUtil.readInt (cust.getAge ());
        System.out.print ("电话（" + cust.getPhone () + "):");
        String phone = CMUtil.readString (12, cust.getPhone ());
        System.out.print ("邮箱（" + cust.getEmail () + "):");
        String email = CMUtil.readString (20, cust.getEmail ());
        Customer customerModify = new Customer (name, gender, age, phone, email);
        //  customerList.replaceCustomer（）替换掉指定位置的元素
        boolean isModified = customerList.replaceCustomer (number - 1, customerModify);
        if (isModified) {
            System.out.println ("----------------------修改成功--------------------");
        } else {
            System.out.println ("----------------------修改失败--------------------");
        }

    }

    /**
     * @return
     * @Author bberzhou@gmail.com
     * @Description 显示所有的客户的操作
     * @Date 17:21 4/12/20
     * @Param
     */
    private void listAllCustomer () {
//        System.out.println("显示客户列表的操作：");
        System.out.println ("------------------------------客户列表------------------------------");
        //在遍历customer数组之前，先判断里面是否有元素,即获取CustomerList的total属性
        int total = customerList.getTotal ();
        //  total为0时表示里面没有数据
        if (total == 0) {
            System.out.println ("没有客户记录！");
        } else {
            System.out.println ("编号\t\t姓名\t\t性别\t\t年龄\t\t\t电话\t\t\t\t邮箱");
            //  getAllCustomers返回一个customer对象数组,并不是长度为10的数组，而是返回的一个所有元素的新数组
            Customer[] customers = customerList.getAllCustomers ();
            for (int i = 0 ; i < customers.length ; i++) {
                System.out.println ((i + 1) + "\t\t" + customers[i].getName () + "\t\t" + customers[i].getGender () + "\t\t" + customers[i].getAge () + "\t\t" + customers[i].getPhone () + "\t\t" + customers[i].getEmail ());

            }

        }
        System.out.println ("----------------------------客户列表完成------------------------------");

    }

    public static void main (String[] args) {
        //  创建一个当前类的对象
        CustomerView customerView = new CustomerView ();
        //  调用类中的enterMainMenu()方法
        customerView.enterMainMenu ();
    }
}
