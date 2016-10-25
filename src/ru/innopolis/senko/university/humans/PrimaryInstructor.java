package ru.innopolis.senko.university.humans;

import ru.innopolis.senko.university.Lection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by senko on 30.08.16.
 */
public class PrimaryInstructor extends Person {

    private List<Lection> lections;

    public PrimaryInstructor() {


    }

    public PrimaryInstructor(String name, String surname) {
        this.setName(new FullName(name, surname));

    }
    public List<Lection> getLections() {
        return lections;
    }

    public void setLections(List<Lection> lections) {
        this.lections = lections;
    }

    public void addLection(Lection lection) {
        if (this.lections == null) {
            this.lections = new ArrayList<>();
        }
        this.lections.add(lection);
    }


}
