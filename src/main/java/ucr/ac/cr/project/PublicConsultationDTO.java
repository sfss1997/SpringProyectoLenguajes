package ucr.ac.cr.project;

public class PublicConsultationDTO {

    private int CourseId;
    private Integer StudentId;
    private Integer ProfessorId;
    private String Motive;
    private String DateTime;

    public PublicConsultationDTO() {
    }



    public PublicConsultationDTO(int courseId, Integer studentId, Integer professorId, String motive, String dateTime) {

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
