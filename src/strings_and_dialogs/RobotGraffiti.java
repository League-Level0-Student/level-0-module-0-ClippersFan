package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {


	public static void main(String[] args) {
		Robot jeff = new Robot();
		jeff.setSpeed(100);
		jeff.penDown();
		jeff.move(200);
		jeff.turn(125);
		jeff.move(100);
		jeff.turn(125);
		jeff.move(90);
		jeff.turn(250);
		jeff.move(150);
}
}

