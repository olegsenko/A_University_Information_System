package ru.innopolis.senko;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class Seminar {

    private String description;
    private String seminarCode;
    private List<TeacherAssistant> teacherAssistants;
    private String time;
    private String roomNo;

    public void setTeacherAssistant(List<TeacherAssistant> teacherAssistant) {
        this.teacherAssistants = teacherAssistant;
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

    public Seminar(String description, String seminarCode, TeacherAssistant teacherAssistant) {
        this.description = description;
        this.seminarCode = seminarCode;

        if (this.teacherAssistants == null) {
            this.teacherAssistants = new ArrayList<>();
        }
        this.teacherAssistants.add(teacherAssistant);
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

    public void setTeacherAssistant(TeacherAssistant teacherAssistant) {
        if (this.teacherAssistants == null) {
            this.teacherAssistants = new ArrayList<>();
        }
        this.teacherAssistants.add(teacherAssistant);
    }

    public String getSeminarCode() {
        return seminarCode;
    }

    public void setSeminarCode(String seminarCode) {
        this.seminarCode = seminarCode;
    }
}
