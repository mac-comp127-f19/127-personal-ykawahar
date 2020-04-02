package activityStarterCode.objects;
import java.util.Random;

public class Die {

    private int faceValue, maxDieValue;
    private final int defaultMAX = 6;
    private Random random = new Random();

    public Die() {
        maxDieValue = defaultMAX;
    }

    public Die(int maxValue) {
        maxDieValue = maxValue;

    }

    public void roll() {
        faceValue = random.nextInt(maxDieValue) + 1;

    }

//    private void setFaceValue(int value) {
//        faceValue = value;
//    }

    public int getFaceValue() {
        return faceValue;
    }

@Override
    public String toString() {
//

        if (faceValue == 1) {
            return "one";
        } else if (faceValue == 2) {
            return "two";
        } else if (faceValue == 3) {
            return "three";
        } else if (faceValue == 4) {
            return "four";
        } else if (faceValue == 5) {
            return "five";
        } else if (faceValue == 6) {
            return "six";
        } else if (faceValue == 7) {
            return "seven";
        } else if (faceValue == 8) {
            return "eight";
        } else if (faceValue == 9) {
            return "nine";
        } else {
            String string = Integer.toString(faceValue);
            return string;
        }
    }
}


