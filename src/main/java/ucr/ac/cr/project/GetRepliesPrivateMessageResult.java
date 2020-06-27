package ucr.ac.cr.project;

public class GetRepliesPrivateMessageResult {

    private int Id;
    private int PrivateMessage_id;
    private int Student_id;
    private String DateTime;
    private String Motive;
    private int Professor_id;

    public GetRepliesPrivateMessageResult() {
    }

    public GetRepliesPrivateMessageResult(int id, int privateMessage_id, int student_id, String dateTime, String motive, int professor_id) {
        Id = id;
        PrivateMessage_id = privateMessage_id;
        Student_id = student_id;
        DateTime = dateTime;
        Motive = motive;
        Professor_id = professor_id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPrivateMessage_id() {
        return PrivateMessage_id;
    }

    public void setPrivateMessage_id(int privateMessage_id) {
        PrivateMessage_id = privateMessage_id;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public String getMotive() {
        return Motive;
    }

    public void setMotive(String motive) {
        Motive = motive;
    }

    public int getProfessor_id() {
        return Professor_id;
    }

    public void setProfessor_id(int professor_id) {
        Professor_id = professor_id;
    }
}
