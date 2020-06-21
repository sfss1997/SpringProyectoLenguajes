package ucr.ac.cr.project;
import javax.persistence.*;

@Entity
@Table(name = "Users")

public class Users {

    private int Id;
    private String Username;
    private String Password;
    private int Is_administrator;
    private String Status;

    public Users() {
    }

    public Users(int id, String username, String password, int is_administrator, String status) {
        Id = id;
        Username = username;
        Password = password;
        Is_administrator = is_administrator;
        Status = status;
    }

    @Id
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

    public int getIs_administrator() {
        return Is_administrator;
    }

    public void setIs_administrator(int is_administrator) {
        Is_administrator = is_administrator;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}

