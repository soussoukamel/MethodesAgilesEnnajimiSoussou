
package org.dauphine.tests;

import org.dauphine.robotique.Robot;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class RobotTestUnit
{
	
    public RobotTestUnit()
    {
    }

    
    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testSeDeplacer()
    {
        Robot robot1 = new Robot();
        robot1.seDeplacer(2.4, 7.1);
    }
}

