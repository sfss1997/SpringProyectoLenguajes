package ucr.ac.cr.project;

public class GetPublicConsultationDAO {

    private int CourseId;
    private int ProfessorId;

    public GetPublicConsultationDAO() {
    }

    public GetPublicConsultationDAO(int courseId, int professorId) {
        CourseId = courseId;
        ProfessorId = professorId;
    }

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public int getProfessorId() {
        return ProfessorId;
    }

    public void setProfessorId(int professorId) {
        ProfessorId = professorId;
    }
}
