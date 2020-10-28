package blackberry.day5Loop;

/**
 * @author bberzhou@gmail.com
 * @date 3/29/20 16:34
 * Create By IntelliJ IDEA
 */
public class BreakAndContinue {
    /*
        break和continue关键字的使用
                        使用范围                    循环中使用的作用        相同点
          break：        switch-case循环结构中        结束当前循环    关键字后面不能声明执行语句
          continue      循环结构中                    结束当次循环    关键字后面不能声明执行语句

          补充：带有标签的break和continue的使用

     */
    public static void main (String[] args) {
        for (int i = 0 ; i <= 10 ; i++) {
            if (i % 4 == 0) {
//                break;    // 输出123    ，后面全部结束
                continue;   //  输出 1235679 即是结束当前这次循环
//                System.out.println("hello");  无法输出

            }
            System.out.println (i);
        }


        la:
        for (int i = 0 ; i < 4 ; i++) {
            for (int j = 1 ; j <= 10 ; j++) {
                if (j % 4 == 0) {
                    //  break;默认跳出包裹此关键字的最近一层循环
//                    continue;
                    break la;// 结束指定标识符的一层循环
                }
                System.out.print (j);

            }
            System.out.println ();
        }
    }
}
