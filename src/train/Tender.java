package train;

import comp127graphics.Rectangle;

import java.awt.*;

public class Tender extends TrainCar {

    /* Dimensions of the coal tender */
    public static final double TENDER_WIDTH = 45*SCALE;
    public static final double TENDER_HEIGHT = 4 *SCALE;

    public Tender(Color color){
        super(color);
        drawTender(0, getCarHeight(), color);
    }

    private void drawTender(double x, double y, Color color){
        double xLeft = x + CONNECTOR;
        double yTop = y - CAR_BASELINE - CAR_HEIGHT - TENDER_HEIGHT;
        comp127graphics.Rectangle tender = new Rectangle(xLeft, yTop, TENDER_WIDTH, TENDER_HEIGHT);
        tender.setFillColor(color);
        tender.setFilled(true);
        this.add(tender);
    }


}
