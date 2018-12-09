package image;
import javafx.scene.paint.Color;


public class BruteRasterImage implements Image {
    int width;
    int height;
    Color color;
    Image MyImage;




    public BruteRasterImage(Color color, int width, int height)
    {

        this.width=width;
        this.height=height;
        this.color=color;

    }


// METHODES :

    public void createRepresentation(){}
    public void setPixelColor(Color color, int x, int y){ }
    public Color getPixelColor(int x, int y) {
        return MyImage.getPixelColor(x,y);
    }
    private void setPixelsColor(Color[][] pixels){}
    private void setPixelsColor(Color color){}
    public int getWidth(){
        return MyImage.getHeight();
    }
    public int getHeight() {
        return MyImage.getHeight();
    }
    protected void setWidth(int width) {}
    protected void setHeight(int height) {}



}
