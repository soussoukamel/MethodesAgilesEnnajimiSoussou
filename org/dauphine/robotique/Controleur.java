
package org.dauphine.robotique;

public class Controleur
{
    private Robot robot;

    public Controleur(Robot robot)
    {
    	// Gestion du cas où le controleur n'est associé à aucun robot
    	if (robot == null){
    		this.robot = new Robot();
    	}
    	else{
    		this.robot = robot;
    	}
    }

    public void deplacerRobot(double x, double y)
    {
        robot.seDeplacer(x, y);
    }
    
    public Robot getRobot(){
    	return robot;
    }
    
}
