import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class TeacherAssistant {
    private FullName taName;
    private List<Seminar> seminar;


    public FullName getTaName() {
        return taName;
    }

    public List<Seminar> getSeminar() {
        return seminar;
    }

    public void setTaName(FullName taName) {
        this.taName = taName;
    }

    public void setSeminar(List<Seminar> seminar) {
        this.seminar = seminar;
    }

}
