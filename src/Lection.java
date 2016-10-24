import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class Lection {

    private String description;
    private String lectionCode;
    private PrimaryInstructor primaryInstructor;
    private String time;
    private String roomNo;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
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

    public PrimaryInstructor getPrimaryInstructor() {
        return primaryInstructor;
    }

    public void setPrimaryInstructor(PrimaryInstructor primaryInstructor) {
        this.primaryInstructor = primaryInstructor;
    }
}
