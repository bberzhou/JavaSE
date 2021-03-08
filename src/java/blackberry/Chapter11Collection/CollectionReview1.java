package blackberry.Chapter11Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 3/8/21 08:44
 * Create By IntelliJ IDEA
 */
public class CollectionReview1 {
    /**
     *  1、Collection接口的常用方法：
     *      add(Object obj)、addAll(collection coll)：将另外一个集合添加进去、size()：元素个数,isEmpty()、clear()
     *      remove(Object obj)：移除某个元素 、removeAll(Collection all)：移除当前集合中另外一个集合中的元素，相当于差集、
     *      contains(Object obj)：包含某个元素、
     *      containsAll(Collection coll)：包含另外一个集合中的元素、
     *      retainsAll(Collection coll):求两个集合共有的元素，即求交集
     *      equals(Object obj)：
     *      hashcode()
     *      toArray()
     *      Iterator()
     *
     *
     *   2、使用Collection集合存储对象，要求对象所属的类满足：
     *        向Collection接口的实现类的对象中添加数据obj时，要求obj所在的类要重写equals()方法
     *
     *   3、collection集合和数组之间的相互转换
     *          集合-----》数组:toArray()
     *
     *          数组----->集合：调用Arrays类的静态方法asList()
     *
     *
     *
     *    4、遍历Collection的两种方式：
     *      a:使用迭代器Iterator遍历集合Collection元素
     *      b:foreach
     *      c：for循环
     *
     *
     *    5、remove()的使用
     *      测试Iterator中的remove()，
     *      如果还没调用next(),或在上一次调用next方法之后已经调用了remove方法，再次调用remove都会报IllegalStateException.
     *      内部定义了remove(),可以在遍历的时候，删除集合中的元素，此方法不同于集合直接调用remove()
     *
     *
     */

    @Test
    public void test1(){
        Collection collection = new ArrayList ();
        collection.add (123);
        collection.add (343);
        collection.add (233);
        collection.add (888);
        //  集合在遍历的时候，也可以直接调用forEach()方法，因为Collection集合实现了iterator方法
        //  System.out::print：这个是方法引用
        collection.forEach (System.out::print);
    }
}
