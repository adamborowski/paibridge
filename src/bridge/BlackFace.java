package bridge;

import javafx.scene.Group;
import javafx.scene.paint.Color;

/**
 * Created by adam on 16.10.14.
 */
public class BlackFace extends AbstractFace {
    @Override
    public void draw() {
        super.draw();
        face.setFill(Color.valueOf("#413C36"));
    }
}
