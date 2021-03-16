package blackberry.Chapter12Fanxing.Exercise1;

import java.util.Collection;

public class DAOTest {
    /**
     *  测试DAO类：
     *
     */
    public static void main(String[] args){
        DAO<User> dao = new DAO<>();
        dao.save("1001",new User(11,30,"KK"));
        dao.save("1002",new User(12,20,"JJ"));
        dao.save("1003",new User(13,23,"LL"));
        dao.save("1004",new User(14,34,"PP"));
        dao.save("1005",new User(15,10,"QQ"));
        //  遍历元素输出,list方法返回的是value值，不含有key
        Collection<User> list = dao.list();
        for (Object o :
                list) {
            System.out.println(o);
        }
        // User{id=15, age=10, name='QQ'}
        //User{id=14, age=34, name='PP'}
        //User{id=13, age=23, name='LL'}
        //User{id=12, age=20, name='JJ'}
        //User{id=11, age=30, name='KK'}

        // 修改
        dao.update("1004",new User(20,90,"Kobe"));
        Collection<User> list1 = dao.list();
        for (Object o :
                list1) {
            System.out.println(o);
        }
        //User{id=15, age=10, name='QQ'}
        //User{id=20, age=90, name='Kobe'}
        //User{id=13, age=23, name='LL'}
        //User{id=12, age=20, name='JJ'}
        //User{id=11, age=30, name='KK'}
        //修改之后的输出结果

        //  删除操作
        dao.delete("1005");
    }
}
