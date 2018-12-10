package image;
import javafx.scene.paint.Color;

public class Rectangle implements Shape {


    Color color;
    Color[][] image;
    int x;
    int y;
    int width;
    int height;

    Rectangle(int x, int y, int width, int height, Color color) {

        this.width=width;
        this.height=height;
        image = new Color[width][height];
        for(int a = x ; a < this.width; a++) {
            for(int b = y; b < this.height; b++) {
                image[a][b] = color;
            }
        }
    }



    public boolean contains(Point point){

        return false;
    }
    public Color getColor(){

        return color;
    }

}
