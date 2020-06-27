package ucr.ac.cr.project;

public class GetAppointmentProfessorDAO {

    private int ProfessorId;
    private int PublicConsultationId;

    public GetAppointmentProfessorDAO() {
    }

    public GetAppointmentProfessorDAO(int professorId, int publicConsultationId) {
        ProfessorId = professorId;
        PublicConsultationId = publicConsultationId;
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
