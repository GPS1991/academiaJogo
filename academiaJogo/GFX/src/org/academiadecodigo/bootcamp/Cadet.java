package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cadet {

    private Picture picture;
    private InvisibleWall wall;
    private boolean isEdge;
    private double x;
    private double y;
    private double maxX;
    private double maxY;

    public Cadet() {
        picture = new Picture(10, 10, "resources/mapanovo.png");
        picture.draw();
        setEdge(71,73,161,377);

    }

    public int getX() {
        return picture.getX();
    }

    public int getY(){
        return picture.getY();
    }

    public int getMaxY(){
        return picture.getMaxY();
    }

    public int getMaxX(){
        return picture.getMaxX();
    }

    public boolean isEdge() {
        return isEdge;
    }

    public void setEdge(double x, double y, double maxX , double maxY) {
        this.x = x;
        this.y = y;
        this.maxX = maxX;
        this.maxY = maxY;
        isEdge = true;
    }

    public double getEdgeX(){
        return x;
    }

    public double getEdgeY(){
        return y;
    }

    public double getEdgeMaxX(){
        return maxX;
    }

    public double getEdgeMaxY(){
        return maxY;
    }


}
