package ru.innopolis.senko.university;

import ru.innopolis.senko.university.humans.TeacherAssistant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class Seminar {

    private String description;
    private String seminarCode;
    private TeacherAssistant teacherAssistant;
    private String time;
    private String roomNo;



    public Seminar(TeacherAssistant teacherAssistant) {
        this.teacherAssistant = teacherAssistant;
    }

    public Seminar() {

    }


    public String getTime() {

        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




    public String getSeminarCode() {
        return seminarCode;
    }

    public void setSeminarCode(String seminarCode) {
        this.seminarCode = seminarCode;
    }

    public void setTeacherAssistant(TeacherAssistant teacherAssistant) {
        this.teacherAssistant = teacherAssistant;
    }

    public TeacherAssistant getTeacherAssistant() {
        return teacherAssistant;
    }
}
