package files;


import screens.SuccessfulSaveDialog;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	SuccessfulSaveDialog saveDialog = new SuccessfulSaveDialog();
	private JTextArea textArea;


	public WriteFile() {

	}

	public WriteFile(JTextArea textArea) {
		this.textArea = textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public void toTextFile() {

		try (FileWriter writer = new FileWriter("output.txt")) {
			writer.write(textArea.getText());

			saveDialog.saveDialog();
			System.out.println("File written successfully.");
			System.out.println("Working Directory = " + System.getProperty("user.dir"));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
