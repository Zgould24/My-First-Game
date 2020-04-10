// Main class for the Pong game
//
// Runs the main game loop.
//
// Fill in the code to complete the game. You must use an object-oriented style.
// DON'T PUT ALL YOUR CODE IN MAIN
//
// As a general rule, you should not access any object properties directly from 
// this class. Instead, make calls to object methods that do the work you need.

public class Pong {

    public static void main(String[] args) {

        /*** Initialize ***/
        Paddle left = new Paddle(true);
        Paddle right = new Paddle(false);
        PongBall ball = new PongBall();

        boolean playing = true;

        /*** Main game loop ***/        
        while (playing) {

            /*** Check for collisions ***/
            // Reverse ball's direction if it collides with a paddle
            ball.collidesWith(left);
            ball.collidesWith(right);

            /*** Update positions ***/
            // Call update methods to move objects
            ball.update();
            left.update(true);
            right.update(false);

            /*** Draw ***/
            // Clear the window
            StdDraw.clear();
            
            if(ball.atEdge()) {
                StdDraw.setPenColor (255, 0, 0);
                StdDraw.text(.5, .75, "You Lose");
            }
            // Call paddle and ball draw methods
            left.draw();
            right.draw();
            ball.draw();

            // Display changes
            StdDraw.show(10);

            /*** Check for winning condition ***/
            // Game is over if the Ball reaches the left or right edge
            if (ball.atEdge()) {
                playing = false;
            }

        }
    }

}