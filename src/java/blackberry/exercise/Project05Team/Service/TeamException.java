package blackberry.exercise.Project05Team.Service;

/**
 * @Description: 自定义异常类
 * @author: bberzhou@gmail.com
 * @date: 10/4/20 18:08
 * Create By IntelliJ IDEA
 */
public class TeamException extends Exception {
    /**
     * 继承自exception
     */
    //  序列号
    static final long serialVersionUID = -3387516993124229948L;

    public TeamException () {
        super ();
    }

    public TeamException (String msg) {
        //  调用父类的构造器
        super (msg);
    }
}
