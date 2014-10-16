package bridge;

import bridge.eyes.AbstractEyes;
import bridge.mouth.AbstractMouth;
import bridge.nose.AbstractNose;
import javafx.scene.Group;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Shape;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by adam on 16.10.14.
 */
public abstract class AbstractFace extends Group {
    @Setter
    protected AbstractEyes eyes;
    @Setter
    protected AbstractNose nose;
    @Setter
    protected AbstractMouth mouth;
    protected Shape face;
    @Getter
    private int width = 70;
    @Getter
    private int height = 100;

    public void draw() {
        face = new Ellipse(width/2, height/2, width, height);
        getChildren().addAll(face, eyes, nose);
        eyes.draw();
        nose.draw();
        eyes.setTranslateX(width / 2);
        eyes.setTranslateY(height / 3);
        nose.setTranslateX(width / 2);
        nose.setTranslateY(height / 2);
        mouth.setTranslateX(width / 2);
        mouth.setTranslateY(height / 3 * 2);
    }
}
