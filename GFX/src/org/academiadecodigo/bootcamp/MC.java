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
    private Picture picture = new Picture(710, 625, "resources/wraith.png");

    public MC() {
        picture.draw();
        left = picture.getX();
        right = picture.getMaxX();
        top = picture.getY();
        bottom = picture.getMaxY();
        textBox = new Picture(30+620,180+290, "resources/SPACEUNDERTALENULL.png");
        textBox.draw();
        textBox2 = new Picture(350+620, 50+290, "resources/SPACEUNDERTALENULL.png");
        textBox2.draw();
        textBox3 = new Picture( 350+620, 290+290, "resources/SPACEUNDERTALENULL.png");
        textBox3.draw();

    }

    public void moveUp() {
        if(picture.getX() == 691 && picture.getMaxX() == 743 && picture.getY() == 513 && picture.getMaxY() == 555){
            textBox.load("resources/textbox.png");
        } else {
            textBox.load("resources/SPACEUNDERTALENULL.png");
        }
        if(picture.getX() == 916 && picture.getMaxX() == 968 && picture.getY() == 381 && picture.getMaxY() == 423){
            textBox2.load("resources/textbox.png");
        }
        if(picture.getX() == 973 && picture.getMaxX() == 1025 && picture.getY() == 606 && picture.getMaxY() == 648){
            textBox3.load("resources/textbox.png");
        } else{
            textBox3.load("resources/SPACEUNDERTALENULL.png");
        }
        /////////////////////////////////////////////////////////

        if(picture.getX() == 710 && picture.getMaxX() == 762 && picture.getY() == 419 && picture.getMaxY() == 171 + 290){
            picture.translate(0, 0);
            System.out.println(picture.getY());
            return;
        }if(picture.getX() == 221+620 && picture.getMaxX() == 273+620 && picture.getY() == 91+290 && picture.getMaxY() == 133+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 465+620 && picture.getMaxX() == 517+620 && picture.getY() == 110+290 && picture.getMaxY() == 152+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 465+620 && picture.getMaxX() == 517+620 && picture.getY() == 316+290 && picture.getMaxY() == 358+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 278+620 && picture.getMaxX() == 330+620 && picture.getY() == 316+290 && picture.getMaxY() == 358+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() >= 71+620 && picture.getMaxX() <= 161+620 && picture.getY() > 73+290 && picture.getMaxY() <= 377+290 // LEFT BOX

                || picture.getX() >= 71+620 && picture.getMaxX() <= 560+620 && picture.getY() > 73+290 && picture.getMaxY() <= 152+290 // TOP BOX

                || picture.getX() >= 428+620 && picture.getMaxX() <= 560+620 && picture.getY() > 73+290 && picture.getMaxY() <= 358+290 // RIGHT BOX

                || picture.getX() >= 249+620 && picture.getMaxX() <= 560+620 && picture.getY() > 279+290 && picture.getMaxY() <= 358+290) { // BOTTOM BOX
            picture.translate(0, -18.75);
        }
        System.out.println(picture.getY());
    }


    public void moveRight() {
        if(picture.getX() == 71+620 && picture.getMaxX() == 123+620 && picture.getY() == 223+290 && picture.getMaxY() == 265+290){
            textBox.load("resources/textbox.png");
        } else {
            textBox.load("resources/SPACEUNDERTALENULL.png");
        }
        if(picture.getX() == 278+620 && picture.getMaxX() == 330+620 && picture.getY() == 73+290 && picture.getMaxY() == 115+290){
            textBox2.load("resources/textbox.png");
        }else{
            textBox2.load("resources/SPACEUNDERTALENULL.png");
        }
        if(picture.getX() == 353+620 && picture.getMaxX() == 405+620 && picture.getY() == 316+290 && picture.getMaxY() == 358+290){
            textBox3.load("resources/textbox.png");
        } else{
            textBox3.load("resources/SPACEUNDERTALENULL.png");
        }

        /////////////////////////////////////////////////////////

        if(picture.getX() == 71+620 && picture.getMaxX() == 123+620 && picture.getY() == 110+290 && picture.getMaxY() == 152+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 203+620 && picture.getMaxX() == 255+620 && picture.getY() == 73+290 && picture.getMaxY() == 115+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 203+620 && picture.getMaxX() == 255+620 && picture.getY() == 110+290 && picture.getMaxY() == 152+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 446+620 && picture.getMaxX() == 498+620 && picture.getY() == 91+290 && picture.getMaxY() == 133+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 446+620 && picture.getMaxX() == 498+620 && picture.getY() == 298+290 && picture.getMaxY() == 340+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 259+620 && picture.getMaxX() == 311+620 && picture.getY() == 298+290 && picture.getMaxY() == 340+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() >= 71+620 && picture.getMaxX() < 161+620 && picture.getY() >= 73+290 && picture.getMaxY() <= 377+290 // LEFT BOX

            || picture.getX() >= 71+620 && picture.getMaxX() < 540+620 && picture.getY() >= 73+290 && picture.getMaxY() <= 152+290  // TOP BOX

            || picture.getX() >= 428+620 && picture.getMaxX() < 540+620 && picture.getY() >= 73+290 && picture.getMaxY() <= 358+290 // RIGHT BOX

            || picture.getX() >= 249+620 && picture.getMaxX() < 540+620 && picture.getY() >= 279+290 && picture.getMaxY() <= 358+290) { // BOTTOM BOX
            picture.translate(18.75,0 );
        }
        System.out.println(picture.getMaxX());
    }

    public void moveDown() {
        if(picture.getX() == 71+620 && picture.getMaxX() == 123+620 && picture.getY() == 185+290 && picture.getMaxY() == 227+290){
            textBox.load("resources/textbox.png");
        }else{
            textBox.load("resources/SPACEUNDERTALENULL.png");
        }
        if(picture.getX() == 278+620 && picture.getMaxX() == 330+620 && picture.getY() == 73+290 && picture.getMaxY() == 115+290){
            textBox2.load("resources/textbox.png");
        }else{
            textBox2.load("resources/SPACEUNDERTALENULL.png");
        }
        if(picture.getX() == 371+620 && picture.getMaxX() == 423+620 && picture.getY() == 298+290 && picture.getMaxY() == 340+290){
            textBox3.load("resources/textbox.png");
        }

        /////////////////////////////////////////////////////////

        if(picture.getX() == 90+620 && picture.getMaxX() == 142+620 && picture.getY() == 91+290 && picture.getMaxY() == 133+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 221+620 && picture.getMaxX() == 273+620 && picture.getY() == 91+290 && picture.getMaxY() == 133+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 465+620 && picture.getMaxX() == 517+620 && picture.getY() == 73+290 && picture.getMaxY() == 115+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 465+620 && picture.getMaxX() == 517+620 && picture.getY() == 279+290 && picture.getMaxY() == 321+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 278+620 && picture.getMaxX() == 330+620 && picture.getY() == 279+290 && picture.getMaxY() == 321+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() >= 71+620 && picture.getMaxX() <= 161+620 && picture.getY() >= 73+290 && picture.getMaxY() < 377+290 // LEFT BOX

            || picture.getX() >= 71+620 && picture.getMaxX() <= 560+620 && picture.getY() >= 73+290 && picture.getMaxY() < 152+290 // TOP BOX

            || picture.getX() >= 428+620 && picture.getMaxX() <= 560+620 && picture.getY() >= 73+290 && picture.getMaxY() < 358+290 // RIGHT BOX

            || picture.getX() >= 249+620 && picture.getMaxX() <= 560+620 && picture.getY() >= 279+290 && picture.getMaxY() < 358+290) { // BOTTOM BOX
            picture.translate(0, 18.75);
        }
        System.out.println(picture.getMaxY());
    }

    public void moveLeft() {
        if(picture.getX() == 90+620 && picture.getMaxX() == 142+620 && picture.getY() == 204+290 && picture.getMaxY() == 246+290){
            textBox.load("resources/textbox.png");
        }
        if(picture.getX() == 315+620 && picture.getMaxX() == 367+620 && picture.getY() == 73+290 && picture.getMaxY() == 115+290){
            textBox2.load("resources/textbox.png");
        }else{
            textBox2.load("resources/SPACEUNDERTALENULL.png");
        }
        if(picture.getX() == 390+620 && picture.getMaxX() == 442+620 && picture.getY() == 316+290 && picture.getMaxY() == 358+290){
            textBox3.load("resources/textbox.png");
        }else{
            textBox3.load("resources/SPACEUNDERTALENULL.png");
        }

        /////////////////////////////////////////////////////////

        if(picture.getX() == 109+620 && picture.getMaxX() == 161+620 && picture.getY() == 110+290 && picture.getMaxY() == 152+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 240+620 && picture.getMaxX() == 292+620 && picture.getY() == 73+290 && picture.getMaxY() == 115+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 240+620 && picture.getMaxX() == 292+620 && picture.getY() == 110+290 && picture.getMaxY() == 152+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 484+620 && picture.getMaxX() == 536+620 && picture.getY() == 91+290 && picture.getMaxY() == 133+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 484+620 && picture.getMaxX() == 536+620 && picture.getY() == 298+290 && picture.getMaxY() == 340+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 296+620 && picture.getMaxX() == 348+620 && picture.getY() == 298+290 && picture.getMaxY() == 340+290){
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() > 71+620 && picture.getMaxX() <= 161+620 && picture.getY() >= 73+290 && picture.getMaxY() <= 377+290 // LEFT BOX

            || picture.getX() > 71+620 && picture.getMaxX() <= 560+620 && picture.getY() >= 73+290 && picture.getMaxY() <= 152+290 // TOP BOX

            || picture.getX() > 428+620 && picture.getMaxX() <= 560+620 && picture.getY() >= 73+290 && picture.getMaxY() <= 358+290 // RIGHT BOX

            || picture.getX() > 260+620 && picture.getMaxX() <= 560+620 && picture.getY() >= 279+290 && picture.getMaxY() <= 358+290) { // BOTTOM BOX
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




