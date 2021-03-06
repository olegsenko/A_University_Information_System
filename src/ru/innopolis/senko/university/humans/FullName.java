package ru.innopolis.senko.university.humans;

import java.util.Scanner;

/**
 * Created by senko on 30.08.16.
 */
public class FullName {

    private String name;
    private String surname;


    public FullName() {
    }

    public String getName() {
        return name;
    }

    public void setName() {//name can be entered from console
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        this.name = in.nextLine();
        System.out.println("Enter surname");
        this.surname = in.nextLine();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public FullName(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String toString() {
        return this.surname + " " + this.name;
    }


}
