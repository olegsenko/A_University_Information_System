package ru.innopolis.senko.university.repository;

import ru.innopolis.senko.university.Subject;
import ru.innopolis.senko.university.University;
import ru.innopolis.senko.university.schedule.TeachingDay;
import ru.innopolis.senko.university.schedule.TeachingWeek;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.DayOfWeek;
import java.util.EnumSet;
import java.util.Scanner;

/**
 * Created by senko on 25.10.16.
 */
public class Information {
    public static final String REPOSITORY_DATA_TXT = "repository/data.txt";
    public static final String COMMA = ",";
    private EnumSet<DayOfWeek> allDays = EnumSet.allOf(DayOfWeek.class);
    private University university;

    public Information(University university) throws IOException {
        this.university = university;
    }

    public void init() throws IOException {
        try (Scanner scanner =
                     new Scanner(new FileInputStream(REPOSITORY_DATA_TXT))) {
            TeachingWeek week = new TeachingWeek();
            while (scanner.hasNextLine()) {
                String dayString = scanner.nextLine();
                TeachingDay day = new TeachingDay();
                switch (DayOfWeek.valueOf(dayString)) {
                    case MONDAY:
                        week.setMonday(day);
                        break;
                    case TUESDAY:
                        week.setTuesday(day);
                        break;
                    case WEDNESDAY:
                        week.setWednesday(day);
                        break;
                    case THURSDAY:
                        week.setThursday(day);
                        break;
                    case FRIDAY:
                        week.setFriday(day);
                        break;
                    case SATURDAY:
                        week.setSaturday(day);
                        break;
                }
                while (!hasNextDayOfWeek(scanner) && scanner.hasNextLine()) {
                    String notDay = scanner.nextLine();
                    String[] split = notDay.split(COMMA);

                    System.out.println("notday:" + notDay);
                }

            }
        }
    }

    private boolean hasNextDayOfWeek(Scanner scanner) {
        for (DayOfWeek day : allDays) {
            if (scanner.hasNext(day.name())) {
                return true;
            }
        }
        return false;
    }

    public Subject findSubject(TeachingDay d, String discrioption, String name) {
        for (Subject t :
                d.getSubjects()) {
            if (t.getDescription().equals(discrioption) && t.getSubjectName().equals(name)) {
                return t;
            }


        }
        return new Subject(discrioption, name);
    }
}
