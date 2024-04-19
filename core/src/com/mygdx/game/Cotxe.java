package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Cotxe extends Actor {

    Texture imatgeTot;
    TextureRegion cotxe;
    public Rectangle bounds;

    public Cotxe() {
        imatgeTot = new Texture("carrera.png");
        cotxe = new TextureRegion(imatgeTot, 123, 60, 123, 66);
        bounds = new Rectangle();

        /*this.setColor(Color.WHITE);
        this.setPosition(80, 50);
        this.setSize(123,66);*/
    }


    @Override
    public void act(float delta) {
        super.act(delta);
        bounds.set(getX(), getY(), getWidth(), getHeight());

        /********** MOVIMENT DEL COTXE */
        if(Gdx.input.isTouched()) {
            Vector3 touchPos = new Vector3();
            touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);

            this.setX(touchPos.x - getWidth() / 2);

            this.setY(Gdx.graphics.getHeight()-touchPos.y - getHeight() / 2);
          /*El 0,0 del input està al revès del 0,0 de la imatge,
             per això s'ha de restar la mida de l'alçada */

        }
    }


    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        batch.setColor(this.getColor().r, this.getColor().g, getColor().b, getColor().a);
        batch.draw(cotxe, getX(), getY());

    }
}