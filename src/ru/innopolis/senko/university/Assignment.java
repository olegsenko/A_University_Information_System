package ru.innopolis.senko.university;

import java.util.Date;

/**
 * Created by senko on 30.08.16.
 */
public class Assignment {

    private String task;
    private Date deadline;
    private int points;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
