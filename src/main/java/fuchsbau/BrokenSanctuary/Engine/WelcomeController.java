package fuchsbau.BrokenSanctuary.Engine;

import fuchsbau.BrokenSanctuary.Main;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Objects;

public class WelcomeController {

    @FXML
    private StackPane root;
    @FXML
    private ImageView bgImage;
    @FXML
    private Label clickLabel;

    @FXML
    private void initialize() {
        Image img = new Image(
                Objects.requireNonNull(Main.class.getResourceAsStream("/images/Map.png"))
        );
        bgImage.setImage(img);

        bgImage.sceneProperty().addListener((obs, oldScene, newScene) -> {
            if (newScene != null) {
                bgImage.fitWidthProperty().bind(newScene.widthProperty().multiply(1.2));
                bgImage.fitHeightProperty().bind(newScene.heightProperty().multiply(1.2));
            }
        });


        FadeTransition bgFade = new FadeTransition(Duration.seconds(5), bgImage);
        bgFade.setFromValue(0.25);
        bgFade.setToValue(0.7);
        bgFade.play();

        TranslateTransition bgFloat = new TranslateTransition(Duration.seconds(4), bgImage);
        bgFloat.setFromY(-10);
        bgFloat.setToY(10);
        bgFloat.setRate(0.70);
        bgFloat.setAutoReverse(true);
        bgFloat.setCycleCount(Animation.INDEFINITE);
        bgFloat.play();

        ScaleTransition pulse = new ScaleTransition(Duration.seconds(1.5), clickLabel);
        pulse.setFromX(1.0);
        pulse.setToX(1.05);
        pulse.setFromY(1.0);
        pulse.setToY(1.05);
        pulse.setAutoReverse(true);
        pulse.setCycleCount(Animation.INDEFINITE);
        pulse.play();
    }

    @FXML
    private void goToStart() {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new MainScreen().getScene(0));
    }
}
