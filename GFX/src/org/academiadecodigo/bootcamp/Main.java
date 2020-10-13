package org.academiadecodigo.bootcamp;

import com.bornander.imagetest.MainWindow;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Rectangle rect = new Rectangle(0, 0, 2500, 2500);
        rect.setColor(Color.BLACK);
        rect.fill();
        //MainWindow mainWindow = new MainWindow("resources/mapanovo.png");



        Cadet luis = new Cadet();
        MC lulu = new MC();

        Control control = new Control();
        control.init();
        control.setMc(lulu);
        control.setCadet(luis);




    }
}
