package blackberry.Chapter11Collection.ListMethod;

public class IntroList {
    /**
     *  一、通常用list来代替数组，list集合类中元素有序、且可重复，集合中的每个元素都有其对应得顺序索引，
     *      list容器中得元素都对应一个整数型得序号记载其在容器中得位置，可以根据序号存取容器中得元素
     *      JDK中list接口得实现类常用得有：ArrayList、LinkedList和Vector
     *      List接口：存储有序的、可以重复的数据。   "动态数组"，避开脚标越界得异常
     *
     *     ｜--- Collection：是单列数据，定义了存取一组对象的方法的集合，单列集合框架结构
     *              ｜---List接口：存储有序的、可以重复的数据。   "动态数组"
     *                  ｜---ArrayList、
     *                  |---LinkedList、
     *                  |---Vector     具体实现类
     *     面试题：ArrayList、LinkedList和Vector这三者得异同点？
     *
     *     同：三个类都是实现了list接口，存储数据得特点相同：存储有序得、可重复得数据
     *     不同点：
     *      ｜---ArrayList：作为list接口得主要实现类，执行效率比较高，线程不安全的。底层使用Object[]数组存储
     *      |---LinkedList:对于频繁的插入、删除操作，使用此类效率比ArrayList高，底层使用的双向链表存储，查询效率比较低
     *      |---Vector：list得古老实现类，线程安全的，效率比较低。底层使用Object[]数组存储
     *
     *
     *  ArrayList和LinkedList的底层源码分析
     *      ArrayList在JDK7和JDK8有所不同:
     *        一、构造器：ArrayList list = new ArrayList()   //  底层创建了一个数组长度为10的Object数组，Object[] elementData
     *          (oldCapacity >> 1)，位运算符，右移一位相当于除以2，
     *          list.add(123)；// elementData[0] = new Integer(123);
     *          ...
     *          list.add(11);   // 如果此次的添加导致底层的elementData数组容量不够，则需要扩容，
     *                          默认情况下，扩容为原来的1.5倍，同时还需要将原来的数组中的数据复制到新的数组中。类似StringBuilder
     *           结论：建议开发中在大概知道数组长度时，使用带参的构造器，ArrayList list = new ArrayList(init capacity)，输入初始化数组容量
     *
     *
     *        二、JDK8中ArrayList的变化：
     *          ArrayList list = new ArrayList()   //  底层 Object[] elementData初始化为{}，并没有创建长度
     *          list.add(123);  // 第一次调用add()方法时，才会创建长度为10的数组，并且将数据添加到elementData[0]
     *          ..
     *          后续的操作没有区别
     *
     *        三、小结：
     *        JDK7里面就有点像是饿汉式，JDK8里面就类似懒汉式，延迟了数组的创建，比较节省内存
     *
     *
     *
     *
     *        LinkedList的源码分析：
     *
     *          一、
     *              LinkedList list = new LinkedList():内部声明了Node类型的first和last属性，默认值为null
     *              list.add(123);  //  将123封装到Node中，创建了node对象。
     *
     *              其中Node定义为：
     *                  private static class Node<E> {
     *                  体现了LinkedList的双向链表：
     *                      E item;
     *                      Node<E> next;
     *                      Node<E> prev;
     *
     *                          Node(Node<E> prev, E element, Node<E> next) {
     *                          this.item = element;
     *                          this.next = next;
     *                          this.prev = prev;
     *                          }
     *                         }
     *        比较：
     *              ArrayList和LinkedList的常用比较：
     *          	         ArrayList	LinkedList
     *      获取指定元素	        速度很快	    需要从头开始查找元素
     *      添加元素到末尾	       速度很快	    速度很快
     *      在指定位置添加/删除	   需要移动元素	不需要移动元素
     *      内存占用	               少	            较大
     *      通常情况下使用ArrayList较多
     *

     *
     *
     *
     *         Vector的源码分析，JDK７和JDK８中通过Vector()构造器创建对象时，底层都创建了长度为10的数组，
     *         在扩容方面，默认扩容为原来的数组长度的2倍。
     *
     *
     *
     *
     *
     *
     */
}
