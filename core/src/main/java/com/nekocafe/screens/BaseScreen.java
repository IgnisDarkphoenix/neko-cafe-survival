package com.nekocafe.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.nekocafe.NekoCafeSurvival;

/**
 * Pantalla base para el juego.
 * Todas las demás pantallas (Home, Game, etc.) heredarán de aquí.
 */
public abstract class BaseScreen implements Screen {

    protected final NekoCafeSurvival game;
    protected final Stage stage;
    protected final OrthographicCamera camera;
    protected final Viewport viewport;

    public BaseScreen(NekoCafeSurvival game) {
        this.game = game;

        camera = new OrthographicCamera();
        viewport = new FitViewport(
                NekoCafeSurvival.VIRTUAL_WIDTH,
                NekoCafeSurvival.VIRTUAL_HEIGHT,
                camera
        );
        stage = new Stage(viewport);
    }

    @Override
    public void show() {
        // Por defecto, usamos el Stage como InputProcessor
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        // Limpiar pantalla con un color oscuro
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.15f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Actualizar y dibujar el Stage
        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @Override
    public void pause() { }

    @Override
    public void resume() { }

    @Override
    public void hide() { }

    @Override
    public void dispose() {
        stage.dispose();
    }
}
