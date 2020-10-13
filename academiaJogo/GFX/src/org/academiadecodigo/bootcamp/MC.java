package org.academiadecodigo.bootcamp;

import jdk.swing.interop.SwingInterOpUtils;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MC implements Char {


    private double left;
    private double top;
    private double right;
    private double bottom;
    private Picture textBox;
    private Picture textBox2;
    private Picture textBox3;
    private Picture picture = new Picture(90, 335, "resources/wraith.png");

    public MC() {
        picture.draw();
        left = picture.getX();
        right = picture.getMaxX();
        top = picture.getY();
        bottom = picture.getMaxY();
        textBox = new Picture(30,180, "resources/SPACEUNDERTALENULL.png");
        textBox.draw();
        textBox2 = new Picture(350, 50, "resources/SPACEUNDERTALENULL.png");
        textBox2.draw();
        textBox3 = new Picture( 350, 290, "resources/SPACEUNDERTALENULL.png");
        textBox3.draw();

    }

    public void moveUp() {
        if(picture.getX() == 71 && picture.getMaxX() == 123 && picture.getY() == 223 && picture.getMaxY() == 265){
            textBox.load("resources/textbox.png");
        } else {
            textBox.load("resources/SPACEUNDERTALENULL.png");
        }
        if(picture.getX() == 296 && picture.getMaxX() == 348 && picture.getY() == 91 && picture.getMaxY() == 133){
            textBox2.load("resources/textbox.png");
        }
        if(picture.getX() == 353 && picture.getMaxX() == 405 && picture.getY() == 316 && picture.getMaxY() == 358){
            textBox3.load("resources/textbox.png");
        } else{
            textBox3.load("resources/SPACEUNDERTALENULL.png");
        }
        /////////////////////////////////////////////////////////

        if(picture.getX() == 90 && picture.getMaxX() == 142 && picture.getY() == 129 && picture.getMaxY() == 171){
            picture.translate(0, 0);
            System.out.println(picture.getY());
            return;
        }if(picture.getX() == 221 && picture.getMaxX() == 273 && picture.getY() == 91 && picture.getMaxY() == 133){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 465 && picture.getMaxX() == 517 && picture.getY() == 110 && picture.getMaxY() == 152){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 465 && picture.getMaxX() == 517 && picture.getY() == 316 && picture.getMaxY() == 358){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 278 && picture.getMaxX() == 330 && picture.getY() == 316 && picture.getMaxY() == 358){
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
        if(picture.getX() == 71 && picture.getMaxX() == 123 && picture.getY() == 223 && picture.getMaxY() == 265){
            textBox.load("resources/textbox.png");
        } else {
            textBox.load("resources/SPACEUNDERTALENULL.png");
        }
        if(picture.getX() == 278 && picture.getMaxX() == 330 && picture.getY() == 73 && picture.getMaxY() == 115){
            textBox2.load("resources/textbox.png");
        }else{
            textBox2.load("resources/SPACEUNDERTALENULL.png");
        }
        if(picture.getX() == 353 && picture.getMaxX() == 405 && picture.getY() == 316 && picture.getMaxY() == 358){
            textBox3.load("resources/textbox.png");
        } else{
            textBox3.load("resources/SPACEUNDERTALENULL.png");
        }

        /////////////////////////////////////////////////////////

        if(picture.getX() == 71 && picture.getMaxX() == 123 && picture.getY() == 110 && picture.getMaxY() == 152){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 203 && picture.getMaxX() == 255 && picture.getY() == 73 && picture.getMaxY() == 115){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 203 && picture.getMaxX() == 255 && picture.getY() == 110 && picture.getMaxY() == 152){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 446 && picture.getMaxX() == 498 && picture.getY() == 91 && picture.getMaxY() == 133){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 446 && picture.getMaxX() == 498 && picture.getY() == 298 && picture.getMaxY() == 340){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 259 && picture.getMaxX() == 311 && picture.getY() == 298 && picture.getMaxY() == 340){
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
        if(picture.getX() == 71 && picture.getMaxX() == 123 && picture.getY() == 185 && picture.getMaxY() == 227){
            textBox.load("resources/textbox.png");
        }else{
            textBox.load("resources/SPACEUNDERTALENULL.png");
        }
        if(picture.getX() == 278 && picture.getMaxX() == 330 && picture.getY() == 73 && picture.getMaxY() == 115){
            textBox2.load("resources/textbox.png");
        }else{
            textBox2.load("resources/SPACEUNDERTALENULL.png");
        }
        if(picture.getX() == 371 && picture.getMaxX() == 423 && picture.getY() == 298 && picture.getMaxY() == 340){
            textBox3.load("resources/textbox.png");
        }

        /////////////////////////////////////////////////////////

        if(picture.getX() == 90 && picture.getMaxX() == 142 && picture.getY() == 91 && picture.getMaxY() == 133){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 221 && picture.getMaxX() == 273 && picture.getY() == 91 && picture.getMaxY() == 133){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 465 && picture.getMaxX() == 517 && picture.getY() == 73 && picture.getMaxY() == 115){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 465 && picture.getMaxX() == 517 && picture.getY() == 279 && picture.getMaxY() == 321){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 278 && picture.getMaxX() == 330 && picture.getY() == 279 && picture.getMaxY() == 321){
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
        if(picture.getX() == 90 && picture.getMaxX() == 142 && picture.getY() == 204 && picture.getMaxY() == 246){
            textBox.load("resources/textbox.png");
        }
        if(picture.getX() == 315 && picture.getMaxX() == 367 && picture.getY() == 73 && picture.getMaxY() == 115){
            textBox2.load("resources/textbox.png");
        }else{
            textBox2.load("resources/SPACEUNDERTALENULL.png");
        }
        if(picture.getX() == 390 && picture.getMaxX() == 442 && picture.getY() == 316 && picture.getMaxY() == 358){
            textBox3.load("resources/textbox.png");
        }else{
            textBox3.load("resources/SPACEUNDERTALENULL.png");
        }

        /////////////////////////////////////////////////////////

        if(picture.getX() == 109 && picture.getMaxX() == 161 && picture.getY() == 110 && picture.getMaxY() == 152){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 240 && picture.getMaxX() == 292 && picture.getY() == 73 && picture.getMaxY() == 115){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 240 && picture.getMaxX() == 292 && picture.getY() == 110 && picture.getMaxY() == 152){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 484 && picture.getMaxX() == 536 && picture.getY() == 91 && picture.getMaxY() == 133){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 484 && picture.getMaxX() == 536 && picture.getY() == 298 && picture.getMaxY() == 340){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 296 && picture.getMaxX() == 348 && picture.getY() == 298 && picture.getMaxY() == 340){
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

    public void getPosition(){
        System.out.println("Left: " + picture.getX());
        System.out.println("Right: " +picture.getMaxX());
        System.out.println("Top " +picture.getY());
        System.out.println("Bottom: " +picture.getMaxY());
    }

    public int getLeft(){
        return picture.getX();
    }
    public int getRight(){
        return picture.getMaxX();
    }
    public int getTop(){
        return picture.getY();
    }
    public int getBottom(){
        return picture.getMaxY();
    }

    public void deleteImage(){
        picture.delete();
        textBox.delete();
        textBox2.delete();
        textBox3.delete();
    }

    public void reDraw(){
        picture.draw();
        textBox.draw();
        textBox2.draw();
        textBox3.draw();
    }

}




