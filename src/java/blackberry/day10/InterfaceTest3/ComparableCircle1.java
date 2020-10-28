package blackberry.day10.InterfaceTest3;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/31/20 07:33
 * Create By IntelliJ IDEA
 */
public class ComparableCircle1 extends Circle1 implements CompareObject {
    //  当Circle1类里面的radius属性是包装类型的，可以直接调用包装类提供的方法
    @Override
    public int compare (Object o) {
        //   重写接口里面的方法
        if (this == o) {
            return 0;
        }
        if (o instanceof ComparableCircle1) {
            ComparableCircle1 comparableCircle1 = (ComparableCircle1) o;
            //  使用包装类Double里面的compareTo()方法比较两个对象的radius属性
            return this.getRadius ().compareTo (comparableCircle1.getRadius ());
        } else {
            return 0;
        }
    }
}
