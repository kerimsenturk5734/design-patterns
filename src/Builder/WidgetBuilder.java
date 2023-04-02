package Builder;

public  class WidgetBuilder {
    private String name;
    private String title;
    private int width;
    private int height;
    private Border border;
    private Content content;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Border getBorder() {
        return border;
    }

    public Content getContent() {
        return content;
    }

    public WidgetBuilder name(String name) {
        this.name = name;
        return this;
    }

    public WidgetBuilder title(String title) {
        this.title = title;
        return this;
    }

    public WidgetBuilder width(int width) {
        this.width = width;
        return this;
    }

    public WidgetBuilder height(int height) {
        this.height = height;
        return this;
    }

    public WidgetBuilder border(Border border) {
        this.border = border;
        return this;
    }

    public WidgetBuilder content(Content content) {
        this.content = content;
        return this;
    }

    public Widget build(){
        return new Widget(this);
    }
}
