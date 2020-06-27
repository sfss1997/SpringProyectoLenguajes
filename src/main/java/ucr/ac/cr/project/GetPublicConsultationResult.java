package ucr.ac.cr.project;

public class GetPublicConsultationResult {

    public int Id;
    public int Course_id;
    public int Student_id;
    public String DateTime;
    public String Motive;
    public int Professor_id;

    public GetPublicConsultationResult() {
    }

    public GetPublicConsultationResult(int id, int course_id, int student_id, String dateTime, String motive, int professor_id) {
        Id = id;
        Course_id = course_id;
        Student_id = student_id;
        DateTime = dateTime;
        Motive = motive;
        Professor_id = professor_id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getCourse_id() {
        return Course_id;
    }

    public void setCourse_id(int course_id) {
        Course_id = course_id;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public String getMotive() {
        return Motive;
    }

    public void setMotive(String motive) {
        Motive = motive;
    }

    public int getProfessor_id() {
        return Professor_id;
    }

    public void setProfessor_id(int professor_id) {
        Professor_id = professor_id;
    }
}
