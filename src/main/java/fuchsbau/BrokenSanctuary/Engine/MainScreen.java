package fuchsbau.BrokenSanctuary.Engine;

import fuchsbau.BrokenSanctuary.Main;
import fuchsbau.BrokenSanctuary.Optionen.GameOption;
import fuchsbau.BrokenSanctuary.Scene.SceneBuilder;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;

import java.util.Objects;

public class MainScreen implements Saveble {
    private Scene scene;
    SceneBuilder sceneBuilder = SceneBuilder.getSceneBuilder();

    private void makeScene() {
        // Top-Leiste
        ImageView logo = new ImageView(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("/images/logo.png"))));
        logo.setFitWidth(96);
        logo.setPreserveRatio(true);

        Label versionLabel = new Label("v0.1.0");
        versionLabel.setTextFill(Paint.valueOf("#868686"));

        BorderPane topBar = new BorderPane();
        topBar.setPadding(new Insets(10, 10, 0, 10));
        topBar.setRight(logo);
        topBar.setMouseTransparent(true);

        BorderPane bottomBar = new BorderPane();
        bottomBar.setPadding(new Insets(0, 10, 10, 10));
        BorderPane.setAlignment(versionLabel, Pos.BOTTOM_RIGHT);
        bottomBar.setRight(versionLabel);
        bottomBar.setMouseTransparent(true);

        // Buttons
        Button start = new Button("Start Game");
        start.getStyleClass().add("menu-button");
        start.setMaxWidth(Double.MAX_VALUE);
        start.setOnAction(event -> {
            Main.getStage().setTitle("Character Creation");
            // Main.getStage().setScene(creation.getScene(1));
        });

        Button load = new Button("Load Game");
        load.setMaxWidth(Double.MAX_VALUE);

        Button encounter = new Button("Encounter Mode");
        encounter.setMaxWidth(Double.MAX_VALUE);

        Button settings = new Button("Settings");
        settings.setMaxWidth(Double.MAX_VALUE);
        settings.setOnAction(event -> {
            Main.getStage().setTitle("BrokenSanctuary - Options");
            Main.getStage().setScene(Game.getInstance().optionen.getScene(0));
        });

        Button rulebook = new Button("Rulebook");
        rulebook.setMaxWidth(Double.MAX_VALUE);

        Button orcLicense = new Button("ORC License");
        orcLicense.setMaxWidth(Double.MAX_VALUE);

        Button credits = new Button("Credits");
        credits.setMaxWidth(Double.MAX_VALUE);

        Button quit = new Button("Quit Game");
        quit.setMaxWidth(Double.MAX_VALUE);
        quit.setOnAction(event -> Platform.exit());

        // Sektionen links
        VBox gameSection = new VBox(5, sceneBuilder.makeWhiteLabel("Game"), start, load, encounter);
        gameSection.setFillWidth(true);
        VBox settingsSection = new VBox(5, sceneBuilder.makeWhiteLabel("Settings & Rules"), settings, rulebook);
        settingsSection.setFillWidth(true);
        VBox infoSection = new VBox(5, sceneBuilder.makeWhiteLabel("Info"), orcLicense, credits);
        infoSection.setFillWidth(true);

        VBox leftMenu = new VBox(20, gameSection, settingsSection, infoSection, quit);
        leftMenu.setPadding(new Insets(20));
        leftMenu.setAlignment(Pos.TOP_LEFT);
        leftMenu.setPrefWidth(280);
        leftMenu.setBackground(GameOption.rowHintergrundTrans40);

        // Haupt-Layout
        BorderPane pane = new BorderPane();

        pane.setLeft(leftMenu);
        pane.setBackground(Background.EMPTY);

        // Hintergrundbild
        ImageView bg = new ImageView(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("/images/Map.png"))));
        bg.setPreserveRatio(true);

        bg.setSmooth(true);

        bg.sceneProperty().addListener((obs, oldScene, newScene) -> {
            if (newScene != null) {
                ChangeListener<Number> resizeListener = (o, oldVal, newVal) -> resizeBackground(bg, newScene.getWidth(), newScene.getHeight(), 1.2);

                newScene.widthProperty().addListener(resizeListener);
                newScene.heightProperty().addListener(resizeListener);

                resizeBackground(bg, newScene.getWidth(), newScene.getHeight(), 1.2);
            }
        });

        ColorAdjust adjust = new ColorAdjust();
        adjust.setBrightness(-0.8);
        bg.setEffect(adjust);

        StackPane root = new StackPane();
        root.getChildren().addAll(bg, pane, topBar, bottomBar);

        scene = new Scene(root);
        scene.getStylesheets().add(
                Objects.requireNonNull(
                        Main.class.getResource("/css/menu.css")
                ).toExternalForm()
        );
    }

    private void resizeBackground(ImageView bg, double sceneW, double sceneH, double factor) {
        Image img = bg.getImage();
        if (img == null || sceneW <= 0 || sceneH <= 0) return;

        double imgW = img.getWidth();
        double imgH = img.getHeight();

        double scale = Math.max(sceneW / imgW, sceneH / imgH);
        scale *= factor;

        bg.setFitWidth(imgW * scale);
        bg.setFitHeight(imgH * scale);
    }

    @Override
    public Scene getScene(int stage) {
        makeScene();
        //Game.getInstance().spieler.setAktuell(this, stage);
        return scene;
    }

    @Override
    public void reset() {
        this.scene = null;
    }

}
