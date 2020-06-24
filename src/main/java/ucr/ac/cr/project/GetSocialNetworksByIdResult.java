package ucr.ac.cr.project;

public class GetSocialNetworksByIdResult {

    private int Id;
    private String Url;
    private int SocialNetworksName_id;

    public GetSocialNetworksByIdResult() {
    }

    public GetSocialNetworksByIdResult(int id, String url, int socialNetworksName_id) {
        Id = id;
        Url = url;
        SocialNetworksName_id = socialNetworksName_id;
    }

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
