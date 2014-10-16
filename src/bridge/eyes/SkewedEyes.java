package bridge.eyes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.EllipseBuilder;

/**
 * Created by adam on 16.10.14.
 */
public class SkewedEyes extends AbstractEyes {
    @Override
    public void draw() {
        Ellipse eye1 = EllipseBuilder.create().radiusX(10).radiusY(5).fill(Color.valueOf("#ccccff")).stroke(Color.valueOf("#333333")).strokeWidth(1).translateX(-20).rotate(20).build();
        Ellipse eye2 = EllipseBuilder.create().radiusX(10).radiusY(5).fill(Color.valueOf("#ccccff")).stroke(Color.valueOf("#333333")).strokeWidth(1).translateX(20).rotate(-20).build();
        getChildren().addAll(eye1, eye2);
    }
}
