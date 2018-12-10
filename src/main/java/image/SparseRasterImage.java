package image;

import javafx.scene.paint.Color;

public class SparseRasterImage extends RasterImage implements Image {



    public SparseRasterImage(Color color, int width, int height){}

    public SparseRasterImage(Color[][] pixels){}




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
