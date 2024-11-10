package screens;


import javax.swing.*;
import java.awt.*;

public class MainPanel {
	JPanel panel = new JPanel();

	public MainPanel() {
		initialize();
	}

	private void initialize() {
		panel.setLayout(new BorderLayout());
	}

	public JPanel getPanel() {
		return panel;
	}
}

