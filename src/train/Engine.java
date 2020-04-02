package train;

import comp127graphics.Line;
import comp127graphics.Rectangle;

import java.awt.*;

public class Engine extends TrainCar {

    /* Dimensions of the cab on the engine */
    public static final double CAB_WIDTH = 35*SCALE;
    public static final double CAB_HEIGHT = 8*SCALE;

    /* Dimensions of the smokestack and its distance from the front */
    public static final double SMOKESTACK_WIDTH = 8*SCALE;
    public static final double SMOKESTACK_HEIGHT = 8*SCALE;
    public static final double SMOKESTACK_INSET = 8*SCALE;

    private Color color;

    public Engine(Color color) {
        super(color);
        this.color = color;
        drawEngineCab(0, getCarHeight());
        drawSmokestack(0, getCarHeight());
        drawCowcatcher(0, getCarHeight());
    }

    /* Draws the engine cab */
    private void drawEngineCab(double x, double y) {
        double xLeft = x + CONNECTOR + CAR_WIDTH - CAB_WIDTH;
        double yTop = y - CAR_BASELINE - CAR_HEIGHT - CAB_HEIGHT;
        Rectangle cab = new Rectangle(xLeft, yTop, CAB_WIDTH, CAB_HEIGHT);
        cab.setFillColor(color);
        cab.setFilled(true);
        this.add(cab);
    }

    /**
     * Draws an engine whose origin is at (x, y)
     *
     * @param x The x origin
     * @param y The y origin
     */

    /* Draws the smokestack */
    private void drawSmokestack(double x, double y) {
        // You fill this in //
        double xLeft = x + SMOKESTACK_INSET + CONNECTOR;
        double yTop = y - CAR_BASELINE - CAR_HEIGHT - SMOKESTACK_HEIGHT;
        Rectangle smokestack = new Rectangle(xLeft, yTop, SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
        smokestack.setFillColor(color);
        smokestack.setFilled(true);
        this.add(smokestack);

    }

    /* Draws the cowcatcher in the front of the engine */
    private void drawCowcatcher(double x, double y) {
        // You fill this in //
        double x1 = x;
        double x2 = x+CONNECTOR/2;
        double x3 = x+CONNECTOR;
        double y1 = y-CAR_BASELINE;
        double y2 = y-CAR_BASELINE-CAR_HEIGHT/2;

        Line l1 = new Line(x1,y1,x3,y2);
        Line l2 = new Line(x2,y1,x3,y2);
        this.add(l1);
        this.add(l2);
    }

}