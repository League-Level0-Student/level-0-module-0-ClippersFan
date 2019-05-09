package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Is there something in particular that you like?");
		JOptionPane.showMessageDialog(null,input+ " is awesome ");
	}
}
