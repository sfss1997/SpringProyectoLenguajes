package ucr.ac.cr.project;

public class ImageDAO {

    private String Image;
    private int Id;

    public ImageDAO() {
    }

    public ImageDAO(String image, int id) {
        Image = image;
        Id = id;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
