package ucr.ac.cr.project;

public class PublicConsultationDAO {

    private int CourseId;
    private int StudentId;
    private int ProfessorId;
    private String Motive;
    private String DateTime;

    public PublicConsultationDAO() {
    }

    public PublicConsultationDAO(int courseId, int studentId, int professorId, String motive, String dateTime) {
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
