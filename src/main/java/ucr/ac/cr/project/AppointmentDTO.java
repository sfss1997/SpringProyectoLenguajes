package ucr.ac.cr.project;

public class AppointmentDTO {


    public int CourseId;
    public int StudentId;
    public int ProfessorId;
    public String Motive;
    public int Accepted;
    public String DateTime;

    public AppointmentDTO() {
    }

    public AppointmentDTO(int courseId, int studentId, int professorId, String motive, int accepted, String dateTime) {
        CourseId = courseId;
        StudentId = studentId;
        ProfessorId = professorId;
        Motive = motive;
        Accepted = accepted;
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

    public int getAccepted() {
        return Accepted;
    }

    public void setAccepted(int accepted) {
        Accepted = accepted;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }
}
