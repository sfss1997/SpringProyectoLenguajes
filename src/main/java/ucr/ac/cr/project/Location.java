package ucr.ac.cr.project;
import javax.persistence.*;

@Entity
@Table(name = "Location")

public class Location {
    private int Id;
    private int Province_id;
    private int Canton_id;
    private int District_id;

    public Location() {
    }

    public Location(int id, int province_id, int canton_id, int district_id) {
        Id = id;
        Province_id = province_id;
        Canton_id = canton_id;
        District_id = district_id;
    }

    @Id
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getProvince_id() {
        return Province_id;
    }

    public void setProvince_id(int province_id) {
        Province_id = province_id;
    }

    public int getCanton_id() {
        return Canton_id;
    }

    public void setCanton_id(int canton_id) {
        Canton_id = canton_id;
    }

    public int getDistrict_id() {
        return District_id;
    }

    public void setDistrict_id(int district_id) {
        District_id = district_id;
    }
}
