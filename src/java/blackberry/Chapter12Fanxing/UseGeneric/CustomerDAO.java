package blackberry.Chapter12Fanxing.UseGeneric;

public class CustomerDAO extends DAO<Customer> {
    //  这个CustomerDAO就是专门用来操作Customer类的，
    //  并且让他继承DAO类，同时指定泛型为Customer
    //  这个DAO就是只能操作某个表的DAO

    @Override
    public void add(Customer customer) {
        super.add(customer);
    }

}
