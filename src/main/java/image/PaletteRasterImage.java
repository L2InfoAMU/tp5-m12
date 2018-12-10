package image;
import javafx.scene.paint.Color;
import util.Matrices;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage implements Image  {
    // attributs
    Color color ;
    int width;
    int height;
   // Color [][] MyImage;
    int [][] indexColors;
    List<Color> palette;

    public PaletteRasterImage(Color color, int width, int height) {
        // initialize an image with specified color
        this.width=width;
        this.height=height;
        indexColors = new int[width][height];
        for(int x = 0 ; x < this.width; x++) {
            for(int y = 0; y < this.height; y++) {
                indexColors[x][y] = palette.indexOf(color);       //create an image with same color
            }
        }
    }

    public PaletteRasterImage(Color[][] pixels){
        // initialize an image from Matrice

        width = Matrices.getRowCount(pixels);
        height = Matrices.getColumnCount(pixels);
        this.palette = new ArrayList<Color>();
        this.indexColors = new int[width][height];  //initialisation de l'image
        for(int x = 0 ; x < this.width; x++) {
            for(int y = 0; y < this.height; y++) {

                palette.add( pixels[x][y]);

                this.indexColors[x][y] = palette.indexOf( pixels[x][y]);

            }
        }
    }


    //methodes

    public void createRepresentation() {
        this.indexColors = new int[this.width][this.height];
    }

    public void setPixelColor(Color color, int x, int y){

       // if (!palette.contains(palette.indexOf(indexColors[x][y]))){
            palette.add(color);
       // }
    }

    public Color getPixelColor(int x, int y){
       return palette.get( indexColors[x][y]);
    }

    public void setPixelsColor(Color[][] pixels) {

        //get image dimensions
        width = Matrices.getRowCount(pixels);
        height = Matrices.getColumnCount(pixels);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {

                this.indexColors[x][y] = palette.indexOf( pixels[x][y]);  //load image with gived pixels
            }
        }

    }

    private void setPixelsColor(Color color) {

//get image dimensions
        width = indexColors.length;
        height = indexColors[0].length;

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                this.indexColors[x][y] = palette.indexOf(color);  //load image with gived colors
            }
        }
    }


    /*    // retourner le width
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
*/

    @Override
    public int getWidth() {
        return  this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    protected void setWidth(int width) {
        this.width=width;
    }

    @Override
    protected void setHeight(int height) {
        this.height=height;
    }
}
