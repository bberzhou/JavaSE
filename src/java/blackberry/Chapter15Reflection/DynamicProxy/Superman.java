package blackberry.Chapter15Reflection.DynamicProxy;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/8/21 12:22 AM
 * Create By IntelliJ IDEA
 */
public class Superman implements Human{

    @Override
    public String getBelief () {
        return "I believe i can fly";
    }

    @Override
    public void eat (String food) {
        System.out.println ("超人喜欢吃:"+food);
    }
}
