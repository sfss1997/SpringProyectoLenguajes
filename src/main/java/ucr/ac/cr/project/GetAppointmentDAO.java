package ucr.ac.cr.project;

public class GetAppointmentDAO {

    private int StudentId;
    private int ProfessorId;
    private int PublicConsultationId;

    public GetAppointmentDAO() {
    }

    public GetAppointmentDAO(int studentId, int professorId, int publicConsultationId) {
        StudentId = studentId;
        ProfessorId = professorId;
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

    public int getPublicConsultationId() {
        return PublicConsultationId;
    }

    public void setPublicConsultationId(int publicConsultationId) {
        PublicConsultationId = publicConsultationId;
    }
}
