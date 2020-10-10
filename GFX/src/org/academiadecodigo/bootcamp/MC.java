package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MC {

    private String[] stringArr = {"resources/images/Run__000.png", "resources/images/Run__001.png", "resources/images/Run__002.png", "resources/images/Run__003.png", "resources/images/Run__004.png", "resources/images/Run__005.png", "resources/images/Run__006.png"};
    private Picture picture;
    private Cadet cadet;
    private KeyboardEvent keyboardEvent;
    private int x = 0;
    private int y = 0;



    public MC(){
        picture = new Picture(90, 335, "resources/wraith.png");
        picture.draw();
    }

    public void setCadet(Cadet cadet) {
        this.cadet = cadet;
    }
    public void moveUp() {
        y--;
        if(y > -15) {
            picture.translate(0, -18.75);
        } else if(y == -15){
            y = y +1;
        }
    }

        public void moveRight(){
        x++;
        if(x < 2) {
            picture.translate(18.75, 0);
        }   else if(x == 2){
            x = x -1;
        }
    }
    public void moveDown() {
        y++;
        if(y < 0) {
            picture.translate(0, 18.75);
        } else if(y == 1){
            y = y -2;
        }
    }

    public void moveLeft() {
        x--;
        if(x > -2) {
            picture.translate(-18.75, 0);
        } else if(x == -2){
            x = x +1;
        }
    }
    public void changePicture(){
        picture.load("resources/images/Dead__000.png");
    }
}
