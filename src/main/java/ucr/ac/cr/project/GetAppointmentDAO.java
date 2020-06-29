package ucr.ac.cr.project;

public class GetAppointmentDAO {

    private int StudentId;
    private int ProfessorId;
    private int CourseId;

    public GetAppointmentDAO() {
    }

    public GetAppointmentDAO(int studentId, int professorId, int courseId) {
        StudentId = studentId;
        ProfessorId = professorId;
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

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }
}
