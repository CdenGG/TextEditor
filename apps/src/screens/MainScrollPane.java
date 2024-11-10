package screens;

import javax.swing.*;

public class MainScrollPane {

	JScrollPane scrollPane = new JScrollPane();

	public MainScrollPane() {

		initialize();
	}

	private void initialize() {
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}
}

