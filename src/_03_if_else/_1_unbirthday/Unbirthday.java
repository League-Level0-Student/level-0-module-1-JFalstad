package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
String yourBirthday = JOptionPane.showInputDialog(null, "When is your Birthday?");
if (yourBirthday.equalsIgnoreCase("June 30, 2020")) {
	JOptionPane.showMessageDialog(null, "Happy Birthday!");
}

else {
	JOptionPane.showMessageDialog(null, "Merry Unbirthday!");	
}

}
}
