import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class Lection {
    private String description;
    private String lectionCode;
    private List<PrimaryInstructor> primaryInstructor;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLectionCode() {
        return lectionCode;
    }

    public void setLectionCode(String lectionCode) {
        this.lectionCode = lectionCode;
    }

    public List<PrimaryInstructor> getPrimaryInstructor() {
        return primaryInstructor;
    }

    public void setPrimaryInstructor(List<PrimaryInstructor> primaryInstructor) {
        this.primaryInstructor = primaryInstructor;
    }
}