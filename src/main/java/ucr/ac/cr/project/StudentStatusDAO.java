package ucr.ac.cr.project;

public class StudentStatusDAO {

    private int Id;
    private int RegistrationStatus;

    public StudentStatusDAO() {
    }

    public StudentStatusDAO(int id, int registrationStatus) {
        Id = id;
        RegistrationStatus = registrationStatus;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getRegistrationStatus() {
        return RegistrationStatus;
    }

    public void setRegistrationStatus(int registrationStatus) {
        RegistrationStatus = registrationStatus;
    }
}
