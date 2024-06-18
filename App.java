package SCHOOLMANAGEMENT;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Rama",5000);
        Teacher mellisa = new Teacher(2,"Ram",7000);
        Teacher vanderhorn = new Teacher(3,"Venu",6000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);


        Student tamannah = new Student(1,"Tamasha",4);
        Student rajesh= new Student(2,"Rakshith Vasudev",12);
        Student rakshitha = new Student(3,"Rabbi",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamannah);
        studentList.add(rajesh);
        studentList.add(rakshitha);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Meghana", 900);

        ghs.addTeacher(megan);


        tamannah.payFees(5000);
        rakshitha.payFees(6000);
        System.out.println("GHS has earned Rs "+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        +" and now has Rs " + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                +" and now has Rs " + ghs.getTotalMoneyEarned());


        System.out.println(rakshitha);

        mellisa.receiveSalary(mellisa.getSalary());

        System.out.println(mellisa);


    }
}
