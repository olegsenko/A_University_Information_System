package ru.innopolis.senko;

import java.util.List;

/**
 * Created by senko on 25.10.16.
 */
public class Course {
    private List<Group> groups;
    private int courseYear;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }
}
