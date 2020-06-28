package ucr.ac.cr.project;

import javax.persistence.*;

@Entity
public class SelectAcademicDegreeResult {

    @Column (name = "Id")
    public Integer Id;
    @Column (name = "Name")
    public String Name;

    public SelectAcademicDegreeResult() {
    }

    public SelectAcademicDegreeResult(Integer id, String name) {
        Id = id;
        Name = name;
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
}
