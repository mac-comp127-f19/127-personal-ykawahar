package train;

import comp127graphics.*;
import comp127graphics.Rectangle;

import java.util.List;
import java.util.Random;

import java.awt.*;


/*
 * File: TrainDrawer.java
 * --------------------
 * This program draws a three-car train consisting on an engine,
 * a boxcar, and a caboose.  This implementation of the program,
 * however, is incomplete, and contains only the methods given
 * in the text.
 */

public class TrainDrawer {
    private static final Color
            SUN_YELLOW = new Color(0xffff78),
            SUN_BORDER_YELLOW = new Color(0xdcdc3c),
            SKY_BLUE = new Color(0x6ed6ff),
            CLOUD_COLOR = new Color(0x80ffffff, true),
            TREE_TRUNK_COLOR = new Color(0x553511),
            TREE_LEAVES_COLOR = new Color(0x17af13),
            GRASS_COLOR = new Color(0xbcda9f),
            MOUNTAIN_COLOR = new Color(0x769afe);

    public static final int SCALE = 2;
    private static final int
            SCENE_WIDTH = 1500,
            SCENE_HEIGHT = 800;

    private static Random random = new Random();


    // Instance variable for the canvas that you can add shapes to in order to have them be drawn.
    private CanvasWindow canvas;
    private Engine engine;
    private Boxcar boxcar, boxcar2, boxcar3;
    private Caboose caboose;
    private Tender coalTender;
    private FaceCar faceCar, faceCar2, faceCar3;

    private List<TrainCar> list;


    public static void main(String[] args) {
        TrainDrawer drawer = new TrainDrawer();
    }

    public TrainDrawer(){
        //Create a window and canvas to draw on
        canvas = new CanvasWindow("Train", 800, 500);
        canvas.setBackground(randomColorVariation(SKY_BLUE, 8));

        addMountains(canvas, randomDouble(400, 600), randomDouble(50, 300), randomInt(1, 3));
        addGround(canvas, 470);

        drawTrains(canvas);

    }

    private void drawTrains(CanvasWindow canvas){
        double trainWidth = 3 * TrainCar.CAR_WIDTH + 4 * TrainCar.CONNECTOR;
        double x = (canvas.getWidth() - trainWidth) / 2;
        double y = (canvas.getHeight());
        double dx = TrainCar.CAR_WIDTH + TrainCar.CONNECTOR;

        engine = new Engine(Color.BLACK);
        coalTender = new Tender(Color.BLACK);
        boxcar = new Boxcar(Color.GREEN);
        faceCar = new FaceCar(Color.PINK);
        boxcar2 = new Boxcar(Color.RED);
        faceCar2 = new FaceCar(Color.BLUE);
        boxcar3 = new Boxcar(Color.GRAY);
        caboose = new Caboose(Color.RED);

        list = List.of(engine, coalTender, boxcar, faceCar, boxcar2, faceCar2, boxcar3, caboose);

        for (TrainCar car : list ) {
            canvas.add(car, x + list.indexOf(car) * dx, y);
        }
    }



    private static void addMountains(CanvasWindow canvas, double baseY, double size, int layers) {
        for (int layer = layers - 1; layer >= 0; layer--) {
            canvas.add(createLayerOfMountains(baseY - layer * size * 0.2, size));
        }
    }

    /**
     * Fills the bottom of the screen with a solid color. Even emojis need to stand somewhere!
     *
     * @param horizonY The top of the “ground” rectangle.
     */
    private static void addGround(CanvasWindow canvas, double horizonY) {
        Rectangle ground = new Rectangle(
                0, horizonY,
                SCENE_WIDTH, SCENE_HEIGHT - horizonY);
        ground.setFillColor(randomColorVariation(GRASS_COLOR, 32));
        ground.setFilled(true);
        ground.setStroked(false);
        canvas.add(ground);
    }

    /**
     * Creates one layer of a mountain range.
     * @param layerBaseY The position of the feet of the mountains
     * @param size The maximum height of the peaks
     */
    private static GraphicsGroup createLayerOfMountains(double layerBaseY, double size) {
        GraphicsGroup group = new GraphicsGroup();

        double layerLeft = randomDouble(-size, 0);
        double layerRight = SCENE_WIDTH + size;
        Color layerColor = randomColorVariation(MOUNTAIN_COLOR, 16);

        double x = layerLeft;
        while (x < layerRight) {
            double curHeight = randomDouble(size * 0.4, size),
                    curWidth = curHeight * randomDouble(1.0, 1.6);
            Path peak = Path.makeTriangle(
                    x - curWidth, layerBaseY,
                    x, layerBaseY - curHeight,
                    x + curWidth, layerBaseY);
            peak.setFillColor(layerColor);
            peak.setFilled(true);
            peak.setStroked(false);
            group.add(peak);
            x += curWidth * 0.5;
        }
        return group;
    }

    // –––––– Randomness helpers –––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––

    /**
     * Convenience to return a random floating point number, min ≤ n < max.
     */
    private static double randomDouble(double min, double max) {
        return random.nextDouble() * (max - min) + min;
    }

    private static int randomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * Returns a slightly different color than the given one. Useful for making a bunch of items not
     * look entirely identical.
     */
    private static Color randomColorVariation(Color color, int amount) {
        return new Color(
                colorChannelVariation(color.getRed(), amount),
                colorChannelVariation(color.getGreen(), amount),
                colorChannelVariation(color.getBlue(), amount),
                color.getAlpha());
    }

    /**
     * Varies the given value randomly, pinned to [0...255].
     */
    private static int colorChannelVariation(int c, int amount) {
        return Math.min(255, Math.max(0, c + randomInt(-amount, amount)));
    }
}