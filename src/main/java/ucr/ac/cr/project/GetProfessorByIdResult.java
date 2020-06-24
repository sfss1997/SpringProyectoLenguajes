package ucr.ac.cr.project;

import javax.persistence.*;

@Entity

public class GetProfessorByIdResult {
    public Integer Id;
    public String Name;
    public String LastName;
    public String Mail;
    public String Image;
    public String AcademicDegree;
    public Integer AcademicDegreeId;
    public String Province;
    public Integer ProvinceId;
    public String Canton;
    public Integer CantonId;
    public String District;
    public Integer DistrictId;
    public String Username;
    public String Password;
    public Integer IsAdministrator;
    public String Status;

    public GetProfessorByIdResult() {
    }

    public GetProfessorByIdResult(Integer id, String name, String lastName, String mail, String image, String academicDegree, Integer academicDegreeId, String province, Integer provinceId, String canton, Integer cantonId, String district, Integer districtId, String username, String password, Integer isAdministrator, String status) {
        Id = id;
        Name = name;
        LastName = lastName;
        Mail = mail;
        Image = image;
        AcademicDegree = academicDegree;
        AcademicDegreeId = academicDegreeId;
        Province = province;
        ProvinceId = provinceId;
        Canton = canton;
        CantonId = cantonId;
        District = district;
        DistrictId = districtId;
        Username = username;
        Password = password;
        IsAdministrator = isAdministrator;
        Status = status;
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

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
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

    public Integer getAcademicDegreeId() {
        return AcademicDegreeId;
    }

    public void setAcademicDegreeId(Integer academicDegreeId) {
        AcademicDegreeId = academicDegreeId;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public Integer getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(Integer provinceId) {
        ProvinceId = provinceId;
    }

    public String getCanton() {
        return Canton;
    }

    public void setCanton(String canton) {
        Canton = canton;
    }

    public Integer getCantonId() {
        return CantonId;
    }

    public void setCantonId(Integer cantonId) {
        CantonId = cantonId;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public Integer getDistrictId() {
        return DistrictId;
    }

    public void setDistrictId(Integer districtId) {
        DistrictId = districtId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getIsAdministrator() {
        return IsAdministrator;
    }

    public void setIsAdministrator(Integer isAdministrator) {
        IsAdministrator = isAdministrator;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
