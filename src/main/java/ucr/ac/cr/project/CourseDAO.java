package ucr.ac.cr.project;

public class CourseDAO {

    private int Id;
    private String Initials;
    private String Name;
    private int IsActive;
    private int Credits;
    private int Cycle;

    public CourseDAO() {
    }

    public CourseDAO(int id, String initials, String name, int isActive, int credits, int cycle) {
        Id = id;
        Initials = initials;
        Name = name;
        IsActive = isActive;
        Credits = credits;
        Cycle = cycle;
    }

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

    public int getIsActive() {
        return IsActive;
    }

    public void setIsActive(int isActive) {
        IsActive = isActive;
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
