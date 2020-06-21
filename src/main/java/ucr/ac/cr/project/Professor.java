package ucr.ac.cr.project;

import javax.persistence.*;

@Entity
@Table(name = "Professor")

public class Professor {

    private int Id;
    private String Name;
    private String Last_name;
    private String Mail;
    private int AcademicDegree_id;
    private String Image;
    private int Location_id;

    public Professor() {
    }

    public Professor(int id, String name, String last_name, String mail, int academicDegree_id, String image, int location_id) {
        Id = id;
        Name = name;
        Last_name = last_name;
        Mail = mail;
        AcademicDegree_id = academicDegree_id;
        Image = image;
        Location_id = location_id;
    }

    @Id
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public int getAcademicDegree_id() {
        return AcademicDegree_id;
    }

    public void setAcademicDegree_id(int academicDegree_id) {
        AcademicDegree_id = academicDegree_id;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public int getLocation_id() {
        return Location_id;
    }

    public void setLocation_id(int location_id) {
        Location_id = location_id;
    }
}
