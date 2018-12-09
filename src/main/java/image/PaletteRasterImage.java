package image;
import javafx.scene.paint.Color;

public class PaletteRasterImage implements Image{
    // attributs
    Color color ;
    int width;
    int height;
    Image MyImage;
    Pixel pixel ;

    public PaletteRasterImage(Color color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public PaletteRasterImage(Color[][] pixels){}


    //methodes

    public void createRepresentation() { }

    public void setPixelColor(Color color, int x, int y){
        setPixelColor(color,x,y);
    }

    public Color getPixelColor(int x, int y){
       return getPixelColor(x,y);
    }

    public void setPixelsColor(Color[][] pixels) {}

    private void setPixelsColor(Color color) {}

    public int getWidth() {
        return  MyImage.getHeight();
    }

    public int getHeight() {
       return MyImage.getHeight();
    }

    protected void setWidth(int width) {}

    protected void setHeight(int height) {}





}
