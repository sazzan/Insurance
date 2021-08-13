package np.com.sajansharma.dashboard;

public class DashboardModel {
    private String title;
    private int imageId;
    private int color;

    public DashboardModel(String title, int imageId, int color) {
        this.title = title;
        this.imageId = imageId;
        this.color =color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }



    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}



