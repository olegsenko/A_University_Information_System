/**
 * Created by senko on 30.08.16.
 */
public class Main {

    public static void main(String[] args) {


        University innopolis = new University();

        Student olegSenko = new Student();
        Student ivanIvanov = new Student();
        TeacherAssistant alex_Tchitchigin = new TeacherAssistant();
        PrimaryInstructor eugene_Zouev = new PrimaryInstructor();

        Subject introToProg = new Subject();

        introToProg.setSubjectName("Introduction to Programming");
        introToProg.addTeacherAssistant(alex_Tchitchigin);
        introToProg.addPrimaryInstructor(eugene_Zouev);

        //introToProg.getSeminar().add(Seminar introToProg = new Seminar("introduction To Programming", "ItP", alex_Tchitchigin ));
        //Seminar introToProg = new Seminar("introduction To Programming", "ItP", alex_Tchitchigin );

        eugene_Zouev.setPiName(new FullName("Eugene", "Zouev"));

        alex_Tchitchigin.setTaName(new FullName("Alex", "Tchitchigin"));

        ivanIvanov.setName(new FullName("ivan", "ivanov"));

        olegSenko.setName(new FullName("Oleg", "Senko"));

        //System.out.println(olegSenko.getName().toString());

        innopolis.getStudents().add(olegSenko);
        innopolis.getStudents().add(ivanIvanov);


        for (Student s :
                innopolis.getStudents()) {
            System.out.println(s.getName());
        }

        for (TeacherAssistant s :
                introToProg.getTeacherAssistant()) {
            System.out.println(s.getTaName());
        }

        for (PrimaryInstructor s :
                introToProg.getPrimaryInstructor()) {
            System.out.println(s.getPiName());
        }





    }
}
