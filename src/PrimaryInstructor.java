
import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class PrimaryInstructor {


    private FullName piName;
    private List<Lection> lection;

    public FullName Zouev() {
        return piName;
    }

    public void setPiName(FullName taName) {
        this.piName = taName;
    }

    public List<Lection> getSeminar() {
        return lection;
    }

    public void setSeminar(List<Lection> seminar) {
        this.lection = seminar;
    }

    public FullName getPiName() {
        return piName;
    }
}
