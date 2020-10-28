package blackberry.day8OOP1.PolymorphicExecise;

/**
 * @Description: 毕业生
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 22:25
 * Create By IntelliJ IDEA
 */
public class Graduate extends Student {
    public String major = "IT";

    public String getInfo () {
        return "Name：" + name + "\t" + "age:" + age + "\t" + "school：" + school + "\t" + "major：" + major;
    }
}
