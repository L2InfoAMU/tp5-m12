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

    }



    public boolean contains(Point point){

        return false;
    }
    public Color getColor(){

        return color;
    }

}
