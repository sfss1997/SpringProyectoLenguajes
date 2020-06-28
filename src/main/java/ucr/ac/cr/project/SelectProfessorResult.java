package ucr.ac.cr.project;

import javax.persistence.*;


@Entity
public class SelectProfessorResult {

    @Column (name = "Id")
    private Integer Id;
    @Column (name = "Name")
    private String Name;
    @Column (name = "Last_name")
    private String Last_name;
    @Column (name = "Mail")
    private String Mail;
    @Column (name = "Image")
    private String Image;
    @Column (name = "AcademicDegree")
    private String AcademicDegree;
    @Column (name = "Province")
    private String Province;
    @Column (name = "Canton")
    private String Canton;
    @Column (name = "District")
    private String District;

    public SelectProfessorResult() {
    }

    public SelectProfessorResult(Integer id, String name, String last_name, String mail, String image, String academicDegree, String province, String canton, String district) {
        Id = id;
        Name = name;
        Last_name = last_name;
        Mail = mail;
        Image = image;
        AcademicDegree = academicDegree;
        Province = province;
        Canton = canton;
        District = district;
    }

    @Id
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
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

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getAcademicDegree() {
        return AcademicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        AcademicDegree = academicDegree;
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
}

