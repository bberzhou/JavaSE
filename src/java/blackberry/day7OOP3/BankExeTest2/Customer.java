package blackberry.day7OOP3.BankExeTest2;

/**
 * @Description: 客户类
 * @author: bberzhou@gmail.com
 * @date: 4/11/20 09:50
 * Create By IntelliJ IDEA
 */
public class Customer {
    private String firstName;
    private String lastName;
    //  在一个类的属性当中，使用另外一个类充当属性
    private Account account;

    public Customer (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName () {
        return this.firstName;
    }

    public String getLastName () {
        return this.lastName;
    }

    public Account getAccount () {
        return this.account;
    }

    public void setAccount (Account account) {
        this.account = account;
    }

}
