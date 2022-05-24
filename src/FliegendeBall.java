import processing.core.PApplet;
public class FliegendeBall extends PApplet {

    public static void main(String[] args) {

        PApplet.runSketch(new String[]{""}, new FliegendeBall());
    }
    float xPosition = 400;
    float yPosition = 200;
    float xSpeed = 5;
    float ySpeed = 5;
    public void settings(){
        size(500, 500);
println("yPosition");
    }
    public void setup(){
        frameRate(40);
    }
    public void draw(){
        background(0);
        ellipse(xPosition, yPosition, 30, 30);
        xPosition += xSpeed;
        yPosition += ySpeed;
        if (xPosition < 0 | xPosition > width) {
            xSpeed = xSpeed * -1;
            fill(252, 219, 3);
        }
        if (yPosition < 0| yPosition > height) {
            ySpeed = ySpeed * -1;
            fill(194, 21, 16);
        }
    }

}