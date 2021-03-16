package blackberry.Chapter12Fanxing.UseGeneric;

import org.junit.Test;

import java.util.List;

public class CustomerDAOTest {
    /**
     *  测试：DAO
     */
    @Test
    public void test(){
        //  创建一个CustomerDAO的对象，这样就可以专门操作Customer类
        CustomerDAO customerDAO = new CustomerDAO();

        //  添加一个Customer
        customerDAO.add(new Customer());

        //  按照索引删除一个Customer
        customerDAO.remove(3);

        // 查询索引值小于多少的元素，返回的是一个List
        List<Customer> customerDAOForList = customerDAO.getForList(4);

        //  更新指定索引位置的元素
        customerDAO.update(3,new Customer());
    }
}
