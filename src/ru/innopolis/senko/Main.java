package ru.innopolis.senko;

import ru.innopolis.senko.university.*;
import ru.innopolis.senko.university.humans.FullName;
import ru.innopolis.senko.university.humans.PrimaryInstructor;
import ru.innopolis.senko.university.humans.Student;
import ru.innopolis.senko.university.humans.TeacherAssistant;
import ru.innopolis.senko.university.repository.Information;

import java.io.IOException;

/**
 * Created by senko on 30.08.16.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        University innopolis = new University();




        Student olegSenko = new Student();
        olegSenko.setCourse(new Course("MS1", 2015));
        olegSenko.setGroup(new Group(" 4"));

        System.out.println(olegSenko.getCourse());
        Student ivanIvanov = new Student();
        TeacherAssistant alex_Tchitchigin = new TeacherAssistant();
        PrimaryInstructor eugene_Zouev = new PrimaryInstructor();

        Subject introToProg = new Subject();
        //Seminar iTP = new Seminar();


        introToProg.setSubjectName("Introduction to Programming");
        introToProg.getLections().add(new Lection(eugene_Zouev));
        introToProg.getSeminars().add(new Seminar(alex_Tchitchigin));


        //introToProg.getSeminars().add(ru.innopolis.senko.university.Seminar introToProg = new ru.innopolis.senko.university.Seminar("introduction To Programming", "ItP", alex_Tchitchigin ));
        //ru.innopolis.senko.university.Seminar introToProg = new ru.innopolis.senko.university.Seminar("introduction To Programming", "ItP", alex_Tchitchigin );

        eugene_Zouev.setName(new FullName("Eugene", "Zouev"));

        alex_Tchitchigin.setName(new FullName("Alex", "Tchitchigin"));

        ivanIvanov.setName(new FullName("ivan", "ivanov"));

        olegSenko.setName(new FullName("Oleg", "Senko"));


        //System.out.println(olegSenko.getName().toString());



       // innopolis.getStudents().add(olegSenko);
       // innopolis.getStudents().add(ivanIvanov);


//        for (Student s :
//                innopolis.getStudents()) {
//            System.out.println(s.getName());
//        }

        for (Seminar s :
                introToProg.getSeminars()) {
            System.out.println(s.getTeacherAssistant().getName());
        }

        for (PrimaryInstructor s :
                innopolis.getPrimaryInstructors()) {
            System.out.println(s.getName());
        }

        Information i = new Information(innopolis);


    }
}
