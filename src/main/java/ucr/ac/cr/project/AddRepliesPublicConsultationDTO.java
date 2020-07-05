package ucr.ac.cr.project;

public class AddRepliesPublicConsultationDTO {

    public int PublicConsultationId;
    public Integer StudentId;
    public Integer ProfessorId;
    public String Motive;
    public String DateTime;

    public AddRepliesPublicConsultationDTO() {
    }

<<<<<<< HEAD:src/main/java/ucr/ac/cr/project/AddRepliesPublicConsultationDTO.java
    public AddRepliesPublicConsultationDTO(int publicConsultationId, int studentId, int professorId, String motive, String dateTime) {
=======
    public AddRepliesPublicConsultationDAO(int publicConsultationId, Integer studentId, Integer professorId, String motive, String dateTime) {
>>>>>>> da74fa303a6957f33f0bd9605b18752b3917dc8b:src/main/java/ucr/ac/cr/project/AddRepliesPublicConsultationDAO.java
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
