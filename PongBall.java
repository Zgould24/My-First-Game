 // The Ball for the Pong game
// CMS 167, Spring 2019

public class PongBall {

    private double x, y;  // Center position, both are in (0, 1)
    private double radius;  // Size
    private double dx, dy;  // Velocity (change in position on each step)

    /*** Constructor ***/
    public PongBall() {
        this.x = .5;
        this.y = .5;
        this.radius = .015;
        this.dx = -.008;
        this.dy = .005;
    }

    /*** Move the ball ***/
    //
    // Reflects off of the top and bottom edges
    public void update() {
        if (this.y + this.radius > 1.0 || this.y - this.radius < 0.0) {
            this.dy = -this.dy;  
        }

        this.x += dx;
        this.y += dy;
    }

    /*** Return true if this Ball has reached left or right edge, false otherwise ***/
    public boolean atEdge() {
        if (this.x + this.radius >= 1.0 || this.x - this.radius <= 0.0) {
            return true;
        }
        return false;
    }
    
    /*** Check if this Ball collides with a Paddle ***/
    public void collidesWith(Paddle paddle) {
        double right = this.x + this.radius;
        double left = this.x - this.radius;
        double top = this.y + this.radius;
        double bottom = this.y - this.radius;
        // Review code from the last lab for testing collisions
        // If there is a collision, reverse the Ball's movement in the x direction
        if ( right < paddle.left()) {
            this.dx = -this.dx;
        }  else if (left > paddle.right()) {
            this.dx = -this.dx;
        }  else if (bottom > paddle.top()) {
            this.dx = -this.dx;
        }  else if (top < paddle.bottom()) {
            this.dx = -this.dx;
        }
        
    }

    /*** Draw this ball using StdDraw functions ***/
    public void draw() {
        StdDraw.setPenColor(0,0,0);
        StdDraw.filledCircle(this.x, this.y, this.radius);
    }
}