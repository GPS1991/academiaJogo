package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Control implements KeyboardHandler {

    private Keyboard keyboard;
    private Char mc;
    private Cadet cadet;
    private Textbox textbox;
    private MC2 GPS = new MC2();


    public void init(){

        keyboard = new Keyboard(this);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(right);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(up);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(down);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(left);

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(space);

        KeyboardEvent k = new KeyboardEvent();
        k.setKey(KeyboardEvent.KEY_K);
        k.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(k);

        KeyboardEvent b = new KeyboardEvent();
        b.setKey(KeyboardEvent.KEY_B);
        b.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(b);
    }
    public void setMc(Char mc){
                this.mc = mc;
    }

    public void setCadet(Cadet cadet) {
        this.cadet = cadet;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == 38) {
            mc.moveUp();
            GPS.moveUp();
        } else if (keyboardEvent.getKey() == 39) {
            mc.moveRight();
            GPS.moveRight();
        } else if(keyboardEvent.getKey() == 40){
            mc.moveDown();
            GPS.moveDown();
        } else if(keyboardEvent.getKey() == 37){
            mc.moveLeft();
            GPS.moveLeft();
        }
        else if(keyboardEvent.getKey() == 32) {
            mc.getPosition();
        }
        else if(keyboardEvent.getKey() == 75){
            if(mc.getLeft() == 71+620 && mc.getRight() == 123+620 && mc.getTop() == 204+290 && mc.getBottom() == 246+290){
                cadet.load2nd();
                cadet.setNewMap(true);
                mc.deleteImage();
                setMc(GPS);
            }
            if(mc.getLeft() == 296+620 && mc.getRight() == 348+620 && mc.getTop() == 73+290 && mc.getBottom() == 115+290){
                cadet.load3rd();
                cadet.setNewMap(true);
                mc.deleteImage();
            }
            if(mc.getLeft() == 371+620 && mc.getRight() == 423+620 && mc.getTop() == 316+290 && mc.getBottom() == 358+290){
                cadet.load4th();
                cadet.setNewMap(true);
                mc.deleteImage();
            }
        }
        else if (keyboardEvent.getKey() == 66 && cadet.isNewMap() ) {
            cadet.load();
            cadet.setNewMap(false);
            setMc(mc);
            mc.reDraw();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }



}

