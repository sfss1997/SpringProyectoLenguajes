package ucr.ac.cr.project;

public class StudentStatusDAO {

    private int Id;
    private String RegistrationStatus;

    public StudentStatusDAO() {
    }

    public StudentStatusDAO(int id, String registrationStatus) {
        Id = id;
        RegistrationStatus = registrationStatus;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getRegistrationStatus() {
        return RegistrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        RegistrationStatus = registrationStatus;
    }
}
