package screens;

import javax.swing.*;

public class MainWindow {

	JFrame window = new JFrame();

	public MainWindow() {
		initialize();
		makeVisible();
	}

	public void makeVisible() {
		window.setVisible(true);
	}

	public void initialize() {
		window.setTitle("Text-micro");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(750, 750);
		window.setLocationRelativeTo(null);
		window.setResizable(true);
	}

	public JFrame getWindow() {
		return this.window;
	}

}

