
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

import com.spun.util.velocity.ParseCall;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("how old are you");
	int agenum = Integer.parseInt(age);
	if (agenum < 30) {
	agenum = 2016 - agenum;
	System.out.println(agenum);
	}
	else {
	System.out.println("you are too old to play this game");
	}
}
}
