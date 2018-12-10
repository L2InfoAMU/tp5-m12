package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class VectorImage implements Image{

    int width;
    int height;
    Color color;
    Color[][] image;
    List<Shape> shapess;

    VectorImage(List<Shape> shapes, int width, int height) {
        this.width=width;
        this.height=height;

        image = new Color[width][height];
        for(int x = 0 ; x < this.width; x++) {
            for(int y = 0; y < this.height; y++) {
                //create an image with same color

            }
        }
    }

    public Color getPixelColor(int x, int y) {
return color;
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
}}
