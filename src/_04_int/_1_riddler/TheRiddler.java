package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int holdScore = 0;                                                            
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog(null, "I am a three digit number. \r\n" + 
				"My tens digit is five more than my ones digit. \r\n" + 
				"My hundreds digit is eight less than my tens digit. \r\n" + 
				"What number am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (answer.contentEquals("194")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			holdScore ++; 
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else JOptionPane.showMessageDialog(null, "Incorrect!");
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, holdScore);
	}
}

