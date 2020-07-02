package ucr.ac.cr.project;

public class AddRepliesPublicConsultationDAO {

    public int PublicConsultationId;
    public Integer StudentId;
    public Integer ProfessorId;
    public String Motive;
    public String DateTime;

    public AddRepliesPublicConsultationDAO() {
    }

    public AddRepliesPublicConsultationDAO(int publicConsultationId, Integer studentId, Integer professorId, String motive, String dateTime) {
        PublicConsultationId = publicConsultationId;
        StudentId = studentId;
        ProfessorId = professorId;
        Motive = motive;
        DateTime = dateTime;
    }

    public int getPublicConsultationId() {
        return PublicConsultationId;
    }

    public void setPublicConsultationId(int publicConsultationId) {
        PublicConsultationId = publicConsultationId;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public Integer getProfessorId() {
        return ProfessorId;
    }

    public void setProfessorId(Integer professorId) {
        ProfessorId = professorId;
    }

    public String getMotive() {
        return Motive;
    }

    public void setMotive(String motive) {
        Motive = motive;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }
}
