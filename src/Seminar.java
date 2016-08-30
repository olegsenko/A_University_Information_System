import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class Seminar {
    private String description;
    private String seminarCode;
    private List<TeacherAssistant> teacherAssistant;

    public Seminar(String name, List<TeacherAssistant> TA) {
        this.description = name;
        this.teacherAssistant = TA;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TeacherAssistant> getTeacherAssistant() {
        return teacherAssistant;
    }

    public void setTeacherAssistant(TeacherAssistant teacherAssistant) {
        this.teacherAssistant = (List<TeacherAssistant>)teacherAssistant;
    }

    public String getSeminarCode() {
        return seminarCode;
    }

    public void setSeminarCode(String seminarCode) {
        this.seminarCode = seminarCode;
    }
}
