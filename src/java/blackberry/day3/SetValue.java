package blackberry.day3;

/**
 * @author bberzhou@gmail.com
 * @date 3/22/20 16:54
 * Create By IntelliJ IDEA
 */
public class SetValue {
    public static void main (String[] args) {
        //  赋值符号
        int i1 = 10;
        int j1 = 10;

        //  连续赋值
        int i2 = 12, j2 = 12;

        //  +=
        int j3 = 9;
        j3 += 2;    // j3 = j3 +2
        System.out.println (j3);

        short s1 = 10;
//        s1 = s1 +2; 编译失败
        s1 += 2;    //  不会改变变量本身的数据类型
        System.out.println (s1);
        int n = 10;
        n += (n++) + (++n);//  n = n+(n++)+(++n)
        System.out.println (n);
    }
}
