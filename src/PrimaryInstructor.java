
import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class PrimaryInstructor extends Person{

    private List<Lection> lection;

    public List<Lection> getSeminar() {
        return lection;
    }

    public void setSeminar(List<Lection> seminar) {
        this.lection = seminar;
    }


}
