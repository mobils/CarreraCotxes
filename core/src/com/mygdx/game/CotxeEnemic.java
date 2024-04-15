package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class CotxeEnemic extends Actor {

    Texture imatgeTot;
    TextureRegion cotxe;
    Rectangle bounds;

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    Boolean alive;

    public CotxeEnemic() {
        imatgeTot = new Texture("carrera.png");
        cotxe = new TextureRegion(imatgeTot, 123,60, 123, 66);
        bounds = new Rectangle();
        alive=true;

        this.setRotation(180);
        this.setOrigin(getWidth()/2, getHeight()/2);

        this.setColor(Color.RED);


        this.setPosition(600,50);
        this.setSize(123,66);


        //addAction(moveTo(-getWidth(), getY(), MathUtils.random(4.0f, 6.0f)));
    }


    @Override
    public void act(float delta) {   // delta són els ms des de la última execució
        super.act(delta);
        this.setX(this.getX()-delta*100);

        bounds.set(getX(), getY(), getWidth(), getHeight());
    }



    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        if (alive) {   //Si xoquen o surt de la pantalla no es dibuixarà més
            batch.setColor(this.getColor().r, this.getColor().g, getColor().b, getColor().a);


            batch.draw(cotxe, getX(), getY(), getOriginX(), getOriginY(), this.getWidth(), this.getHeight(), 1, 1, getRotation());
            //batch.draw(cotxe, getX(), getY(), getWidth(), getHeight());
        }

    }
}