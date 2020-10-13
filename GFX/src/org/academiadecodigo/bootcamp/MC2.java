package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MC2 implements Char {

    private Picture picture;

    public MC2() {
        picture = new Picture(90+620, 335+290, "resources/pirate.png");
        picture.draw();
    }

    public void moveRight() {
        picture.translate(18.75,0);
    }


    public void moveLeft() {
        picture.translate(-18.75,0);
    }


    public void moveDown() {
        picture.translate(0,18.75);
    }


    public void moveUp() {
        picture.translate(0,-18.75);
    }

    @Override public int getBottom() {
        return 0;
    }

    @Override
    public int getLeft() {
        return 0;
    }

    @Override
    public int getRight() {
        return 0;
    }

    @Override
    public int getTop() {
        return 0;
    }

    @Override
    public void deleteImage() {
        return;
    }

    @Override
    public void reDraw() {
        return;
    }

    @Override
    public void getPosition() {
        return;
    }
}
