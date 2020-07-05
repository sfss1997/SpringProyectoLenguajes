package ucr.ac.cr.project;

public class AddRepliesPublicConsultationDTO {

    public int PublicConsultationId;
    public int StudentId;
    public int ProfessorId;
    public String Motive;
    public String DateTime;

    public AddRepliesPublicConsultationDTO() {
    }

    public AddRepliesPublicConsultationDTO(int publicConsultationId, int studentId, int professorId, String motive, String dateTime) {
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

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public int getProfessorId() {
        return ProfessorId;
    }

    public void setProfessorId(int professorId) {
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
