package bridge;

import javafx.scene.paint.Color;

/**
 * Created by adam on 16.10.14.
 */
public class WhiteFace extends AbstractFace {
    @Override
    public void draw() {
        super.draw();
        face.setFill(Color.valueOf("#BC8B60"));
    }
}
