package blackberry.day10.InterfaceTest3;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/31/20 07:02
 * Create By IntelliJ IDEA
 */
public class ComparableCircle extends Circle implements CompareObject {
    //  带参数的构造器
    public ComparableCircle (double radius) {
        super (radius);
    }

    /*
        ComparableCircle继承Circle类并且实现CompareObject接口,
        同时在ComparableCircle类里面给出compare的实现，用来比较两个圆的半径大小
     */
    @Override
    public int compare (Object o) {
        //  如果当前对象和o是同一个对象就是相等的
        if (this == o) {
            return 0;
        }
        //  如果不是，先判断o是不是ComparableCircle的实例
        if (o instanceof ComparableCircle) {
            //  是的就进行一个强转,因为传入的o实际上就是Circle对象
            ComparableCircle comparableCircle = (ComparableCircle) o;
            //  强转之后判断当前对象和传入对象的半径大小，并强转为int类型，不太合适，因为强转会有精度损失
            //  比如2.3 - 2.1 会返回0
//            return (int) (this.getRadius () - comparableCircle.getRadius ());
            if (this.getRadius () > comparableCircle.getRadius ()) {
                return 1;
            } else if (this.getRadius () < comparableCircle.getRadius ()) {
                return -1;
            } else {
                return 0;
            }

        } else {
            //  如果两个对象不同，传入的形参不对
            return 0;
        }
    }

}
