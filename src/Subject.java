import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class Subject {

    private String subjectName;
    private String description;
    private List<TeacherAssistant> teacherAssistant;
    private List<PrimaryInstructor> primaryInstructor;
    private Course course;
    private boolean isCore;//core or elective
    private List<Lection> lection;
    private List<Seminar> seminar;
    private Grade grade;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
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

    public void setTeacherAssistant(List<TeacherAssistant> teacherAssistant) {
        this.teacherAssistant = teacherAssistant;
    }

    public List<PrimaryInstructor> getPrimaryInstructor() {
        return primaryInstructor;
    }

    public void setPrimaryInstructor(List<PrimaryInstructor> primaryInstructor) {
        this.primaryInstructor = primaryInstructor;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public boolean isCore() {
        return isCore;
    }

    public void setCore(boolean core) {
        isCore = core;
    }

    public List<Lection> getLection() {
        return lection;
    }

    public void setLection(List<Lection> lection) {
        this.lection = lection;
    }

    public List<Seminar> getSeminar() {
        return seminar;
    }

    public void setSeminar(List<Seminar> seminar) {
        this.seminar = seminar;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
