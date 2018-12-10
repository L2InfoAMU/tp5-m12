package image;
import javafx.scene.paint.Color;

import java.util.List;

public class PaletteRasterImage implements Image{
    // attributs
    Color color ;
    int width;
    int height;
    int [][] MyImage;
    List<Color> palette;

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
        return  this.width;
    }

    public int getHeight() {
       return this.height;

    }


    protected void setWidth(int width) {

        this.width=width;
    }

    protected void setHeight(int height) {
        this.height=height;
    }





}
