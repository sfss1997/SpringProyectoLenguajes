package ucr.ac.cr.project;
import javax.persistence.*;

@Entity
@Table(name = "Course")

public class Course {

    private int Id;
    private String Initials;
    private String Name;
    private int Is_active;
    private int Credits;
    private int Cycle;

    public Course() {
    }

    public Course(int id, String initials, String name, int is_active, int credits, int cycle) {
        Id = id;
        Initials = initials;
        Name = name;
        Is_active = is_active;
        Credits = credits;
        Cycle = cycle;
    }

    @Id
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getInitials() {
        return Initials;
    }

    public void setInitials(String initials) {
        Initials = initials;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getIs_active() {
        return Is_active;
    }

    public void setIs_active(int is_active) {
        Is_active = is_active;
    }

    public int getCredits() {
        return Credits;
    }

    public void setCredits(int credits) {
        Credits = credits;
    }

    public int getCycle() {
        return Cycle;
    }

    public void setCycle(int cycle) {
        Cycle = cycle;
    }
}
