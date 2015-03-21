package com.blitz.game.screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.blitz.game.Blitz;

public class MainMenu implements Screen{
<<<<<<< HEAD
	Blitz game;
=======
>>>>>>> af854d70f1e0274dd221b2b5ed1b1e6c16084743
	private SpriteBatch batch;
    private BitmapFont font;
	public Stage stage = new Stage();
	
	// constructor to keep a reference to the main Game class
    public MainMenu(Blitz game){
            this.game = game;
    }
    @Override
    public void render(float delta) {
    	batch = new SpriteBatch();    
        font = new BitmapFont();
        font.setColor(Color.BLUE);
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();	
        stage.draw();
        batch.begin();
<<<<<<< HEAD
        font.draw(batch, "Touch to begin", 200, 200);
        batch.end();
        if (Gdx.input.isKeyPressed(Input.Keys.ENTER)) {
            game.setScreen(game.map);
        }
=======
        font.draw(batch, "Hello World", 200, 200);
        batch.end();
>>>>>>> af854d70f1e0274dd221b2b5ed1b1e6c16084743
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void show() {
    }

    @Override
    public void hide() {
        dispose();
    }

   @Override
   public void pause() {
   }

   @Override
   public void resume() {
   }

   @Override
   public void dispose() {
	   batch.dispose();
       font.dispose();
       stage.dispose();
   }
}
