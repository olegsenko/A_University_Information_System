import java.util.ArrayList;
import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class Subject {

    private String subjectName;
    private String description;
    private List<TeacherAssistant> teacherAssistants;
    private List<PrimaryInstructor> primaryInstructor;
    private Course course;
    private boolean isCore;//core or elective
    private List<Lection> lection;
    private List<Seminar> seminar;
    private Assignment assignment;
    private Grade grade;


    public void addTeacherAssistant(TeacherAssistant teacherAssistant) {


        if (this.teacherAssistants == null) {
            this.teacherAssistants = new ArrayList<>();
        }
        this.teacherAssistants.add(teacherAssistant);

    }

    public void addPrimaryInstructor(PrimaryInstructor primaryInstructor) {


        if (this.primaryInstructor == null) {
            this.primaryInstructor = new ArrayList<>();
        }
        this.primaryInstructor.add(primaryInstructor);

    }



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
        return teacherAssistants;
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
    public void setTeacherAssistants(List<TeacherAssistant> teacherAssistants) {
        this.teacherAssistants = teacherAssistants;
    }

    public List<TeacherAssistant> getTeacherAssistants() {
        return teacherAssistants;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }
}
