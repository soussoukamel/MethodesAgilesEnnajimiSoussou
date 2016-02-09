
package org.dauphine.robotique;


public class Robot
{
    private double positionX;
    private double positionY;
   

    /**
     * Constructor for objects of class Robot
     */
    public Robot()
    {
        // initialise instance variables
        positionX = 0;
        positionY = 0;
    }

    public double getPositionX()
    {
        return positionX;
    }
    
    public double getPositionY()
    {
        return positionY;
    }
    
    public void seDeplacer(double x, double y)
    {
        positionX += x;
        positionY += y;
    }
}
