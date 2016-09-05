/**
 * Created by senko on 30.08.16.
 */
public class Course {
    private String course;

    //TODO:
    public String[] yearsOfBachelors = {"BS1", "BS2", "BS3", "BS4"} ;
    public String[] yearsOfMasters = {"MS1", "MS2"};


    public Course(String course) {
        this.course = course;
    }


    public String getCourse(){
        return this.course;
    }

    public void setCourse(String course){
        this.course = course;
    }




}
