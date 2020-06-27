package ucr.ac.cr.project;

public class GetProfessorCoursesResult {

    private String Initials;
    private String Course_Name;
    private int Course_id;
    private int Cycle;
    private int Credits;
    private int Professor_id;
    private String Professor_name;
    private String Professor_lastname;


    public GetProfessorCoursesResult() {
    }

    public GetProfessorCoursesResult(String initials, String course_Name, int course_id, int cycle, int credits, int professor_id, String professor_name, String professor_lastname) {
        Initials = initials;
        Course_Name = course_Name;
        Course_id = course_id;
        Cycle = cycle;
        Credits = credits;
        Professor_id = professor_id;
        Professor_name = professor_name;
        Professor_lastname = professor_lastname;
    }

    public String getInitials() {
        return Initials;
    }

    public void setInitials(String initials) {
        Initials = initials;
    }

    public String getCourse_Name() {
        return Course_Name;
    }

    public void setCourse_Name(String course_Name) {
        Course_Name = course_Name;
    }

    public int getCourse_id() {
        return Course_id;
    }

    public void setCourse_id(int course_id) {
        Course_id = course_id;
    }

    public int getCycle() {
        return Cycle;
    }

    public void setCycle(int cycle) {
        Cycle = cycle;
    }

    public int getCredits() {
        return Credits;
    }

    public void setCredits(int credits) {
        Credits = credits;
    }

    public int getProfessor_id() {
        return Professor_id;
    }

    public void setProfessor_id(int professor_id) {
        Professor_id = professor_id;
    }

    public String getProfessor_name() {
        return Professor_name;
    }

    public void setProfessor_name(String professor_name) {
        Professor_name = professor_name;
    }

    public String getProfessor_lastname() {
        return Professor_lastname;
    }

    public void setProfessor_lastname(String professor_lastname) {
        Professor_lastname = professor_lastname;
    }
}
