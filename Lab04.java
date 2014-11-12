/**
*
* Creates a group of Athletes and directs them to positions on the field
*
* @author Kent Collins
* @version 11 November, 2014
*/

import edu.fcps.karel2.Display;

public class Lab04 {
	
	public static void takeTheField(Athlete arg) {
		arg.move();
		arg.move();
		arg.move();
		arg.move();
		arg.turnRight();
		arg.move();
		arg.move();
	}

     public static void main(String[] args) {
          Display.openWorld("maps/arena.map");
          Display.setSize(10, 10);
          Athlete coach = new Athlete();
          coach.move();
          coach.move();
          coach.move();
          coach.move();
          coach.move();
          coach.move();
          coach.turnRight();
          Athlete annie = new Athlete();
          takeTheField(annie);
          Athlete boris = new Athlete();
          takeTheField(boris);
          Athlete chuck = new Athlete();
          takeTheField(chuck);
          Athlete dougie = new Athlete();
          takeTheField(dougie);
          Athlete emma = new Athlete();
          takeTheField(emma);
          Athlete franco = new Athlete();
          annie.move();
          annie.move();
          annie.move();
          annie.turnLeft();
          annie.move();
          annie.move();
          annie.turnAround();
          boris.move();
          boris.turnLeft();
          boris.move();
          boris.turnAround();
          chuck.move();
          chuck.move();
          chuck.move();
          chuck.move();
          chuck.move();
          chuck.turnLeft();
          chuck.move();
          chuck.turnAround();
          dougie.move();
          dougie.move();
          dougie.move();
          dougie.move();
          dougie.turnRight();
          emma.move();
          emma.move();
          emma.move();
          emma.turnRight();
          takeTheField(franco);
          franco.move();
          franco.move();
          franco.turnRight();
     }
}
