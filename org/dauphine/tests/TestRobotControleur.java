
package org.dauphine.tests;

import org.dauphine.robotique.Controleur;
import org.dauphine.robotique.Robot;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestRobotControleur
{
    private Robot robot1;
    private Controleur controle1;

    public TestRobotControleur()
    {
    }

    @Before
    public void setUp()
    {
        //robot1 = new Robot();
    	
    	// Dans le cas où on a un controleur sans robot 
        controle1 = new Controleur(null);
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testDeplacerRobot()
    {
    	System.out.println("--- BEFORE TEST METHOD deplacerRobot ---");
    	System.out.println("X: "+ controle1.getRobot().getPositionX());
        System.out.println("Y: "+ controle1.getRobot().getPositionY());
        controle1.deplacerRobot(12.4, 6.3);
        System.out.println("--- AFTER TEST METHOD deplacerRobot ---");
        System.out.println("X: "+ controle1.getRobot().getPositionX());
        System.out.println("Y: " + controle1.getRobot().getPositionY());
    }
}

