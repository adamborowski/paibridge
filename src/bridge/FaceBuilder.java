package bridge;

import bridge.eyes.AbstractEyes;
import bridge.eyes.NormalEyes;
import bridge.eyes.SkewedEyes;
import bridge.mouth.AbstractMouth;
import bridge.mouth.BigMouth;
import bridge.mouth.TinyMouth;
import bridge.nose.AbstractNose;
import bridge.nose.BigNose;
import bridge.nose.TinyNose;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by adam on 17.10.14.
 */
@Accessors(fluent = true)
public class FaceBuilder {
    public static FaceBuilder create() {
        return new FaceBuilder();
    }

    @Getter
    @Setter
    private String faceClass;
    @Getter
    @Setter
    private String eyesClass;
    @Getter
    @Setter
    private String mouthClass;
    @Getter
    @Setter
    private String noseClass;

    public AbstractFace build() {
        AbstractFace face = null;
        switch (faceClass.toLowerCase()) {
            case "black":
                face = new BlackFace();
                break;
            case "white":
            default:
                face = new WhiteFace();
                break;
        }
        //
        AbstractEyes eyes = null;
        switch (eyesClass.toLowerCase()) {
            case "normal":
                eyes = new NormalEyes();
                break;
            case "skewed":
            default:
                eyes = new SkewedEyes();
                break;
        }
        //
        AbstractNose nose = null;
        switch (noseClass.toLowerCase()) {
            case "tiny":
                nose = new TinyNose();
                break;
            case "big":
            default:
                nose = new BigNose();
                break;
        }
        //
        AbstractMouth mouth = null;
        switch (mouthClass.toLowerCase()) {
            case "big":
                mouth = new BigMouth();
                break;
            case "tiny":
            default:
                mouth = new TinyMouth();
        }
        face.setEyes(eyes);
        face.setNose(nose);
        face.setMouth(mouth);
        return face;
    }

}
