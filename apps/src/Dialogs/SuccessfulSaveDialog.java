package Dialogs;

import javax.swing.*;

public class SuccessfulSaveDialog {

	public SuccessfulSaveDialog() {

	}

	public String saveInquiryDialog() {
		return JOptionPane.showInputDialog("Please input title");
	}

	public void saveDialog() {
		JOptionPane.showMessageDialog(null, "Successfully saved!", null, JOptionPane.INFORMATION_MESSAGE);
	}
}
