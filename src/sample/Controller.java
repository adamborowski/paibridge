package sample;

import bridge.AbstractFace;
import bridge.FaceBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public ComboBox eyesCombo;
    public ComboBox classCombo;
    public HBox instanceBox;
    public ComboBox mouthCombo;
    public ComboBox noseCombo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onCreate(ActionEvent actionEvent) {
        AbstractFace face = FaceBuilder.create()
                .faceClass((String) classCombo.getValue())
                .eyesClass((String) eyesCombo.getValue())
                .noseClass((String) noseCombo.getValue())
                .mouthClass((String) mouthCombo.getValue())
                .build();
        instanceBox.getChildren().add(face);
        face.draw();
    }
}
