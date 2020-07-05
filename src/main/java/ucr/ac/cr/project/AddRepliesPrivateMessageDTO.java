package ucr.ac.cr.project;

public class AddRepliesPrivateMessageDTO {

    public int PrivateMessageId;
    public int StudentId;
    public int ProfessorId;
    public String Motive;
    public String DateTime;

    public AddRepliesPrivateMessageDTO() {
    }

    public AddRepliesPrivateMessageDTO(int privateMessageId, int studentId, int professorId, String motive, String dateTime) {
        PrivateMessageId = privateMessageId;
        StudentId = studentId;
        ProfessorId = professorId;
        Motive = motive;
        DateTime = dateTime;
    }

    public int getPrivateMessageId() {
        return PrivateMessageId;
    }

    public void setPrivateMessageId(int privateMessageId) {
        PrivateMessageId = privateMessageId;
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
