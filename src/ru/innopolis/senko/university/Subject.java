package ru.innopolis.senko.university;

import ru.innopolis.senko.university.humans.PrimaryInstructor;
import ru.innopolis.senko.university.humans.TeacherAssistant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class Subject {

    private String subjectName;//dmd dsa
    private String description;//data struct and algs
    //private List<TeacherAssistant> teacherAssistants;
    //private List<PrimaryInstructor> primaryInstructors;
    private Group course;
    private boolean isCore;//core or elective
    private List<Lection> lection;
    private List<Seminar> seminar;
    private List<Assignment> assignments;

    public Subject() {
    }

    public Subject(String dicription, String name) {
        this.subjectName = name;
        this.description = dicription;
    }
    //private FinalGrade finalGrade;

//
//    public void addTeacherAssistant(TeacherAssistant teacherAssistant) {
//
//
//        if (this.teacherAssistants == null) {
//            this.teacherAssistants = new ArrayList<>();
//        }
//        this.teacherAssistants.add(teacherAssistant);
//
//    }
//
    public void addLection(Lection l) {


        if (this.lection == null) {
            this.lection = new ArrayList<>();
        }
        this.lection.add(l);

    }

    public void addSeminar(Seminar s) {


        if (this.seminar == null) {
            this.seminar = new ArrayList<>();
    }
        this.seminar.add(s);

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

//    public List<TeacherAssistant> getTeacherAssistant() {
//        return teacherAssistants;
//    }
//
//
//    public List<PrimaryInstructor> getPrimaryInstructors() {
//        return primaryInstructors;
//    }
//
//    public void setPrimaryInstructors(List<PrimaryInstructor> primaryInstructors) {
//        this.primaryInstructors = primaryInstructors;
//    }

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

    public List<Lection> getLections() {
        if (this.lection == null){
            this.lection = new ArrayList<>();
        }
        return lection;
    }

    public void setLection(List<Lection> lection) {
        this.lection = lection;
    }

    public List<Seminar> getSeminars() {
        if (this.seminar == null){
            this.seminar = new ArrayList<>();
        }
        return seminar;
    }

    public void setSeminar(List<Seminar> seminar) {
        this.seminar = seminar;
    }

//    public FinalGrade getFinalGrade() {
//        return finalGrade;
//    }

//    public void setFinalGrade(FinalGrade finalGrade) {
//        this.finalGrade = finalGrade;
//    }

//    public void setTeacherAssistants(List<TeacherAssistant> teacherAssistants) {
//        this.teacherAssistants = teacherAssistants;
//    }
//
//    public List<TeacherAssistant> getTeacherAssistants() {
//        return teacherAssistants;
//    }


    public boolean equals(Subject that){
        if (this.subjectName.equals(that.subjectName) &&this.description.equals(that.description )){
            return true;
        }
        return false;
    }

}
