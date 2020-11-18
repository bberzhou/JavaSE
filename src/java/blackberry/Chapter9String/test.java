package blackberry.Chapter9String;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/15/20 19:52
 * Create By IntelliJ IDEA
 */
public class test<T> {
    private T a;
    public test(T a){
        this.a =a;
    }
    public void set(T a){
        this.a =a;
    }
    public T getA(){
        return a;
    }

    public static void main (String[] args) {
        test<Integer> integertest = new test<> (1);
        System.out.println(integertest.getClass ());
    }

}
