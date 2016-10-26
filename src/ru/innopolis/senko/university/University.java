package ru.innopolis.senko.university;

import ru.innopolis.senko.university.humans.PrimaryInstructor;
import ru.innopolis.senko.university.humans.Student;
import ru.innopolis.senko.university.humans.TeacherAssistant;
import ru.innopolis.senko.university.schedule.TeachingSchedule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by senko on 31.08.16.
 */
public class University {

    public List <Course> courses;

    public List<PrimaryInstructor> primaryInstructors;

    private List<TeacherAssistant> teacherAssistants;

    private List<TeachingSchedule> schedule;


    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<PrimaryInstructor> getPrimaryInstructors() {
        if (primaryInstructors == null) {
            primaryInstructors = new ArrayList<>();
        }
        return primaryInstructors;
    }

    public void setPrimaryInstructors(List<PrimaryInstructor> primaryInstructors) {
        this.primaryInstructors = primaryInstructors;
    }

    public List<TeacherAssistant> getTeacherAssistants() {
        if (teacherAssistants == null){
            teacherAssistants = new ArrayList<>();
        }
        return teacherAssistants;
    }

    public void setTeacherAssistants(List<TeacherAssistant> teacherAssistants) {
        this.teacherAssistants = teacherAssistants;
    }

    public List<TeachingSchedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<TeachingSchedule> schedule) {
        this.schedule = schedule;
    }


}
