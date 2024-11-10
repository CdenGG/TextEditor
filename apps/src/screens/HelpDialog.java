package screens;

import javax.swing.*;

public class HelpDialog {

	public HelpDialog() {

	}

	public void helpDialog() {
		JOptionPane.showMessageDialog(null, "F1: Save | F2: Help", "Help", JOptionPane.INFORMATION_MESSAGE);
	}
}
