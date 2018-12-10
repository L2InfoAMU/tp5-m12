package image;

import com.sun.javafx.collections.MappingChange;
import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseRasterImage extends RasterImage implements Image {


    // attributs
    int width;
    int height;
    Color color;
   // Color[][] image;
   Point p ;
   Map<Point, Color> map;


        /* Constructeurs    */

    public SparseRasterImage(Color color, int width, int height){
        this.width=width;
        this.height=height;
         map = new HashMap<Point, Color>();

        for(int x = 0 ; x < this.width; x++) {
            for(int y = 0; y < this.height; y++) {
                if (color!= Color.WHITE){
                    p=new Point(x,y);
                map.put(p,color); }      //create an image with same color
            }
        }
    }

    public SparseRasterImage(Color[][] pixels){}



        /*  Methodes  */

    @Override
    public void createRepresentation(){

    }

    @Override
    public void setPixelColor(Color color, int x, int y) {}

    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    public SparseRasterImage() {
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    protected void setWidth(int width) {
        super.setWidth(width);
    }

    @Override
    protected void setHeight(int height) {
        super.setHeight(height);
    }
}
