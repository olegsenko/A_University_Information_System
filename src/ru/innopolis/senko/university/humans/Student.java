package ru.innopolis.senko.university.humans;

import ru.innopolis.senko.university.Course;
import ru.innopolis.senko.university.Group;
import ru.innopolis.senko.university.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class Student extends Person {

    private int id;
    private Course course;//ms-1, ms-2
    private Group group;//group of students. e.g. msit-ssne

    public void setCourse(Course course) {
        this.course = course;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<Subject> subjects;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse(){
        return course.getCourseName()+group.getGroupCode();
    }

    public List<Subject> getSubjects(String subjectName) {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        subjects = subjects;
    }

    public void addSubject(Subject subject) {
        if (this.subjects == null)
            this.subjects = new ArrayList<>();
        this.subjects.add(subject);

    }
}

