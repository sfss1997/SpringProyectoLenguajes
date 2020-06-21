package ucr.ac.cr.project;

public class GetStudentByIdResult {

    private int Id;
    private String StudentCard;
    private String StudentName;
    private String LastName;
    private String Birthday;
    private String Mail;
    private String Image;
    private String RegistrationStatus;
    private String Province;
    private int Province_id;
    private String Canton;
    private int Canton_id;
    private String District;
    private int District_id;
    private String Username;
    private String Password;
    private String Status;
    private int Is_administrator;

    public GetStudentByIdResult() {
    }

    public GetStudentByIdResult(int id, String studentCard, String studentName, String lastName, String birthday, String mail, String image, String registrationStatus, String province, int province_id, String canton, int canton_id, String district, int district_id, String username, String password, String status, int is_administrator) {
        Id = id;
        StudentCard = studentCard;
        StudentName = studentName;
        LastName = lastName;
        Birthday = birthday;
        Mail = mail;
        Image = image;
        RegistrationStatus = registrationStatus;
        Province = province;
        Province_id = province_id;
        Canton = canton;
        Canton_id = canton_id;
        District = district;
        District_id = district_id;
        Username = username;
        Password = password;
        Status = status;
        Is_administrator = is_administrator;
    }

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

    public int getProvince_id() {
        return Province_id;
    }

    public void setProvince_id(int province_id) {
        Province_id = province_id;
    }

    public String getCanton() {
        return Canton;
    }

    public void setCanton(String canton) {
        Canton = canton;
    }

    public int getCanton_id() {
        return Canton_id;
    }

    public void setCanton_id(int canton_id) {
        Canton_id = canton_id;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getDistrict_id() {
        return District_id;
    }

    public void setDistrict_id(int district_id) {
        District_id = district_id;
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getIs_administrator() {
        return Is_administrator;
    }

    public void setIs_administrator(int is_administrator) {
        Is_administrator = is_administrator;
    }
}
