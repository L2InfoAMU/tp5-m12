package image;
import javafx.scene.paint.Color;
import util.Matrices;

import java.util.List;

public class PaletteRasterImage implements Image{
    // attributs
    Color color ;
    int width;
    int height;
   // Color [][] MyImage;
    int [][] IndexColors;
    List<Color> palette;

    public PaletteRasterImage(Color color, int width, int height) {
        // initialize an image with specified color
        this.width=width;
        this.height=height;
        IndexColors = new int[width][height];
        for(int x = 0 ; x < this.width; x++) {
            for(int y = 0; y < this.height; y++) {
                IndexColors[x][y] = palette.indexOf(color);       //create an image with same color
            }
        }
    }

    public PaletteRasterImage(Color[][] pixels){
        // initialize an image from Matrice

        width = IndexColors.length;
        height = IndexColors[0].length;
        this.IndexColors = new int[width][height];  //initialisation de l'image
        for(int x = 0 ; x < this.width; x++) {
            for(int y = 0; y < this.height; y++) {
                this.IndexColors[x][y] = palette.indexOf( pixels[x][y]);
            }
        }
    }


    //methodes

    public void createRepresentation() {
        this.IndexColors = new int[this.width][this.height];
    }

    public void setPixelColor(Color color, int x, int y){
        setPixelColor(color,x,y);
    }

    public Color getPixelColor(int x, int y){
       return getPixelColor(x,y);
    }

    public void setPixelsColor(Color[][] pixels) {

    }

    private void setPixelsColor(Color color) {

//get image dimensions
       /* width = Matrices.getRowCount(MyImage);
        height = Matrices.getColumnCount(MyImage);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                this.MyImage[x][y] = color;  //load image with gived pixels
            }
        }*/
    }



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
