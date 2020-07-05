package ucr.ac.cr.project;

import javax.persistence.*;

@Entity
public class GetAppointmentResult {

    @Column (name = "Id")
    private int Id;
    @Column (name = "Course_id")
    private int Course_id;
    @Column (name = "Student_id")
    private int Student_id;
    @Column (name = "Date_time")
    private String DateTime;
    @Column (name = "Motive")
    private String  Motive;
    @Column (name = "Professor_id")
    private int Professor_id;
    @Column (name = "Accepted")
    private int Accepted;

    public GetAppointmentResult() {
    }

    public GetAppointmentResult(int id, int course_id, int student_id, String dateTime, String motive, int professor_id, int accepted) {
        Id = id;
        Course_id = course_id;
        Student_id = student_id;
        DateTime = dateTime;
        Motive = motive;
        Professor_id = professor_id;
        Accepted = accepted;
    }

    @Id
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

    public int getAccepted() {
        return Accepted;
    }

    public void setAccepted(int accepted) {
        Accepted = accepted;
    }
}
