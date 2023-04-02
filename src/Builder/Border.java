package Builder;

import java.awt.*;

public class Border {
    private int thickness;
    private Color color;
    private BORDER_TYPE borderType;

    public Border(){

    }

    public Border(int thickness, Color color, BORDER_TYPE borderType) {
        this.thickness = thickness;
        this.color = color;
        this.borderType = borderType;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BORDER_TYPE getBorderType() {
        return borderType;
    }

    public void setBorderType(BORDER_TYPE borderType) {
        this.borderType = borderType;
    }
}

enum BORDER_TYPE{
    ROUNDED,DOTTED,LINE
}
