package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
		//2. create an array of 5 robots.
Robot[] robs = new Robot[5];
		//3. use a for loop to initialize the robots.
for(int i=0; i<5; i++) {
	robs[i] = new Robot();
	robs[i].setY(550);
	robs[i].setX(170*i);
}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
Random rand = new Random();
do {
for(int i=0; i<5; i++) {
	robs[i].setSpeed(25);
	robs[i].move(rand.nextInt(50));
	System.out.println(robs[i].getY());
}
} while(robs[3].getY()>=10);
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
System.out.println("winner!");    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

}
}
//||robs[1].getY()>=10||robs[2].getY()>=10||robs[3].getY()>=10||robs[4].getY()>=10