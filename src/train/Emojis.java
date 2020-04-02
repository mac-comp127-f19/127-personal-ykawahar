package train;

import comp127graphics.*;

import java.awt.*;
import java.util.Random;

@SuppressWarnings("WeakerAccess")
public class Emojis extends GraphicsGroup{
    private static final Color
        HEAD_COLOR = new Color(0xFFDE30),
        HEAD_OUTLINE_COLOR = new Color(0xAC9620),
        MOUTH_COLOR = new Color(0xE45B5B),
        EYE_COLOR = new Color(0x6E93F1),
        EYE_OUTLINE_COLOR = new Color(0x000000),
        REFLEX_COLOR = new Color(0xFFFFFF),
        KIRBY_COLOR = new Color(0xF2A9B2),
        DEDEDE_COLOR = new Color(0x4599F8),
        HAT_COLOR = new Color (0xD62E34),
        BEAK_COLOR = new Color(0xF19922);

        public double width;
        public double height;
        private double globalSize;


    public Emojis(){
        drawFace();
    }

    public void drawFace() {
        Random rand = new Random();
        int scale = TrainDrawer.SCALE;
        globalSize = 30*scale;

        GraphicsGroup face;

        int pickFace = rand.nextInt(5);
        switch (pickFace){
//            case 0:
//                face = createSmileyFace(50*scale);
//                break;
            case 1:
                face = createWinkingFace(globalSize);
                break;
            case 2:
                face = createPig(globalSize);

                break;
            case 3:
                face = createKirby(globalSize);
                break;
            case 4:
                globalSize = 25*scale;
                face = createDedede(globalSize);
                break;
            default:
                face = createSmileyFace(globalSize);
                break;
        }
//        face.setPosition(x, y);
        width = face.getWidth();
        height = face.getHeight();
        this.add(face);
    }


    /**
     * Creates a smiley face emoji.
     *
     * @param size The overall width and height of the emoji.
     * @return A graphic that you can add to a window, or place inside some other graphics group.
     */
    private GraphicsGroup createSmileyFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));


        GraphicsGroup eyeLeft = createEye(size * 0.1, size * 0.1);
        eyeLeft.setCenter(size * 0.65, size * 0.4);
        group.add(eyeLeft);

        GraphicsGroup eyeRight = createEye(size * 0.1, size * 0.1);
        eyeRight.setCenter(size * 0.35, size * 0.4);
        group.add(eyeRight);

        Arc mouth = createSmile(size * 0.6, size * 0.5, size);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;
    }

    private GraphicsGroup createWinkingFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));


        Line eyeLeft = createLine(size * 0.15);
        eyeLeft.setCenter(size * 0.65, size * 0.4);
        group.add(eyeLeft);

        GraphicsGroup eyeRight = createEye(size * 0.1, size * 0.1);
        eyeRight.setCenter(size * 0.35, size * 0.4);
        group.add(eyeRight);

        Arc mouth = createSmile(size * 0.6, size * 0.5, size);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;
    }

    private GraphicsGroup createKirby(double size) {
        GraphicsGroup group = new GraphicsGroup();

        Ellipse head = createHead(size, size);
        head.setFillColor(KIRBY_COLOR);
        group.add(head);

        Ellipse eyeLeft = new Ellipse(0, 0, size * 0.083, size * 0.36);
        eyeLeft.setCenter(size * 0.625, size * 0.45);
        eyeLeft.setFillColor(EYE_OUTLINE_COLOR);
        group.add(eyeLeft);

        Ellipse eyeRight = new Ellipse(0, 0, size * 0.083, size * 0.36);
        eyeRight.setCenter(size * 0.375, size * 0.45);
        eyeRight.setFillColor(EYE_OUTLINE_COLOR);
        group.add(eyeRight);

        return group;
    }

    private GraphicsGroup createDedede(double size) {
        GraphicsGroup group = new GraphicsGroup();

        Ellipse pompom = createHead(size * 0.45, size * 0.45);
        pompom.setCenter(size * 0.5, size * -0.20);
        pompom.setFillColor(REFLEX_COLOR);
        pompom.setStrokeColor(EYE_OUTLINE_COLOR);
        group.add(pompom);

        Ellipse hat = createHead(size, size);
        hat.setCenter(size * 0.5, size * 0.28);
        hat.setFillColor(HAT_COLOR);
        hat.setStrokeWidth(0);
        group.add(hat);

        Ellipse head = createHead(size, size);
        head.setFillColor(DEDEDE_COLOR);
        group.add(head);

        Ellipse scleraLeft = createHead(size * 0.4, size * 0.3);
        scleraLeft.setFillColor(REFLEX_COLOR);
        scleraLeft.setCenter(size * 0.7, size * 0.4);
        group.add(scleraLeft);

        Ellipse scleraRight = createHead(size * 0.4, size * 0.3);
        scleraRight.setFillColor(REFLEX_COLOR);
        scleraRight.setCenter(size * 0.3, size * 0.4);
        group.add(scleraRight);

        GraphicsGroup eyeLeft = createEye(size * 0.1, size * 0.15);
        eyeLeft.setCenter(size * 0.7, size * 0.4);
        group.add(eyeLeft);

        GraphicsGroup eyeRight = createEye(size * 0.1, size * 0.15);
        eyeRight.setCenter(size * 0.3, size * 0.4);
        group.add(eyeRight);

        Ellipse beakMiddle = createHead(size * 0.59, size * 0.69);
        beakMiddle.setCenter(size * 0.5, size * 0.72);
        beakMiddle.setFillColor(BEAK_COLOR);
        group.add(beakMiddle);

        Ellipse beakLeft = createHead(size * 0.35, size * 0.448);
        beakLeft.setCenter(size * 0.78, size * 0.68);
        beakLeft.setFillColor(BEAK_COLOR);
        beakLeft.setStrokeWidth(0);
        group.add(beakLeft);

        Ellipse beakRight = createHead(size * 0.35, size * 0.448);
        beakRight.setCenter(size * 0.22, size * 0.68);
        beakRight.setFillColor(BEAK_COLOR);
        beakRight.setStrokeWidth(0);
        group.add(beakRight);

//        Arc brim = new Arc(0,0, size, size * 0.5, 5, 170);
//        brim.setCenter(size * 0.5, size * 0.2);
//        brim.setStrokeColor(HEAD_COLOR);
//        brim.setStrokeWidth(30);
//        group.add(brim);

        Arc brim = new Arc(0,0, size * 1.177, size * 1.04, 25, 130);
        brim.setCenter(size * 0.5, size * 0.2);
        brim.setStrokeColor(HEAD_COLOR);
        brim.setStrokeWidth(size * 0.1);
        group.add(brim);

        Ellipse badge = createHead(size * 0.57, size * 0.46);
        badge.setCenter(size * 0.5, size * 0.01);
        badge.setStrokeWidth(0);
        group.add(badge);

        return group;
    }

    private GraphicsGroup createPig(double size) {
        GraphicsGroup group = new GraphicsGroup();

        Ellipse head = createHead(size, size);
        head.setFillColor(KIRBY_COLOR);
        group.add(head);

        GraphicsGroup nose = createKirby(size * 0.5);
        nose.setCenter(size * 0.5, size * 0.7);
        group.add(nose);

        GraphicsGroup eyeLeft = createEye(size * 0.1, size * 0.1);
        eyeLeft.setCenter(size * 0.65, size * 0.4);
        group.add(eyeLeft);

        GraphicsGroup eyeRight = createEye(size * 0.1, size * 0.1);
        eyeRight.setCenter(size * 0.35, size * 0.4);
        group.add(eyeRight);

        Ellipse earLeft = createHead(size * 0.35, size * 0.35);
        earLeft.setCenter(size * 0.1, size * 0.15);
        earLeft.setFillColor(KIRBY_COLOR);
        group.add(earLeft);

        Ellipse earRight = createHead(size * 0.35, size * 0.35);
        earRight.setCenter(size * 0.9, size * 0.15);
        earRight.setFillColor(KIRBY_COLOR);
        group.add(earRight);

        return group;
    }

    /**
     * Creates an empty emoji head. The head fits inside the box from (0,0)
     * to (width,height).
     */
    private static Ellipse createHead(double height, double width) {
        Ellipse head = new Ellipse(0, 0, width, height);
        head.setFillColor(HEAD_COLOR);
        head.setStrokeColor(HEAD_OUTLINE_COLOR);
        head.setStrokeWidth(2);
        return head;
    }

    /**
     * Creates a smile-shaped arc. The arc is measured relative to its “implied ellipse,” which is
     * the shape that would be formed if the arc were extend all the way around. The size of the
     * resulting arc will be smaller than the implied ellipse’s size.
     *
     * @param ellipseWidth  The width of the implied ellipse from which the smile’s arc is cut.
     * @param ellipseHeight The width of the implied ellipse from which the smile’s arc is cut.
     */
    private Arc createSmile(double ellipseWidth, double ellipseHeight, double size) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, 200, 140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(globalSize/40);
        return mouth;
    }

    public GraphicsGroup createEye(double width, double height) {
        GraphicsGroup group = new GraphicsGroup();

        Ellipse eye = new Ellipse(0, 0, width, height);
        eye.setFillColor(EYE_COLOR);
        eye.setStrokeColor(EYE_OUTLINE_COLOR);
        eye.setStrokeWidth(globalSize/40);
        group.add(eye);

        Ellipse pupil = new Ellipse(0,0, width * 0.6, height * 0.7);
        pupil.setCenter(width * 0.5, width * 0.5);
        pupil.setFillColor(EYE_OUTLINE_COLOR);
        pupil.setStrokeWidth(0);
        group.add(pupil);

        Ellipse reflexL = new Ellipse(0,0, width * 0.4, height * 0.45);
        reflexL.setCenter(width * 0.35, height * 0.4);
        reflexL.setFillColor(REFLEX_COLOR);
        reflexL.setStrokeWidth(0);
        group.add(reflexL);

        Ellipse reflexS = new Ellipse(0,0, width * 0.2, height * 0.2);
        reflexS.setCenter(width * 0.65, height * 0.8);
        reflexS.setFillColor(REFLEX_COLOR);
        reflexS.setStrokeWidth(0);
        group.add(reflexS);

        return group;
    }

    public Line createLine(double length) {
        Line eye = new Line(0, 0, length, 0);
        eye.setStrokeColor(EYE_OUTLINE_COLOR);
        eye.setStrokeWidth(globalSize/40);
        return eye;
    }

    public double getWidth(){
        return width;
    }

    public double getheight(){
        return height;
    }

}
