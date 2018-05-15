import processing.core.PApplet;

public class Ecker_RectQuiz extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Ecker_RectQuiz", args);
    }

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        frameRate(120);
        background(255,255,255,255);
    }
    public void draw() {
        int x = (width - mouseX)/2;
        int y = (width - mouseX)/2;

        background(255,255,255,255);
        rect(x, y, mouseX, mouseX);
    }
}