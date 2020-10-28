package blackberry.exercise.Project05Team.Domain;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 9/28/20 21:21
 * Create By IntelliJ IDEA
 */
public class PC implements Equipment {
    private String model;   //  机器型号
    private String display; //  显示器名称

    //  空参构造器

    public PC () {
    }

    //  带参构造器
    public PC (String model, String display) {
        this.model = model;
        this.display = display;
    }

    // set  get 方法

    public String getModel () {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public String getDisplay () {
        return display;
    }

    public void setDisplay (String display) {
        this.display = display;
    }

    //  重写接口的方法
    @Override
    public String getDescription () {
        return model + "(" + display + ")";
    }
    /**
     *  equipment 的具体实现类
     *
     */

}
