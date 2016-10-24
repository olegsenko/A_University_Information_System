
import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class PrimaryInstructor extends Person {

    private List<Lection> lection;

    public List<Lection> getLection() {
        return lection;
    }

    public void setLection(List<Lection> lection) {
        this.lection = lection;
    }

    public void addLection(Lection lection){
        this.lection.add(lection);

    }


}
