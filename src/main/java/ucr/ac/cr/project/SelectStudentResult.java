package ucr.ac.cr.project;

import javax.persistence.*;

@Entity
public class SelectStudentResult {

    @Column (name = "Id")
    private int Id;
    @Column (name = "StudentCard")
    private String StudentCard;
    @Column (name = "StudentName")
    private String StudentName;
    @Column (name = "LastName")
    private String LastName;
    @Column (name = "Birthday")
    private String Birthday;
    @Column (name = "Mail")
    private String Mail;
    @Column (name = "Image")
    private String Image;
    @Column (name = "RegistrationStatus")
    private String RegistrationStatus;
    @Column (name = "Province")
    private String Province;
    @Column (name = "Canton")
    private String Canton;
    @Column (name = "District")
    private String District;
    @Column (name = "Status")
    private String Status;
    @Column (name = "Is_Administrator")
    private int Is_Administrator;

    public SelectStudentResult() {
    }

    public SelectStudentResult(int id, String studentCard, String studentName, String lastName, String birthday, String mail, String image, String registrationStatus, String province, String canton, String district, String status, int is_Administrator) {
        Id = id;
        StudentCard = studentCard;
        StudentName = studentName;
        LastName = lastName;
        Birthday = birthday;
        Mail = mail;
        Image = image;
        RegistrationStatus = registrationStatus;
        Province = province;
        Canton = canton;
        District = district;
        Status = status;
        Is_Administrator = is_Administrator;
    }

    @Id
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getStudentCard() {
        return StudentCard;
    }

    public void setStudentCard(String studentCard) {
        StudentCard = studentCard;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getRegistrationStatus() {
        return RegistrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        RegistrationStatus = registrationStatus;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCanton() {
        return Canton;
    }

    public void setCanton(String canton) {
        Canton = canton;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getIs_Administrator() {
        return Is_Administrator;
    }

    public void setIs_Administrator(int is_Administrator) {
        Is_Administrator = is_Administrator;
    }
}
