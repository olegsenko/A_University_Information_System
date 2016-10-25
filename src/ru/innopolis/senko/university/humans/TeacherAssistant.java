package ru.innopolis.senko.university.humans;

import ru.innopolis.senko.university.Seminar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class TeacherAssistant extends Person {

    private List<Seminar> seminars;

    public List<Seminar> getSeminar() {
        return seminars;
    }

    public void setSeminars(List<Seminar> seminar) {
        this.seminars = seminar;
    }

    public void addSeminar(Seminar seminar) {
        if (this.seminars == null)
            this.seminars = new ArrayList<>();
        this.seminars.add(seminar);
    }


}
