package ru.innopolis.senko;

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
        this.subjects.add(subject);
    }

}
