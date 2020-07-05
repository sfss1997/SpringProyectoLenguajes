package ucr.ac.cr.project;

public class ProfessorDTO {

    private int Id;
    private String Username;
    private String Password;
    private int IsAdministrator;
    private String Status;
    private String Name;
    private String LastName;
    private String Mail;
    private String Image;
    private int ProvinceId;
    private int CantonId;
    private int DistrictId;
    private int AcademicDegree;

    public ProfessorDTO() {
    }

    public ProfessorDTO(int id, String username, String password, int isAdministrator, String status, String name, String lastName, String mail, String image, int provinceId, int cantonId, int districtId, int academicDegree) {
        Id = id;
        Username = username;
        Password = password;
        IsAdministrator = isAdministrator;
        Status = status;
        Name = name;
        LastName = lastName;
        Mail = mail;
        Image = image;
        ProvinceId = provinceId;
        CantonId = cantonId;
        DistrictId = districtId;
        AcademicDegree = academicDegree;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public int getIsAdministrator() {
        return IsAdministrator;
    }

    public void setIsAdministrator(int isAdministrator) {
        IsAdministrator = isAdministrator;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
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

    public int getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(int provinceId) {
        ProvinceId = provinceId;
    }

    public int getCantonId() {
        return CantonId;
    }

    public void setCantonId(int cantonId) {
        CantonId = cantonId;
    }

    public int getDistrictId() {
        return DistrictId;
    }

    public void setDistrictId(int districtId) {
        DistrictId = districtId;
    }

    public int getAcademicDegree() {
        return AcademicDegree;
    }

    public void setAcademicDegree(int academicDegree) {
        AcademicDegree = academicDegree;
    }
}
