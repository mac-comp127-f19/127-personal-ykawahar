package train;

import java.awt.*;
import java.util.Random;

import comp127graphics.*;
import comp127graphics.Rectangle;

public class FaceCar extends TrainCar {

    private GraphicsGroup emojis;

    private Color color;
    private Random rand;

    public FaceCar(Color color){
        super(color);
        drawLines(0, getCarHeight());
        drawFace(0, getCarHeight());


    }

    private void drawFace(double x, double y){
        emojis = new Emojis();
        double xLeft = x + CONNECTOR + CAR_WIDTH / 2 - emojis.getWidth()/2;
        double yFace = y - CAR_BASELINE - CAR_HEIGHT/2 - emojis.getHeight()/2;

        emojis.setPosition(xLeft, yFace);

        this.add(emojis);
    }

    private void drawLines(double x, double y){
        for (int i = 1; i < 7; i++) {
            double yLine = y - CAR_BASELINE - i*CAR_HEIGHT/7;
            Line line = new Line(x + CONNECTOR, yLine, x+CONNECTOR+CAR_WIDTH, yLine);
            this.add(line);
        }

    }

}
