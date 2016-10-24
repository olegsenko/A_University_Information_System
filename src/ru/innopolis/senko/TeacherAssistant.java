package ru.innopolis.senko;

import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class TeacherAssistant extends Person {

    private List<Seminar> seminar;

    public List<Seminar> getSeminar() {
        return seminar;
    }

    public void setSeminar(List<Seminar> seminar) {
        this.seminar = seminar;
    }

}
