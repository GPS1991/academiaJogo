package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class InvisibleWall {

    private Picture wall;

    public InvisibleWall(double v1, double v2){
        wall = new Picture(v1,v2,"resources/wall.png");
        wall.draw();
    }

    public Picture getWall() {
        return wall;
    }




}
