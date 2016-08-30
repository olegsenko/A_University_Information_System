import java.util.Scanner;

/**
 * Created by senko on 30.08.16.
 */
public class FullName {

    private String name;
    private String surname;
    Scanner in = new Scanner(System.in);


    public FullName(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getFullName (){
        return this.surname + " " + this.name;
    }



}
