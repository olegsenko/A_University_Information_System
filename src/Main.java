/**
 * Created by senko on 30.08.16.
 */
public class Main {

    public static void main(String[] args) {


        University innopolis = new University();
        Student olegSenko = new Student();
        Student ivanIvanov = new Student();

        ivanIvanov.setName(new FullName("ivan", "ivanov"));

        olegSenko.setName(new FullName("Oleg", "Senko"));

        //System.out.println(olegSenko.getName().toString());

        innopolis.getStudents().add(olegSenko);
        innopolis.getStudents().add(ivanIvanov);


//        int i = 0;
//        while (innopolis.getStudents().get(i)){
//            System.out.println(innopolis.getStudents().get(++i).getName().toString());
//        }
        for (Student s :
                innopolis.getStudents()) {
            System.out.println(s.getName());
        }




    }
}
