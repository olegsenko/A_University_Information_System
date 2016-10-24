import java.util.Date;

/**
 * Created by senko on 30.08.16.
 */
public class Group {

    private String group;

    enum yearsOfBachelors {BS1, BS2, BS3, BS4};
    enum yearsOfMasters { MS1, MS2 }


    public Group(String course) {
        this.group = course;
    }


    public String getCourse() {
        return this.group;
    }

    public void setCourse(String course) {
        this.group = course;
    }


}
