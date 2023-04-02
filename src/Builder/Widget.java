package Builder;

import java.awt.*;

public  class Widget {
    private String name;
    private String title;
    private int width;
    private int height;
    private Border border;
    private Content content;
    public Widget(WidgetBuilder widgetBuilder){
        this.name = widgetBuilder.getName();
        this.title = widgetBuilder.getTitle();
        this.width = widgetBuilder.getWidth();
        this.height = widgetBuilder.getHeight();
        this.border = widgetBuilder.getBorder();
        this.content = widgetBuilder.getContent();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Border getBorder() {
        return border;
    }

    public void setBorder(Border border) {
        this.border = border;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

}
