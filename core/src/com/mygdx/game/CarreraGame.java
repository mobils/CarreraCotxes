package com.mygdx.game;

import com.badlogic.gdx.Game;

public class CarreraGame extends Game {


    //int punts=0;

    public CarreraGame() {
        //TODO: declarar musica i imatges
    }



    @Override
    public void create() {
        setScreen(new ScreenInicial(this));   //li hem definit un paràmetre al constructor de
                                    // ScreenInicial per poder compartir paràmetres entre pantalles
        dispose();

    }




}
