package ucr.ac.cr.project;

public class AddRepliesPrivateMessageDTO {

    public int PrivateMessageId;
    public Integer StudentId;
    public Integer ProfessorId;
    public String Motive;
    public String DateTime;

    public AddRepliesPrivateMessageDTO() {
    }

    public AddRepliesPrivateMessageDTO(int privateMessageId, Integer studentId, Integer professorId, String motive, String dateTime) {
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
