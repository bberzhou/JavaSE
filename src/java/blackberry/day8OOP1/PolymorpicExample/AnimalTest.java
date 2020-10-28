package blackberry.day8OOP1.PolymorpicExample;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 09:22
 * Create By IntelliJ IDEA
 */
public class AnimalTest {
    public static void main (String[] args) {
        //  多态性的一个利用场景，可以直接使用子类对象进行赋值，方便调用不同子类的方法
        AnimalTest animalTest = new AnimalTest ();
        animalTest.func (new Dog ());   //  Animal animal = new Dog()
        //  输出 狗吃骨头  汪汪汪！
        animalTest.func (new Cat ());   //  Animal animal = new Cat()
        //  猫吃鱼
        //  喵喵喵！

    }


    public void func (Animal animal) {
        animal.eat ();
        animal.shout ();
    }
}
