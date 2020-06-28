package ucr.ac.cr.project;
import javax.persistence.*;

@Entity
public class GetSocialNetworksByIdResult {
    @Column (name = "Id")
    private int Id;
    @Column (name = "Url")
    private String Url;
    @Column (name = "SocialNetworksName_id")
    private int SocialNetworksName_id;

    public GetSocialNetworksByIdResult() {
    }

    public GetSocialNetworksByIdResult(int id, String url, int socialNetworksName_id) {
        Id = id;
        Url = url;
        SocialNetworksName_id = socialNetworksName_id;
    }

    @Id
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public int getSocialNetworksName_id() {
        return SocialNetworksName_id;
    }

    public void setSocialNetworksName_id(int socialNetworksName_id) {
        SocialNetworksName_id = socialNetworksName_id;
    }
}
