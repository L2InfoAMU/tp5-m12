package image;
import javafx.scene.paint.Color;
import util.Matrices;


public class BruteRasterImage extends RasterImage implements Image {

    // attributs
    int width;
    int height;
    Color color;
    Color[][] image;




//constructeur 1
    public BruteRasterImage(Color color, int width, int height)
    {
        // initialize an image with specified color
        this.width=width;
        this.height=height;
        image = new Color[width][height];
        for(int x = 0 ; x < this.width; x++) {
            for(int y = 0; y < this.height; y++) {
                image[x][y] = color;       //create an image with same color
            }
        }

    }
//constructeur 2

    public BruteRasterImage(Color[][] colors) {
       try{
        // initialize an image from Matrice
        width = Matrices.getRowCount(colors);
        height = Matrices.getColumnCount(colors);
        this.image = new Color[width][height];  //initialisation de l'image
        for(int x = 0 ; x < this.width; x++) {
            for(int y = 0; y < this.height; y++) {
                this.image[x][y] = colors[x][y];
            }
        }}
       catch (Exception e){
            Matrices.requiresNonZeroDimensions(image);
          //  Matrices.requiresRectangularMatrix(image);
        }


    }


// METHODES :
    @Override
    public void createRepresentation(){
        this.image = new Color[this.width][this.height];
    }
    @Override
    public void setPixelColor(Color color, int x, int y){
       this.color= image[x][y];
    }


    public Color getPixelColor(int x, int y) {
        return image[x][y];
    }
    @Override
    public void setPixelsColor(Color[][] pixels){
       //get image dimensions
        width = Matrices.getRowCount(image);
        height = Matrices.getColumnCount(image);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                this.image[x][y] = pixels[x][y];  //load image with gived pixels
            }
        }
    }

    private void setPixelsColor(Color color){

        //get image dimensions
        width = Matrices.getRowCount(image);
        height = Matrices.getColumnCount(image);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                this.image[x][y] = color;  //load image with gived pixels
            }
        }
    }

    @Override
    public int getWidth() {
        return this.width;
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

/*
    public int getWidth(){
        return this.width;
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
*/


}
