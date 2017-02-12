import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
Robot mrrobo=new Robot();
mrrobo.setPenWidth(5);
mrrobo.moveTo(100,100);
mrrobo.hide();
mrrobo.setSpeed(5);
mrrobo.turn(90);
mrrobo.penDown();
for(int i=0;i<360;i++){
mrrobo.setRandomPenColor();
mrrobo.turn(1);
mrrobo.move(1);
}
}
}
