package image;
import javafx.scene.paint.Color;


public class BruteRasterImage implements Image {
    int width;
    int height;
    Color color;
    Image MyImage;


    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }



    public BruteRasterImage(Color color, int width, int height)
    {

        this.width=width;
        this.height=height;
        this.color=color;

    }


// METHODES :

    public void createRepresentation(){}
    public void setPixelColor(Color color, int x, int y){ }
    public Color getPixelColor(int x, int y) {}
    private void setPixelsColor(Color[][] pixels){}
    private void setPixelsColor(Color color){}
    public int getWidth(){}
    public int getHeight() {}
    protected void setWidth(int width) {}
    protected void setHeight(int height) {}



}
