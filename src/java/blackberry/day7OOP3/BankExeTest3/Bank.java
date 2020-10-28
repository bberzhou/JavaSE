package blackberry.day7OOP3.BankExeTest3;

/**
 * @Description: bank
 * @author: bberzhou@gmail.com
 * @date: 4/11/20 10:22
 * Create By IntelliJ IDEA
 */
public class Bank {
    //  customer类型的数组，一个银行可以存放多个客户
    private Customer[] customers;
    //  记录客户的个数
    private int numberOfCustomer;

    //  显式的无参构造器
    public Bank () {
        //  在创建Bank类的时候，需要对customers数组初始化一下或直接在customers显式的初始化
        customers = new Customer[10];
    }
    //  添加客户，按照(姓，名)构造一个新的Customer对象，然后把它放到customer数组中，还必须把numberOfCustomer 增加1

    public void addCustomer (String firstName, String lastName) {
        Customer cust = new Customer (firstName, lastName);
        //  将cust放入customers数组中时，就根据numberOfCustomer来确定位置
        customers[numberOfCustomer] = cust;
        //  将对象放进去之后，numberOfCustomer自增1
        numberOfCustomer++;
        //  上面两行 = customers[numberOfCustomers++] = cust;

    }

    //  获取customer的个数
    public int getNumberOfCustomer () {
        return numberOfCustomer;
    }

    //  获取指定位置上的客户
    public Customer getCustomer (int index) {
        //  根据index的值返回customers对应的数组，但是这样直接写不好，容易引起数组越界的问题
//        return customers[index];
        if (index >= 0 && index < numberOfCustomer) {
            return customers[index];
        }
        return null;
    }
}
