package blackberry.day7OOP1;

/**
 * @author bberzhou@gmail.com
 * @date 8/28/19 10:34
 * Create By IntelliJ IDEA
 */
public class InertfaceRealize implements TestInterface {
    /*
        在Java中，一个类只能继承一个类，不能从多个类继承，但是一个类可以实现多个interface

     */

    @Override
    public void Show () {
        System.out.println ("hello，Show ,TestInterface");
    }

    @Override
    public void Run () {
        System.out.println ("InterfaceRealize run");
    }

    public static void main (String[] args) {
        TestInterface testInterface = new InertfaceRealize ();
        testInterface.Run ();
        testInterface.Show ();
    }
}
