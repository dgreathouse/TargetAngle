# Target angle simulation
This code is only meant to allow simulation in the WPILib Visual Code environment.
There is a target angle that needs to be calculated from the joystick x and y values.

We need to use the joystick to point the robot to an exact angle of:
0,60,90,120,180,-60,-90,-120

The values of (+/-)60 and (+/-)120 can be variable based on the user needs.
This allows the driver to accurately set the angle needed from predefined locations on the field without guessing where the robot is facing.
This algorithm uses the joystick which is +/- 1 for x and y.
Then calculates one of the angles if the hypoteneus is greater than a 0.8 margin.
In other words the algorithm will not calculate a new value until the joystick is near the edges of its limit.
