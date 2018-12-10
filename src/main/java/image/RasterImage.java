package image;

import javafx.scene.paint.Color;

public abstract class  RasterImage {




    public int getWidth() {
       return 0;
    }

    public int getHeight() {
        return 0;
    }

    protected void setWidth(int width) {


    }




    protected void setHeight(int height) {

    }


    public void createRepresentation() {}

    public void setPixelColor(Color color, int x, int y){}

    public void setPixelsColor(Color[][] pixels) {}

    private void setPixelsColor(Color color){}


}
