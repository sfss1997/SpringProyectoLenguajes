package ucr.ac.cr.project;

import javax.persistence.*;

@Entity
public class GetNameSocialNetworksResult {

    @Column (name = "Id")
    private int Id;
    @Column (name = "Name")
    private String Name;

    public GetNameSocialNetworksResult() {
    }

    public GetNameSocialNetworksResult(int id, String name) {
        Id = id;
        Name = name;
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
}
