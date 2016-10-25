package ru.innopolis.senko.university.schedule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by senko on 31.08.16.
 */
public class TeachingSchedule {

    private List<TeachingWeek> teachingWeeks;

    public List<TeachingWeek> getTeachingWeek() {
        return teachingWeeks;
    }

    public void setTeachingWeek(List<TeachingWeek> teachingWeek) {
        this.teachingWeeks = teachingWeek;
    }

    public void addTeachingWeek (TeachingWeek teachingWeek){
        if (this.teachingWeeks == null){
            this.teachingWeeks = new ArrayList<>();
        }
        teachingWeeks.add(teachingWeek);
    }
}
