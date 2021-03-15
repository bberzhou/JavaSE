package blackberry.Chapter12Fanxing.UseGeneric;

import java.util.List;

/**
 *  DAO:data(base) access object
 */
public class DAO<T> {
    //  ORM：Object relation Mapping（对象关系映射）
    //  基本的操作数据库的一个类，因为在数据库里面有很多张表，但是每张表对应一个类
    //  为了方便对多个类进行CRUD操作，就把这些共性的操作写到一个类里面，再让具体操作某个类的来继承
    //  这样就需要使用到泛型，

    // 添加一条记录
    public void add(T t){};
    // 删除一条记录
    public boolean remove(int index){
        return false;
    };
    // 修改一条记录
    public void update(int index,T t){};
    // 查询一条记录,
    public T getIndex(int index){return null;}
    // 查询多条记录,查询索引小于多少的数据，返回一个List
    public List<T> getForList(int index){return null;};

}
