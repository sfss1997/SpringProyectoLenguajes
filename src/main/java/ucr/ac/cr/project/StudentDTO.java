package ucr.ac.cr.project;

public class StudentDTO {

    private int Id;
    private String Username;
    private String Password;
    private int IsAdministrator;
    private String Status;
    private String StudentCard;
    private String StudentName;
    private String LastName;
    private String Birthday;
    private String Mail;
    private String Image;
    private String RegistrationStatus;
    private int ProvinceId;
    private int CantonId;
    private int DistrictId;

    public StudentDTO() {
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
}
