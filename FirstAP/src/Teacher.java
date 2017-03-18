/**
 * Created by kattitrium on 3/17/2017.
 */
public class Teacher {
    private String firstName_;

    private String lastName_;

    private String subject_;

    public Teacher(String firstName_, String lastName_, String subject_) {
        this.firstName_ = firstName_;
        this.lastName_ = lastName_;
        this.subject_ = subject_;
    }

    public String getFirstName_() {
        return firstName_;
    }

    public String getLastName_() {
        return lastName_;
    }

    public String getSubject_() {
        return subject_;
    }

    public void setFirstName_(String firstName_) {
        this.firstName_ = firstName_;
    }

    public void setLastName_(String lastName_) {
        this.lastName_ = lastName_;
    }

    public void setSubject_(String subject_) {
        this.subject_ = subject_;
    }


    @Override
    public String toString() {
        return firstName_ + " " + lastName_;
    }
}
