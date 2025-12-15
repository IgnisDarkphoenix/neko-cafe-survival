package com.nekocafe;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class NekoCafeSurvival extends Game {
    
    public static final String TAG = "NekoCafeSurvival";
    public static final int VIRTUAL_WIDTH = 720;
    public static final int VIRTUAL_HEIGHT = 1280;
    
    @Override
    public void create() {
        Gdx.app.log(TAG, "Neko Cafe Survival initialized!");
    }
    
    @Override
    public void dispose() {
        super.dispose();
    }
}
