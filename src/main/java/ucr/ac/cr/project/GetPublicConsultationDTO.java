package ucr.ac.cr.project;

public class GetPublicConsultationDTO {

    private int CourseId;
    private int ProfessorId;

    public GetPublicConsultationDTO() {
    }

    public GetPublicConsultationDTO(int courseId, int professorId) {
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
