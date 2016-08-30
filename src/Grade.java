/**
 * Created by senko on 30.08.16.
 */
public class Grade {

    private String exam;
    private Assignment assignments;
    private String midterm;

    public String getFinalGrade() {
        return midterm+exam+assignments.getPoints();
    }


    public void setExam(String exam) {
        this.exam = exam;
    }

    public void setAssignments(Assignment assignments) {
        this.assignments = assignments;
    }

    public void setMidterm(String midterm) {
        this.midterm = midterm;
    }
}
