package blackberry.Chapter11Collection;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 3/8/21 09:55
 * Create By IntelliJ IDEA
 */
public class SetReview {
    /**
     *  Set集合复习：
     *      一、存储的数据特点：无序的、不可重复的元素
     *          具体的：以HashSet为例
     *         1、无序性不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加的，而是先hash之后再按照Hash值按存放的，由hash值决定的
     *         2、保证添加的元素按照equals()方法判断时候，不能返回true，即相同的元素的只能添加一个
     *
     *            二、Set添加元素的过程，以hashSet为例
     *      *          HashSet底层实际上一个数组，初始长度为16，添加元素a时，首先计算该元素a的hash值，
     *      *          即调用改元素a所属类的hashcode()方法进行计算的，此hash值接着通过某种算法计算出在HashSet底层数组中的存放位置（即为索引位置）
     *      *          判断此位置上是否已经有元素：
     *      *          如果此位置上没有其他元素，则元素a添加成功 1
     *      *          如果此位置上有其他元素b(或以链表形式存在的多个元素，则比较元素a与元素b的hash值，
     *      *              如果hash值相同的话，还需要调用该元素a所在类的equals()方法，
     *      *                  如果返回true，则表明两个元素完全一样，添加失败；
     *      *                  如果返回false,则表明两个元素不同，元素a添加成功2
     *      *              如果hash值不一样则直接使用hash散列的拉链法，加到前一个元素的后面3，（JDK７、８有点区别，７上八下，P５３５），
     *      *          (就是数据结构里面的散列冲突问题)
     *      *
     *      *          对于添加成功的情况2和3而言：元素a与已经存在指定索引位置上的数据以链表的方式存储
     *      *          JDK7：元素a放到数组中，指向原来的元素b
     *      *          JDK8：原来的元素放到数组中，指向元素a
     *      *
     *      *
     *      *        hashSet底层就是：数组+链表的结构
     *
     *
     *      三、常用方法：
     *            1、Set接口中没有额外定义新的方法，使用的都是Collection里面声明过的方法，
     *
     *
     *      四：常用的实现类：
     *          collection接口：单列集合，用来存储一个一个对象
     *              Set接口：存储无序的、不可重复的数据---->类似高中学的'集合'
     *                  HashSet:作为Set接口的主要实现类，线程不安全的，可以存储null值
     *                      linkedHashSet:作为HashSet的子类：遍历其内部数据的时候，可以按照添加的顺序遍历
     *                                      对于频繁的遍历操作，linkedHashSet效率高于HashSet。在添加数据的同时，每个数据还维护了两个引用，记录次=此数据的前一个和后一个数据
     *                  TreeSet：可以按照添加对象的指定熟悉进行排序
     *       五：
     *         2、要求：向Set(主要指HashSet、LinkedHashSet)中添加的数据其所在的类一定要重写hashCode()和 equals()方法
     *              要求：重写的hashCode()和 equals()方法一定要保持一致性：即相同的对象必须具有相等的散列码
     *              重写两个方法的小技巧：对象中用作equals()方法比较的filed,都应该用来计算hashcode
     *
     *        六：TreeSet的使用：
     *              1、在自然排序中，比较两个对象是否相同的标准为：CompareTo()返回0，不再是equals()
     *              2、定制排序中，比较两个对象是否相同的标注为：compare()返回0，不再是equals()
     *
     *             3、向TreeSet中添加的数据，要求是相同类的对象。
     *             4、两种排序方式：自然排序（实现comparable接口，和定制排序Comparator）
     *
     *
     *
     */
}
