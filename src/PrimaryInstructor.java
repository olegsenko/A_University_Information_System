import student.Subjects.*;

import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class PrimaryInstructor {
    private FullName taName;
    private List<Lection> lection;

    public FullName getTaName() {
        return taName;
    }

    public void setTaName(FullName taName) {
        this.taName = taName;
    }

    public List<Lection> getSeminar() {
        return lection;
    }

    public void setSeminar(List<Lection> seminar) {
        this.lection = seminar;
    }


}
