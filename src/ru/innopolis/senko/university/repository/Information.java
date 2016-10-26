package ru.innopolis.senko.university.repository;

import ru.innopolis.senko.university.Lection;
import ru.innopolis.senko.university.Seminar;
import ru.innopolis.senko.university.Subject;
import ru.innopolis.senko.university.University;
import ru.innopolis.senko.university.humans.PrimaryInstructor;
import ru.innopolis.senko.university.humans.TeacherAssistant;
import ru.innopolis.senko.university.schedule.TeachingDay;
import ru.innopolis.senko.university.schedule.TeachingWeek;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by senko on 25.10.16.
 */
public class Information {

    private List<String> lines;
    private int currentIndex = 0;

    private String getCurrentLine() {
        return lines.get(currentIndex);
    }

    private String getCurrentLineAndMoveNext() {
        String line = getCurrentLine();
        currentIndex++;
        return line;
    }

    public Information(University university) throws IOException {
        lines = Files.readAllLines(Paths.get("repository/data.txt"), StandardCharsets.UTF_8);
        TeachingWeek week = new TeachingWeek();

        TeachingDay d;
        for (; currentIndex < lines.size(); ) {
            String day = getCurrentLineAndMoveNext();
            while(true) {
                String line = getCurrentLineAndMoveNext();
                if (line is monday, tuesday...) {
                    break;
                }

            if (day.equals("Monday")) {
                day = getCurrentLineAndMoveNext();
                String[] tokens = line.split(" ");
                d = new TeachingDay();
                switch (tokens[2]) {
                    case "Monday":
                        week.setMonday(d);
                        break;
                    case "Truesday":
                        week.setTuesday(d);
                        continue;
                    case "Wednesday":
                        week.setWednesday(d);
                        continue;
                    case "Thursday":
                        week.setThursday(d);
                        continue;
                    case "Friday":
                        week.setFriday(d);
                        continue;
                    case "Saturday":
                        week.setSaturday(d);
                        continue;
                }

                if (tokens[2].equals("PI")) {
                    PrimaryInstructor p = new PrimaryInstructor(tokens[0], tokens[1]);
                    Lection l = new Lection();
                    l.setTime(tokens[3]);
                    l.setDescription(tokens[4]);
                    l.setRoomNo(tokens[5]);
                    l.setPrimaryInstructor(p);
                    l.setLectionCode(tokens[6]);
                    university.getPrimaryInstructors().add(p);
                    Subject s = findSubject(d, tokens[4], tokens[6]);
                    d.addSubject(s);
                    s.addLection(l);


                } else if (tokens[2].equals("TA")) {
                    TeacherAssistant t = new TeacherAssistant(tokens[0], tokens[1]);
                    Seminar s = new Seminar();
                    s.setTime(tokens[3]);
                    s.setDescription(tokens[4]);
                    s.setRoomNo(tokens[5]);
                    s.setTeacherAssistant(t);
                    s.setSeminarCode(tokens[6]);
                    university.getTeacherAssistants().add(t);
                    Subject subject = findSubject(d, tokens[4], tokens[6]);
                    d.addSubject(subject);
                    subject.addSeminar(s);

                }
            }}
            //     }while(line.equals("Monday"));


        }
        for (Subject s :
                week.getMonday().getSubjects()) {

            for (Lection l :
                    s.getLections()) {
                System.out.println(l.getDescription() + " " + l.getRoomNo() + " " + l.getTime());
            }

        }


//        for (Subject s :
//                d.getSubjects()) {
//            for (Lection l:
//                 s.getLections()) {
//               System.out.println( l.getDescription());
//
//            }
//
//        }
//
//        for (Subject s :
//                d.getSubjects()) {
//            for (Seminar sm:
//                    s.getSeminars()) {
//                System.out.println( sm.getDescription());
//
//            }
//
//        }
//        for (PrimaryInstructor p :
//                university.getPrimaryInstructors()) {
//            System.out.println(p.getName());
//        }
//
//        for (TeacherAssistant t :
//                university.getTeacherAssistants()) {
//            System.out.println(t.getName());
//        }


    }


    public Information() {
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
