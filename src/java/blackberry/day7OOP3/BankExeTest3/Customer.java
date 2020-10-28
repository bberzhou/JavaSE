package blackberry.day7OOP3.BankExeTest3;

/**
 * @Description: customer
 * @author: bberzhou@gmail.com
 * @date: 4/11/20 10:22
 * Create By IntelliJ IDEA
 */
public class Customer {
    /*
        同一个包下不能命名同名的接口或者类
     */
    private String firstName;
    private String lastName;
    private Account account;

    //  有参构造器
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
