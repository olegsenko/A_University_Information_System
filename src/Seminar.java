/**
 * Created by senko on 30.08.16.
 */
public class Seminar {
    private String name;
    private teacherAssistant TA;

    public Seminar(String name, teacherAssistant TA) {
        this.name = name;
        this.TA = TA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public teacherAssistant getTA() {
        return TA;
    }

    public void setTA(teacherAssistant TA) {
        this.TA = TA;
    }
}
