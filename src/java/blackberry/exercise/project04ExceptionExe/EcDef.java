package blackberry.exercise.project04ExceptionExe;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 9/28/20 20:01
 * Create By IntelliJ IDEA
 */
public class EcDef extends Exception {
    //  自定义异常类
    public EcDef () {

    }

    public EcDef (String msg) {
        super (msg);
    }
}
