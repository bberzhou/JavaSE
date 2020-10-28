package blackberry.day1;

/**
 * @author bberzhou@gmail.com
 * @date 7/23/19 20:58
 * Create By IntelliJ IDEA
 */
public class TestBreak {
    public static void main (String[] args) {
        for (int i = 1 ; i < 10 ; i++) {
            //  break：使用在switch-case中或者循环中，表示结束当前循环（跳出）
            if (i % 4 == 0) {
//                break;

                // continue 使用在循环结构中表示，结束结束当前这次循环
                continue;
            }
            System.out.println (i);

        }
    }
}
