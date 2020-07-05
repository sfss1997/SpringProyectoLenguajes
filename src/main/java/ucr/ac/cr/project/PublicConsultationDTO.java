package ucr.ac.cr.project;

public class PublicConsultationDTO {

    private int CourseId;
    private Integer StudentId;
    private Integer ProfessorId;
    private String Motive;
    private String DateTime;

    public PublicConsultationDTO() {
    }

<<<<<<< HEAD:src/main/java/ucr/ac/cr/project/PublicConsultationDTO.java
    public PublicConsultationDTO(int courseId, int studentId, int professorId, String motive, String dateTime) {
=======
    public PublicConsultationDAO(int courseId, Integer studentId, Integer professorId, String motive, String dateTime) {
>>>>>>> da74fa303a6957f33f0bd9605b18752b3917dc8b:src/main/java/ucr/ac/cr/project/PublicConsultationDAO.java
        CourseId = courseId;
        StudentId = studentId;
        ProfessorId = professorId;
        Motive = motive;
        DateTime = dateTime;
    }

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
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
