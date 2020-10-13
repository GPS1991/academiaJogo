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
    private boolean newMap;

    public Cadet() {
        picture = new Picture(580, 260, "resources/mapanovo.png");
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

    public void load(){
        picture.load("resources/mapanovo.png");
    }
    public void load2nd(){
        picture.load("resources/mediumplat.png");
    }
    public void load3rd(){
        picture.load("resources/mediumplat2.png");
    }
    public void load4th(){
        picture.load("resources/mediumplat3.png");
    }

    public void setNewMap(boolean map){
        newMap = map;
    }

    public boolean isNewMap() {
        return newMap;
    }
}
