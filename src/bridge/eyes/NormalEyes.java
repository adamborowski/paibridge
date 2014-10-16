package bridge.eyes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CircleBuilder;

/**
 * Created by adam on 16.10.14.
 */
public class NormalEyes extends AbstractEyes {
    @Override
    public void draw() {
        Circle eye1 = CircleBuilder.create().radius(10).fill(Color.valueOf("#ccccff")).stroke(Color.valueOf("#333333")).strokeWidth(4).translateX(-20).build();
        Circle eye2 = CircleBuilder.create().radius(10).fill(Color.valueOf("#ccccff")).stroke(Color.valueOf("#333333")).strokeWidth(4).translateX(20).build();
        getChildren().addAll(eye1, eye2);
    }
}
