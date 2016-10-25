package ru.innopolis.senko.university.repository;

import ru.innopolis.senko.university.University;
import ru.innopolis.senko.university.humans.PrimaryInstructor;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by senko on 25.10.16.
 */
public class Information {
    public Information(University university) throws IOException {
        List<String> lines;
        lines = Files.readAllLines(Paths.get("repository/data.txt"), StandardCharsets.UTF_8);
        for(String line: lines){
            String[] tokens = line.split(" ");
            university.getPrimaryInstructors().add(new PrimaryInstructor(tokens[1], tokens[0]));

        }
        for (PrimaryInstructor p :
                university.getPrimaryInstructors()) {
            System.out.println(p.getName());

        }


    }

    public Information() {

    }
}
