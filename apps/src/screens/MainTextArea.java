package screens;

import javax.swing.*;

public class MainTextArea {


	JTextArea textArea = new JTextArea(44, 65);

	public MainTextArea() {
		initialize();

	}

	private void initialize() {
		textArea.setText("Test");
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setVisible(true);

	}


	public JTextArea getTextArea() {

		return textArea;
	}

	public void setText(String text) {
		textArea.setText(text);
	}


}