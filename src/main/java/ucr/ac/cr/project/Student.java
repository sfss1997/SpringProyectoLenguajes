package ucr.ac.cr.project;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Student")


public class Student {


    private int Id;
    private String StudentCard;
    private String StudentName;
    private String LastName;
    private String Birthday;
    private String Mail;
    private String Image;
    private int LocationId;
    private String RegistrationStatus;
    private int CreatedBy;
    private Date CreateAt;
    private int UpdatedBy;
    private Date UpdatedAt;

    public Student() {

    }

    public Student(int id, String studentCard, String studentName, String lastName, String birthday, String mail, String image, int locationId, String registrationStatus, int createdBy, Date createAt, int updatedBy, Date updatedAt) {
        Id = id;
        StudentCard = studentCard;
        StudentName = studentName;
        LastName = lastName;
        Birthday = birthday;
        Mail = mail;
        Image = image;
        LocationId = locationId;
        RegistrationStatus = registrationStatus;
        CreatedBy = createdBy;
        CreateAt = createAt;
        UpdatedBy = updatedBy;
        UpdatedAt = updatedAt;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public int getLocationId() {
        return LocationId;
    }

    public void setLocationId(int locationId) {
        LocationId = locationId;
    }

    public String getRegistrationStatus() {
        return RegistrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        RegistrationStatus = registrationStatus;
    }

    public int getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(int createdBy) {
        CreatedBy = createdBy;
    }

    public Date getCreateAt() {
        return CreateAt;
    }

    public void setCreateAt(Date createAt) {
        CreateAt = createAt;
    }

    public int getUpdatedBy() {
        return UpdatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        UpdatedBy = updatedBy;
    }

    public Date getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        UpdatedAt = updatedAt;
    }
}
