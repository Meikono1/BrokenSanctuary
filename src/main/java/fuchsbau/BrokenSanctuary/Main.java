package fuchsbau.BrokenSanctuary;

import fuchsbau.BrokenSanctuary.Engine.Game;
import fuchsbau.BrokenSanctuary.Logger.FileLogger;
import fuchsbau.BrokenSanctuary.Optionen.GameOption;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.logging.Logger;

public class Main extends Application {
    private final Logger logger = FileLogger.getLogger();

    private static Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage() {
        Game.getInstance().update();
        return stage;
    }

    @Override
    public void start(Stage stage) throws IOException {
        logger.info("Guten Morgen!");
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Intro.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setHeight(GameOption.height);
        stage.setWidth(GameOption.width);
        stage.setTitle("BrokenSanctuary");
        stage.setScene(scene);
        Main.stage = stage;
        stage.show();
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
