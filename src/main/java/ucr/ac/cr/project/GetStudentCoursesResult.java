package ucr.ac.cr.project;

public class GetStudentCoursesResult {
    private int Student_id;
    private String Initials;
    private int Course_id;
    private String CourseName;
    private int Credits;
    private int Cycle;
    private int Professor_id;
    private String Professor_name;
    private String Professor_lastname;

    public GetStudentCoursesResult() {
    }

    public GetStudentCoursesResult(int student_id, String initials, int course_id, String courseName, int credits, int cycle, int professor_id, String professor_name, String professor_lastname) {
        Student_id = student_id;
        Initials = initials;
        Course_id = course_id;
        CourseName = courseName;
        Credits = credits;
        Cycle = cycle;
        Professor_id = professor_id;
        Professor_name = professor_name;
        Professor_lastname = professor_lastname;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public String getInitials() {
        return Initials;
    }

    public void setInitials(String initials) {
        Initials = initials;
    }

    public int getCourse_id() {
        return Course_id;
    }

    public void setCourse_id(int course_id) {
        Course_id = course_id;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
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
