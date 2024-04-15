package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class MyGdxGame extends ApplicationAdapter {

	//Texture img;
	Stage stage;  //escenari de Scene2d

	@Override
	public void create () {

		stage = new Stage(new ScreenViewport());  //sempre

		Carretera carretera = new Carretera();
		Cotxe cotxe= new Cotxe();
		CotxeEnemic cotxeEnemic = new CotxeEnemic();

		stage.addActor(carretera);
		stage.addActor(cotxe);
		stage.addActor(cotxeEnemic);

	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);

		stage.act();
		stage.draw(); //crida a tots els mètode draw de tots els actors que estiguin al stage

	}
	
	@Override
	public void dispose () {

		//img.dispose();
	}
}
