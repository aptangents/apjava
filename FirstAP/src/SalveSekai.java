import java.util.List;

/**
 * Created by Jenny on 26/02/2017.
 */
public class SalveSekai {
    public static void main(String[] args)
    {
        Student student1 = new Student("Jenny", "Tan", 325378347, Grade.G9);

        Student student2 = new Student("Angela", "Ryoo", 333465786, Grade.G9);

        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastName());

        System.out.println(student2.getFirstName());
        System.out.println(student2.getLastName());

        System.out.println("Student1's teacher(s) is/are: " + student1.getTeachers());

        student1.setFirstName("Jennifer");
        System.out.println(student1.getFirstName());

        Teacher teacher1 = new Teacher ("Amy", "Chan", "Art");

        System.out.println(teacher1.getSubject_());

        teacher1.setSubject_("cyberarts");

        System.out.println(teacher1.getSubject_());

        student1.addTeacher(teacher1);

        System.out.println("Student1's teacher(s) is/are: " + student1.getTeachers());

        Teacher teacher2 = new Teacher ("Darcy", "King", "Math");

        student1.addTeacher(teacher2);

        System.out.println("Student1's teacher(s) is/are: " + student1.getTeachers());

        student2.addTeacher(teacher1);
        System.out.println("Student2's teacher(s) is/are: " + student2.getTeachers());

        List<Teacher> myTeachers = student1.getTeachers();
        System.out.println(student1 + " has " + myTeachers.size() + " teacher(s)");

        for(Teacher teacher: myTeachers)
        {
            System.out.println("Teacher " + teacher + " teaches me " + teacher.getSubject_());
        }

    }
}
