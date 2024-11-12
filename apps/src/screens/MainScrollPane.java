package screens;

import javax.swing.*;
import java.awt.*;

public class MainScrollPane {

	JScrollPane scrollPane = new JScrollPane();

	public MainScrollPane() {

		initialize();
	}

	private void initialize() {
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setForeground(Color.DARK_GRAY);
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}
}

