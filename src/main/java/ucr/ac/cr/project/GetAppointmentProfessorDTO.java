package ucr.ac.cr.project;

public class GetAppointmentProfessorDTO {

    private int ProfessorId;
    private int CourseId;

    public GetAppointmentProfessorDTO() {
    }

    public GetAppointmentProfessorDTO(int professorId, int courseId) {
        ProfessorId = professorId;
        CourseId = courseId;
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
