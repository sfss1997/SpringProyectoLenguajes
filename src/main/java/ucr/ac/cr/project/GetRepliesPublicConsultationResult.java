package ucr.ac.cr.project;
import com.sun.istack.Nullable;

import javax.persistence.*;

@Entity
public class GetRepliesPublicConsultationResult {

    @Column (name = "Id")
    private int Id;
    @Column (name = "Public_consultation_id")
    private int PublicConsultation_id;
    @Column (name = "Student_id")
    @Nullable
    private Integer Student_id;
    @Column (name = "Date_time")
    private String DateTime;
    @Column (name = "Motive")
    private String Motive;
    @Column (name = "Professor_id")
    @Nullable
    private Integer Professor_id;

    public GetRepliesPublicConsultationResult() {
    }

    public GetRepliesPublicConsultationResult(int id, int publicConsultation_id, int student_id, String dateTime, String motive, Integer professor_id) {
        Id = id;
        PublicConsultation_id = publicConsultation_id;
        Student_id = student_id;
        DateTime = dateTime;
        Motive = motive;
        Professor_id = professor_id;
    }
    @Id
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPublicConsultation_id() {
        return PublicConsultation_id;
    }

    public void setPublicConsultation_id(int publicConsultation_id) {
        PublicConsultation_id = publicConsultation_id;
    }

    public Integer getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(Integer student_id) {
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

    public Integer getProfessor_id() {
        return Professor_id;
    }

    public void setProfessor_id(Integer professor_id) {
        Professor_id = professor_id;
    }
}
