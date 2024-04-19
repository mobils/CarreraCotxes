package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.badlogic.gdx.scenes.scene2d.actions.RepeatAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;


public class Carretera extends Actor {

    TextureRegion carretera;

    public Carretera() {
        Texture carrera = new Texture("carrera.png");
        carretera= new TextureRegion(carrera, 118,122);
        this.setColor(Color.WHITE);
        this.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight()); //ocupa tota la pantalla

        MoveToAction mouEsquerra = new MoveToAction();
        mouEsquerra.setPosition(0,0);
        mouEsquerra.setDuration(2f);   //Velocitat de la carretera

        MoveToAction mouDreta = new MoveToAction();
        mouDreta.setPosition(getWidth(),0);
        mouDreta.setDuration(0f);


        SequenceAction sequencia = new SequenceAction();
        sequencia.addAction(mouEsquerra);
        sequencia.addAction(mouDreta);

        RepeatAction infiniteLoop = new RepeatAction();
        infiniteLoop.setCount(RepeatAction.FOREVER);
        infiniteLoop.setAction(sequencia);
        this.addAction(infiniteLoop);

    }

    public void act(float delta) {

        super.act(delta);
    }

    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        batch.setColor(this.getColor());
        batch.draw(carretera, getX()-getWidth(),getY(), this.getWidth()*2, this.getHeight());
    }

}
