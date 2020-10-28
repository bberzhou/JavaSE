package blackberry.exercise.Project05Team.Domain;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 9/28/20 21:28
 * Create By IntelliJ IDEA
 */
public class Printer implements Equipment {
    public String name;
    public String type;

    @Override
    public String getDescription () {
        return name + "(" + type + ")";
    }

    public Printer (String type) {
        this.type = type;
    }

    public Printer () {
    }

    public Printer (String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getType () {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }
}
