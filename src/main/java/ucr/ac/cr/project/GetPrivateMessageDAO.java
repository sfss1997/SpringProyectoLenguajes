package ucr.ac.cr.project;

public class GetPrivateMessageDAO {

    public int CourseId;
    public int ProfessorId;

    public GetPrivateMessageDAO() {
    }

    public GetPrivateMessageDAO(int courseId, int professorId) {
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
