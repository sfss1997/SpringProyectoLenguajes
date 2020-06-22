package ucr.ac.cr.project;

public class StudentApprovalResult {

    private int Id;
    private String Student_card;
    private String Student_name;
    private String Last_name;
    private String Mail;

    public StudentApprovalResult() {
    }

    public StudentApprovalResult(int id, String student_card, String student_name, String last_name, String mail) {
        Id = id;
        Student_card = student_card;
        Student_name = student_name;
        Last_name = last_name;
        Mail = mail;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getStudent_card() {
        return Student_card;
    }

    public void setStudent_card(String student_card) {
        Student_card = student_card;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }
}