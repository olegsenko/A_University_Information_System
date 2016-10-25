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

    private List<Student> students;

    public List<PrimaryInstructor> primaryInstructors;

    private List<TeacherAssistant> teacherAssistants;

    private List<TeachingSchedule> schedule;

    public List<Student> getStudents() {
        if (students == null) {
            students = new ArrayList<>();
        }
        return students;
    }


    public void setStudents(List<Student> students) {
        this.students = students;
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

    public String toString() {
        return students.toString();
    }

}
