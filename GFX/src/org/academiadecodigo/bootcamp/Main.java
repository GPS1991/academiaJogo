package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Main {
    public static void main(String[] args) {

       /*Rectangle rect = new Rectangle(10, 10, 200, 200);
        rect.setColor(Color.WHITE);
        rect.fill();*/


        Cadet luis = new Cadet();
        MC lulu = new MC();
        lulu.setCadet(luis);


        Control control = new Control();
        control.init();
        control.setMc(lulu);
    }
}
