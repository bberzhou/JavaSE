package blackberry.day5;

/**
 * @author bberzhou@gmail.com
 * @date 7/23/19 08:38
 * Create By IntelliJ IDEA
 */
public class Dog {
    int dogAge;

    public int getDogAge () {

        return dogAge;
    }

    public void setDogAge (int age) {
        dogAge = age;
    }

    public static void main (String[] args) {
        Dog dog1 = new Dog ();
        dog1.setDogAge (20);
        System.out.println (dog1.getDogAge ());
    }
}