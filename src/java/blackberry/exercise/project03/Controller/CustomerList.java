package blackberry.exercise.project03.Controller;

import blackberry.exercise.project03.Bean.Customer;

/**
 * @Description: customerList为Customer对象的管理模块，内部用数组管理一组customer对象，
 * 并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
 * @author: bberzhou@gmail.com
 * @date: 4/12/20 11:32
 * Create By IntelliJ IDEA
 */
public class CustomerList {
    //  用来保存客户对象的数组
    private Customer[] customers;
    //  total 记录保存的客户对象的数量，
    private int total = 0;

    //  构造器，用来初始化customers数组，totalCustomer即是customers数组的长度 totalCustomer默认为0
    public CustomerList (int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * @return true：成功插入，false：插入失败
     * @Author bberzhou@gmail.com
     * @Description 将一个customer对象添加到数组中，成功返回true,失败返回false,此时表示数组已经满了
     * @Date 16:43 4/12/20
     * @Param customer：插入的对象
     */
    public boolean addCustomer (Customer customer) {
        //  先判断数组是否已经满了
        if (total >= customers.length) {
            //  return false 表示添加失败
            return false;
        } else {
            //  当total小于数组的长度时候，将customer，存入数组，index就是total，放入之后total自增1
//            customers[total++] = customer;
            this.customers[total] = customer;
            total++;
            //  返回true表示添加成功
            return true;
        }
    }

    /**
     * @return true:成功替换，false：替换失败，索引无效
     * @Author bberzhou@gmail.com
     * @Description 此方法用于修改指定位置的customer信息
     * @Date 16:39 4/12/20
     * @Param index, 需要替换的索引位置, cust 需要替换进去的customer对象
     */
    public boolean replaceCustomer (int index, Customer cust) {
        //  首先判断index是否合理，=total是因为，total位置还没有放入元素，即是下一个即将放入的元素
        if (index < 0 || index >= total) {
            //  表示操作失败
            return false;
        } else {
            customers[index] = cust;
            //  替换成功，返回true
            return true;
        }

    }

    /**
     * @return true:删除成功 false：删除失败
     * @Author bberzhou@gmail.com
     * @Description 删除指定位置上的元素
     * @Date 16:53 4/12/20
     * @Param index：需要删除的索引
     */
    public boolean deleteCustomer (int index) {
        if (index < 0 || index >= total) {
            //  首先判断index是否合法
            return false;
        } else {
            //  删除时，元素前移
            for (int i = index ; i < total - 1 ; i++) {
                customers[index] = customers[index + 1];
            }
            //  元素前移以后最后一个置为null
            customers[total - 1] = null;
            //  删除之后同时要把total-1
            total--;
//            customers[-- total] = null;   ,先total-1之后再 赋值total，与上面两行代码相同
            return true;
        }
    }

    //  获取所有的customer信息
    public Customer[] getAllCustomers () {
        //  重新返回一个customer对象数组
        Customer[] customers1 = new Customer[total];
        //  total = customers1.length
        for (int i = 0 ; i < total ; i++) {
            customers1[i] = customers[i];
        }
        //  最后返回customers1
        return customers1;
    }

    //  获取单个customer
    public Customer getCustomer (int index) {
        //  total值是下一个元素即将插入的位置，所以此时total位置也应该是为空
        if (index < 0 || index >= total) {
            return null;
        } else {
            //  找到元素返回一个对象
            return customers[index];
        }
    }

    /**
     * @return int型的值
     * @Author bberzhou@gmail.com
     * @Description 获取存储的客户的数量
     * @Date 17:07 4/12/20
     * @Param
     */
    public int getTotal () {
        return total;
        //  注意这里不是  return  customers.length,因为数组可能没有满
    }
}
