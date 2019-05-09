package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What is your name?");
		String summer = JOptionPane.showInputDialog("What did you do over the summer?");
		JOptionPane.showMessageDialog(null, "I know that you did "+summer+" last summer," +input+". Muhahaha!");
	}

}
