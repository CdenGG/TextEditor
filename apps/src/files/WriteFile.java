package files;


import Dialogs.SuccessfulSaveDialog;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	SuccessfulSaveDialog saveDialog = new SuccessfulSaveDialog();
	private JTextArea textArea;
	private String fileName = "";


	public WriteFile() {

	}

	public WriteFile(JTextArea textArea, String fileName) {
		this.fileName = fileName;
		this.textArea = textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}



	public void toTextFile() {
		fileName = saveDialog.saveInquiryDialog();

		if (fileName.isEmpty()) {
			fileName = "DEFAULT";
		}

		String fileType = ".txt";
		try (FileWriter writer = new FileWriter(fileName.concat(fileType))) {
			writer.write(textArea.getText());

			saveDialog.saveDialog();
			System.out.println("File written successfully.");
			System.out.println("Working Directory = " + System.getProperty("user.dir"));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
