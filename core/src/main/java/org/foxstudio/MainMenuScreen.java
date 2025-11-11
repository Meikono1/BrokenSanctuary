package org.foxstudio;

import com.badlogic.gdx.*;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainMenuScreen implements Screen {
    private final Game game;
    private final Stage stage;
    private final Skin skin;

    public MainMenuScreen(Game game) {
        this.game = game;
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        skin = new Skin(Gdx.files.internal("uiskin.json"));

        Table table = new Table();
        table.setFillParent(true);
        stage.addActor(table);

        TextButton startButton = new TextButton("Start Game", skin);
        TextButton exitButton = new TextButton("Exit", skin);

        table.add(startButton).pad(10).row();
        table.add(exitButton).pad(10);

        startButton.addListener(e -> {
            if (e.isHandled()) game.setScreen(new GameScreen(game));
            return true;
        });
        exitButton.addListener(e -> {
            if (e.isHandled()) Gdx.app.exit();
            return true;
        });
    }

    @Override
    public void show() {

    }

    @Override public void render(float delta) {
        ScreenUtils.clear(0.1f, 0.1f, 0.2f, 1);
        stage.act(delta);
        stage.draw();
    }

    @Override public void resize(int w, int h) { stage.getViewport().update(w, h, true); }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override public void dispose() { stage.dispose(); skin.dispose(); }
}
