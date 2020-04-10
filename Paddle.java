import java.awt.event.KeyEvent;

public class Paddle {

    public double x, y;  // Center position, both are in (0, 1)
    private double halfWidth, halfHeight;  // Size
    private final double step = .01;  // Distance to move on each key press
    private boolean isLeft;

    /*** Constructor ***/
    public Paddle(boolean isLeft) {
        
        // Starting position for the left paddle
        if (isLeft) {
            this.x = .01;
            this.y = .50;
        }
        
        // Starting position for the right paddle
        else {
            this.x = .99;
            this.y = .50;
        }
        
        this.halfWidth = .01;
        this.halfHeight = .10;
    }
    
    /*** Move the Paddle ***/
    public void update(boolean isLeft) {
        
        // Test for keypress and update y position appropriately
        // Review the code from the last lab
        // You need to import java.awt.event.KeyEvent
        if (isLeft && StdDraw.isKeyPressed(KeyEvent.VK_W)) {
            this.y += this.step;
        }  else if (isLeft && StdDraw.isKeyPressed(KeyEvent.VK_S)) {
            this.y -= this.step;
        }  
        
        if (!isLeft && StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
            this.y += this.step;
        } else if (!isLeft && StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
            this.y -= this.step;
        }
        
        // Left paddle should use w and s keys for up and down
        
        // Right paddle uses up and down arrow keys
    }
    
    public double right() {
        return this.x + this.halfWidth;
    }
    public double left() {
        return this.x - this.halfWidth;
    }
    public double top() {
        return this.y + this.halfHeight;
    }
    public double bottom() {
        return this.y - this.halfHeight;
    }

    /*** Draw this paddle using StdDraw functions ***/
    public void draw() {    
        StdDraw.setPenColor(0, 0, 0);
        StdDraw.filledRectangle(this.x, this.y, this.halfWidth, this.halfHeight);
    }
}