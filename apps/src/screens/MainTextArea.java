package screens;

import javax.swing.*;
import java.awt.*;

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
		textArea.setBackground(Color.BLACK);
		textArea.setCaretColor(Color.WHITE);

		textArea.setForeground(Color.WHITE);

	}


	public JTextArea getTextArea() {

		return textArea;
	}

	public void setText(String text) {
		textArea.setText(text);
	}


}