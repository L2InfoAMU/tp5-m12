package image;

import javafx.scene.paint.Color;
import util.Matrices;
import java.util.HashMap;
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
                map.put(p,color); }
            }
        }
    }

    public SparseRasterImage(Color[][] pixels){


        width = Matrices.getRowCount(pixels);
        height = Matrices.getColumnCount(pixels);
        map = new HashMap<Point, Color>();

        for(int x = 0 ; x < this.width; x++) {
            for(int y = 0; y < this.height; y++) {

                if (color!= Color.WHITE){
                    p=new Point(x,y);
                    map.put(p,pixels[x][y]); }

            }
        }

    }



        /*  Methodes  */

    @Override
    public void createRepresentation(){
      this.map = new HashMap<Point, Color>();
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        p=new Point(x,y);

        map.put(p,color);
    }

    @Override
    public Color getPixelColor(int x, int y) {
        p=new Point(x,y);
       return map.get(p);
    }


    public void setPixelsColor(Color[][] pixels){

        width = Matrices.getRowCount(pixels);
        height = Matrices.getColumnCount(pixels);
        map = new HashMap<Point, Color>();
        //initialisation de l'image
        for(int x = 0 ; x < this.width; x++) {
            for(int y = 0; y < this.height; y++) {

                if (color!= Color.WHITE){

                    p=new Point(x,y);

                    map.put(p,pixels[x][y]); }

            }
        }
    }

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
