import java.util.ArrayList;
import java.util.List;

/**
 * Created by kattitrium on 3/17/2017.
 */
public class Student {
    private String firstName_;

    private String lastName_;

    private int studentId_;

    private Grade grade_;

    private List<Teacher> teachers_ = new ArrayList<>();

    public Student(String firstName, String lastName, int studentId, Grade grade) {
        firstName_ = firstName;
        lastName_ = lastName;
        studentId_ = studentId;
        grade_ = grade;
    }

    public void setFirstName(String firstName) {
        firstName_ = firstName;
    }

    public void setLastName(String lastName) {
        lastName_ = lastName;
    }

    public void setGrade(Grade grade) {
        grade = grade;
    }

    public String getFirstName() {
        return firstName_;
    }

    public String getLastName() {
        return lastName_;
    }

    public int getStudentId() {
        return studentId_;
    }

    public Grade getGrade() {
        return grade_;
    }

    public List<Teacher> getTeachers() {
        return teachers_;
    }

    public void addTeacher(Teacher teacher)
    {
        teachers_.add(teacher);
    }

    @Override
    public String toString() {
        return firstName_ + " " + lastName_;
    }
}
