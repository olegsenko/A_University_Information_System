package ru.innopolis.senko.university.schedule;

import ru.innopolis.senko.university.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class TeachingDay {

    private List<Subject> subjects;

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addSubject(Subject subject) {


        if (this.subjects == null) {
            this.subjects = new ArrayList<>();
        }
        this.subjects.add(subject);
    }


}
