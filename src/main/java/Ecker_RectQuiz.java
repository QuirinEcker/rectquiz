import processing.core.PApplet;

public class Ecker_RectQuiz extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Ecker_RectQuiz");
    }

    public void settings() {
        size(500,500);
    }

    public void setup() {
        background(255,255,255,255);
    }

    public void draw() {
        rect(250,250, mouseX, mouseX );
    }
}
