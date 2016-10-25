package ru.innopolis.senko.university;

import java.util.List;

/**
 * Created by senko on 25.10.16.
 */
public class Course {


    private List<Group> groups;
    private int courseYear;

    enum CourseName {BS1, BS2, BS3, BS4, MS1, MS2}

    CourseName c;

    public Course(String courseName, int year) {

        this.courseYear = year;
        switch (courseName) {

            case "BS1":
                c = CourseName.BS1;
                break;
            case "BS2":
                c = CourseName.BS2;
                break;
            case "BS3":
                c = CourseName.BS3;
                break;
            case "BS4":
                c = CourseName.BS4;
                break;
            case "MS1":
                c = CourseName.MS1;
                break;
            case "MS2":
                c = CourseName.MS2;
                break;
            default:
                throw new ExceptionInInitializerError("wrong coursename");


        }
    }

    public String getCourseName() {
        return String.valueOf(courseYear) + " " + c ;
    }

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
