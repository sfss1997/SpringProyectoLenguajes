package ucr.ac.cr.project;

public class SocialNetworkDAO {

    private int Id;
    private int UserId;
    private String Url;
    private int SocialNetworksNameId;

    public SocialNetworkDAO() {
    }

    public SocialNetworkDAO(int id, int userId, String url, int socialNetworksNameId) {
        Id = id;
        UserId = userId;
        Url = url;
        SocialNetworksNameId = socialNetworksNameId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public int getSocialNetworksNameId() {
        return SocialNetworksNameId;
    }

    public void setSocialNetworksNameId(int socialNetworksNameId) {
        SocialNetworksNameId = socialNetworksNameId;
    }
}
