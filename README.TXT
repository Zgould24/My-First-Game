PONG -- CMS 167 Spring 2019
===========================


Due Wednesday, April 24, at 11:59 PM


Description
-----------
In this project you'll use the object-oriented programming 
skills we've been 
developing to write a Pong game using StdDraw methods.

This will allow you to continue practicing writing classes, encapsulating data,
and writing object 
methods.


Classes
-------
This ZIP file contains four classes.

- Pong.java: the main game loop

- Paddle.java: represents the player-controlled paddles

- PongBall.java: the ball, 
similar to the Ball class we wrote last week.

- StdDraw.java

You should be able to open the Pong directory as a BlueJ project using Project
--> Open Project.

To submit, find 
the directory that contains your project, then ZIP it and upload
the ZIP file to Blackboard. To compress the directory into a ZIP file, you can
probably right-click 
(or CTRL + click on Mac) on it and choose Compress... from
your list of options.


Code
----
Start by looking at the main game loop, which has been written for you. 
Notice 
how it looks similar to out other loops. It uses update methods to move the ball
and paddles, tests for collisions, and the uses draw methods to render everything 
to 
the screen. 

Notice that **everything is handled by calling object methods**. We do not
directly access object properties from the main game loop.

The PongBall class is similar 
to the ball we wrote last week. It has an update
method that moves it around the screen and reflects off the top and bottom of
the window.

You'll need to fill in a few methods 
for the PongBall

- collidesWith, which tests if the ball hits a Paddle and reflects it in the
  x direction if it does
  
- atEdge, which tests if the ball is at the left or 
right edge. This method is
  uses to end the game.

The Paddle has five parameters:

- x and y, the x and y positions of the rectangle's center

- halfWidth and halfHeight, the 
dimensions of the paddle

- isLeft, which is true for the left Paddle object and false for the right one

Look at the constructor and see how isLeft is used to initialize paddles on the
left and right sides.

You need to fill in the update method:

- Use the up and down arrow keys to move the right paddle.

- Use the w and s keys to move the left paddle.

Tips
----
This program doesn't require that much code, but it's larger and more complicated
than anything we've previously written.

First, make sure you can run the game as it is. You should see the paddles and
ball animate and the ball move and bounce off the top of the screen.

Start by looking carefully at every file. Begin in the main loop and trace the
flow of execution into all of the methods. Don't write any code until you
understand what each method is really supposed to do and its role in the game.

Develop incrementally, add one element at a time, and then test. Make sure that
each new feature you add is correct before you move on to the next one.

For example, you might start by making the left paddle move, then make the right
Paddle move. Then you can test if the ball is at an edge and stop the game if it
is, and so 
forth.

Developing incrementally makes it easier to locate problems, since you're always
making small changes to programs that have previously worked.

