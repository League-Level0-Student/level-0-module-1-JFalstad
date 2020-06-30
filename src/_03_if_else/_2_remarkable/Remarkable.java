package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String Jordan = "He plays Basketball";
		String Cody = "He teaches coding";
		String Brody = "He plays in the same league as Jordan";
		
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String askName = JOptionPane.showInputDialog(null, "Enter a name.");
		// 3. In a pop-up, tell the user what is remarkable about that person.
		if (askName.equalsIgnoreCase ("Jordan")) {
			JOptionPane.showMessageDialog(null, Jordan);
		}
		if (askName.equalsIgnoreCase("Cody")) {
			JOptionPane.showMessageDialog(null, Cody);
		}
		if (askName.equalsIgnoreCase ("Brody")) {
				JOptionPane.showMessageDialog(null, Brody);
		}
	
		}

	}


