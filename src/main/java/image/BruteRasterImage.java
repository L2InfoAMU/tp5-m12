package image;
import javafx.scene.paint.Color;
import util.Matrices;


public class BruteRasterImage implements Image {

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
        // initialize an image from Matrice
        width = Matrices.getRowCount(colors);
        height = Matrices.getColumnCount(colors);
        this.image = new Color[width][height];  //initialisation de l'image
        for(int x = 0 ; x < this.width; x++) {
            for(int y = 0; y < this.height; y++) {
                this.image[x][y] = colors[x][y];
            }
        }


    }


// METHODES :

    public void createRepresentation(){
        this.image = new Color[this.width][this.height];
    }

    public void setPixelColor(Color color, int x, int y){
       this.color= image[x][y];
    }


    public Color getPixelColor(int x, int y) {
        return image[x][y];
    }

    private void setPixelsColor(Color[][] pixels){
        width = Matrices.getRowCount(image);
        height = Matrices.getColumnCount(image);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                this.image[x][y] = pixels[x][y];
            }
        }
    }

    private void setPixelsColor(Color color){}

    public int getWidth(){
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    protected void setWidth(int width) {}

    protected void setHeight(int height) {}



}
