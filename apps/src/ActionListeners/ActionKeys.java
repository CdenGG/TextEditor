package ActionListeners;

import files.WriteFile;
import Dialogs.HelpDialog;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ActionKeys implements KeyListener {


	HelpDialog helpDialog = new HelpDialog();
	JTextArea textArea;
	WriteFile writeFile = new WriteFile();
	// constructor
	public ActionKeys(JTextArea textArea) {
		setTextArea(textArea);
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
		writeFile.setTextArea(textArea);
	}


	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_F1) {

			writeFile.toTextFile();
		} else if (key == KeyEvent.VK_F2) {
			helpDialog.helpDialog();
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}