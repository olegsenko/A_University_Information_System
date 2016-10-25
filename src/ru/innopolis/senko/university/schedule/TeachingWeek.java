package ru.innopolis.senko.university.schedule;

/**
 * Created by senko on 31.08.16.
 */
public class TeachingWeek {

    private TeachingDay monday;
    private TeachingDay tuesday;
    private TeachingDay wednesday;
    private TeachingDay thursday;
    private TeachingDay friday;
    private TeachingDay saturday;

    public TeachingDay getMonday() {
        return monday;
    }

    public void setMonday(TeachingDay monday) {
        this.monday = monday;
    }

    public TeachingDay getTuesday() {
        return tuesday;
    }

    public void setTuesday(TeachingDay tuesday) {
        this.tuesday = tuesday;
    }

    public TeachingDay getWednesday() {
        return wednesday;
    }

    public void setWednesday(TeachingDay wednesday) {
        this.wednesday = wednesday;
    }

    public TeachingDay getThursday() {
        return thursday;
    }

    public void setThursday(TeachingDay thursday) {
        this.thursday = thursday;
    }

    public TeachingDay getFriday() {
        return friday;
    }

    public void setFriday(TeachingDay friday) {
        this.friday = friday;
    }

    public TeachingDay getSaturday() {
        return saturday;
    }

    public void setSaturday(TeachingDay saturday) {
        this.saturday = saturday;
    }
}
