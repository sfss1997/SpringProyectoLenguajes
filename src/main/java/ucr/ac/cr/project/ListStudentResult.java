package ucr.ac.cr.project;
import javax.persistence.*;

@Entity
public class ListStudentResult {

    @Column (name = "Id")
    private int Id;
    @Column (name = "Student_card")
    private String Student_card;
    @Column (name = "Student_name")
    private String Student_name;

    public ListStudentResult() {
    }

    public ListStudentResult(int id, String student_card, String student_name) {
        Id = id;
        Student_card = student_card;
        Student_name = student_name;
    }

    @Id
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getStudent_card() {
        return Student_card;
    }

    public void setStudent_card(String student_card) {
        Student_card = student_card;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }
}
