package main;

import javax.swing.*;
import screens.*;
import screens.addtowindow.add;

import java.awt.*;


public class Main {

    public static void main(String[] args) {

       SwingUtilities.invokeLater(new Runnable() {

        @Override
        public void run() {

            MainPanel mainPanel = new MainPanel();
            MainWindow mainWindow = new MainWindow();
            add addToMainWindow = new add();
            
            

            // adds panel to main window
            addToMainWindow.addPanel(mainWindow.getWindow(), mainPanel.getPanel());
            
            mainPanel.setPanelBackgroundColor("BLACK");

           
           
            

        }
       });

       

    }

}


