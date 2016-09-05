import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class Student extends Person{

    private String id;
    private Course year;
    public List<Subject> Subjects;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Course getYear() {
        return year;
    }

    public void setYear(Course year) {
        this.year = year;
    }

    public List<Subject> getSubjects(String subjectName) {
        return Subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        Subjects = subjects;
    }
}

