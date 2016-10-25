package ru.innopolis.senko.university;

import java.util.ArrayList;

/**
 * Created by senko on 30.08.16.
 */
public class FinalGrade {

    private int examGrade;
    private ArrayList<Assignment> assignments;
    private int midterm;

    public int getFinalGrade() {
        int temp = 0;
        for (Assignment a : assignments) {
            temp += a.getPoints();
        }
        return midterm + examGrade + temp;
    }


    public void setExamGrade(int exam) {
        this.examGrade = exam;
    }

    public void setAssignmentGrade(Assignment assignment) {
        if (this.assignments == null) {
            this.assignments = new ArrayList<>();
        }
        this.assignments.add(assignment);
    }

    public void setMidtermGrade(int midterm) {
        this.midterm = midterm;
    }
}
