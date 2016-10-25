package ru.innopolis.senko.university;

import ru.innopolis.senko.university.humans.PrimaryInstructor;
import ru.innopolis.senko.university.humans.TeacherAssistant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class Subject {

    private String subjectName;
    private String description;
    private List<TeacherAssistant> teacherAssistants;
    private List<PrimaryInstructor> primaryInstructors;
    private Group course;
    private boolean isCore;//core or elective
    private List<Lection> lection;
    private List<Seminar> seminar;
    private List<Assignment> assignments;
    private FinalGrade finalGrade;


    public void addTeacherAssistant(TeacherAssistant teacherAssistant) {


        if (this.teacherAssistants == null) {
            this.teacherAssistants = new ArrayList<>();
        }
        this.teacherAssistants.add(teacherAssistant);

    }

    public void addPrimaryInstructor(PrimaryInstructor primaryInstructor) {


        if (this.primaryInstructors == null) {
            this.primaryInstructors = new ArrayList<>();
        }
        this.primaryInstructors.add(primaryInstructor);

    }


    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TeacherAssistant> getTeacherAssistant() {
        return teacherAssistants;
    }


    public List<PrimaryInstructor> getPrimaryInstructors() {
        return primaryInstructors;
    }

    public void setPrimaryInstructors(List<PrimaryInstructor> primaryInstructors) {
        this.primaryInstructors = primaryInstructors;
    }

    public Group getCourse() {
        return course;
    }

    public void setCourse(Group course) {
        this.course = course;
    }

    public boolean isCore() {
        return isCore;
    }

    public void setCore(boolean core) {
        isCore = core;
    }

    public List<Lection> getLection() {
        return lection;
    }

    public void setLection(List<Lection> lection) {
        this.lection = lection;
    }

    public List<Seminar> getSeminar() {
        return seminar;
    }

    public void setSeminar(List<Seminar> seminar) {
        this.seminar = seminar;
    }

    public FinalGrade getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(FinalGrade finalGrade) {
        this.finalGrade = finalGrade;
    }

    public void setTeacherAssistants(List<TeacherAssistant> teacherAssistants) {
        this.teacherAssistants = teacherAssistants;
    }

    public List<TeacherAssistant> getTeacherAssistants() {
        return teacherAssistants;
    }


}
