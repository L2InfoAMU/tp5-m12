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

        if (!palette.contains(palette.indexOf(IndexColors[x][y]))){
            palette.add(color);
        }
    }

    public Color getPixelColor(int x, int y){
       return palette.get( IndexColors[x][y]);
    }

    public void setPixelsColor(Color[][] pixels) {

        //get image dimensions
        width = IndexColors.length;
        height = IndexColors[0].length;

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {

                this.IndexColors[x][y] = palette.indexOf( pixels[x][y]);  //load image with gived pixels
            }
        }

    }

    private void setPixelsColor(Color color) {

//get image dimensions
        width = IndexColors.length;
        height = IndexColors[0].length;

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                this.IndexColors[x][y] = palette.indexOf(color);  //load image with gived colors
            }
        }
    }


        // retourner le width
    public int getWidth() {
        return  this.width;
    }
        //retourner le height
    public int getHeight() {
       return this.height;

    }

        // set a new value to width
    protected void setWidth(int width) {

        this.width=width;
    }

    // // set a new value to height
    protected void setHeight(int height) {
        this.height=height;
    }





}
