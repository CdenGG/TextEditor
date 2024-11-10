package Dialogs;

import javax.swing.*;

public class HelpDialog {

	public HelpDialog() {

	}

	public void helpDialog() {
		JOptionPane.showMessageDialog(null, "F1: Save | F2: Commands", "Commands", JOptionPane.INFORMATION_MESSAGE);
	}
}
