package ucr.ac.cr.project;

public class GetRepliesPublicConsultation {

    private int Id;
    private int PublicConsultation_id;
    private int Student_id;
    private String DateTime;
    private String Motive;
    private int Professor_id;

    public GetRepliesPublicConsultation() {
    }

    public GetRepliesPublicConsultation(int id, int publicConsultation_id, int student_id, String dateTime, String motive, int professor_id) {
        Id = id;
        PublicConsultation_id = publicConsultation_id;
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

    public int getPublicConsultation_id() {
        return PublicConsultation_id;
    }

    public void setPublicConsultation_id(int publicConsultation_id) {
        PublicConsultation_id = publicConsultation_id;
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
