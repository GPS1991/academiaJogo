package org.academiadecodigo.bootcamp;

import jdk.swing.interop.SwingInterOpUtils;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MC {

    private Picture picture;
    private double left;
    private double top;
    private double right;
    private double bottom;

    public MC() {
        picture = new Picture(90, 335, "resources/wraith.png");
        picture.draw();
        left = picture.getX();
        right = picture.getMaxX();
        top = picture.getY();
        bottom = picture.getMaxY();

    }

    public void moveUp() {
        if(picture.getX() == 90 && picture.getMaxX() == 142 && picture.getY() == 129 && picture.getMaxY() == 171){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() >= 71 && picture.getMaxX() <= 161 && picture.getY() > 73 && picture.getMaxY() <= 377 // LEFT BOX

                || picture.getX() >= 71 && picture.getMaxX() <= 560 && picture.getY() > 73 && picture.getMaxY() <= 152 // TOP BOX

                || picture.getX() >= 428 && picture.getMaxX() <= 560 && picture.getY() > 73 && picture.getMaxY() <= 358 // RIGHT BOX

                || picture.getX() >= 249 && picture.getMaxX() <= 560 && picture.getY() > 279 && picture.getMaxY() <= 358) { // BOTTOM BOX
            picture.translate(0, -18.75);
        }
        System.out.println(picture.getY());
    }


    public void moveRight() {
        if(picture.getX() == 71 && picture.getMaxX() == 123 && picture.getY() == 110 && picture.getMaxY() == 152){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() >= 71 && picture.getMaxX() < 161 && picture.getY() >= 73 && picture.getMaxY() <= 377 // LEFT BOX

            || picture.getX() >= 71 && picture.getMaxX() < 540 && picture.getY() >= 73 && picture.getMaxY() <= 152  // TOP BOX

            || picture.getX() >= 428 && picture.getMaxX() < 540 && picture.getY() >= 73 && picture.getMaxY() <= 358 // RIGHT BOX

            || picture.getX() >= 249 && picture.getMaxX() < 540 && picture.getY() >= 279 && picture.getMaxY() <= 358) { // BOTTOM BOX
            picture.translate(18.75,0 );
        }
        System.out.println(picture.getMaxX());
    }

    public void moveDown() {
        if(picture.getX() == 90 && picture.getMaxX() == 142 && picture.getY() == 91 && picture.getMaxY() == 133){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() >= 71 && picture.getMaxX() <= 161 && picture.getY() >= 73 && picture.getMaxY() < 377 // LEFT BOX

            || picture.getX() >= 71 && picture.getMaxX() <= 560 && picture.getY() >= 73 && picture.getMaxY() < 152 // TOP BOX

            || picture.getX() >= 428 && picture.getMaxX() <= 560 && picture.getY() >= 73 && picture.getMaxY() < 358 // RIGHT BOX

            || picture.getX() >= 249 && picture.getMaxX() <= 560 && picture.getY() >= 279 && picture.getMaxY() < 358) { // BOTTOM BOX
            picture.translate(0, 18.75);
        }
        System.out.println(picture.getMaxY());
    }

    public void moveLeft() {
        if(picture.getX() == 109 && picture.getMaxX() == 161 && picture.getY() == 110 && picture.getMaxY() == 152){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() > 71 && picture.getMaxX() <= 161 && picture.getY() >= 73 && picture.getMaxY() <= 377 // LEFT BOX

            || picture.getX() > 71 && picture.getMaxX() <= 560 && picture.getY() >= 73 && picture.getMaxY() <= 152 // TOP BOX

            || picture.getX() > 428 && picture.getMaxX() <= 560 && picture.getY() >= 73 && picture.getMaxY() <= 358 // RIGHT BOX

            || picture.getX() > 260 && picture.getMaxX() <= 560 && picture.getY() >= 279 && picture.getMaxY() <= 358) { // BOTTOM BOX
            picture.translate(-18.75,0 );
        }
        System.out.println(picture.getX());
    }

}




