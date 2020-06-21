package ucr.ac.cr.project;

public class GetNameSocialNetworksResult {

    private int Id;
    private String Name;

    public GetNameSocialNetworksResult() {
    }

    public GetNameSocialNetworksResult(int id, String name) {
        Id = id;
        Name = name;
    }

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
