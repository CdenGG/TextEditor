package Dialogs;

import javax.swing.*;

public class SuccessfulSaveDialog {

	public SuccessfulSaveDialog() {

	}

	public void saveDialog() {
		JOptionPane.showMessageDialog(null, "Successfully saved!", "Saving...", JOptionPane.INFORMATION_MESSAGE);
	}
}
