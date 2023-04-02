package Builder;

import java.awt.*;

public class Run {
    public static void main(String[] args) {
        Widget widget= new WidgetBuilder()
                .border(new Border(2, Color.BLACK,BORDER_TYPE.DOTTED))
                .name("Deneme")
                .title("This is a widget")
                .width(12)
                .height(23)
                .build();

    }
}
