import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	 Robot jeff = new Robot();
   	 // 3. ask the user what color they would like the Robot to draw
    	String answer = JOptionPane.showInputDialog("what color would you like to draw in");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    if(answer.equalsIgnoreCase("blue")){
    jeff.setPenColor(Color.BLUE);
    }
    else{
    	jeff.setPenColor(Color.green);
    }
   	 // 2. set the pen width to 10
    jeff.setPenWidth(10);
    jeff.penDown();
   	 // 1. make the Robot draw a shape
   
    for (int i = 0; i < 4; i++) {
    jeff.move(100);
    jeff.turn(90);
    }
    jeff.hide();
    }

}

