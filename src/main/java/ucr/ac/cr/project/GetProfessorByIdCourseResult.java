package ucr.ac.cr.project;
import javax.persistence.*;

@Entity
public class GetProfessorByIdCourseResult {

    @Column (name = "Name")
    private String Name;
    @Column (name = "Last_name")
    private String Last_name;
    @Column (name = "Id")
    private int Id;

    public GetProfessorByIdCourseResult() {
    }

    public GetProfessorByIdCourseResult(String name, String last_name, int id) {
        Name = name;
        Last_name = last_name;
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    @Id
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
