package main;

import ActionListeners.ActionKeys;
import screens.MainPanel;
import screens.MainScrollPane;
import screens.MainTextArea;
import screens.MainWindow;

import javax.swing.*;
import java.awt.*;


public class Main {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				MainWindow mWindow = new MainWindow();
				JFrame mainWindow = mWindow.getWindow();

				MainPanel mPanel = new MainPanel();
				JPanel mainPanel = new JPanel();

				MainTextArea mTextArea = new MainTextArea();
				JTextArea mainTextArea = mTextArea.getTextArea();

				MainScrollPane mScrollPane = new MainScrollPane();
				JScrollPane mainScrollPane = mScrollPane.getScrollPane();

				ActionKeys actionKeys = new ActionKeys(mainTextArea);

				mainWindow.add(mainPanel);
				mainPanel.add(mainScrollPane, BorderLayout.CENTER);
				mainScrollPane.setViewportView(mainTextArea);
				mainTextArea.addKeyListener(actionKeys);


			}
		});


	}


}




