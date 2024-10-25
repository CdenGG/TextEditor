package screens;
import java.awt.FlowLayout;
import java.awt.*;

import javax.swing.*;

public class MainPanel {

    JPanel panel = new JPanel();
  
    public MainPanel() {
        initialize();
    }


    


    public void initialize() { 
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(Color.BLUE);
        
    }
    // set background color presets (Black, White, Dark_Gray)
    public void setPanelBackgroundColor (String color) {
    
        switch(color) {
            case "BLACK": {
                panel.setBackground(Color.BLACK);
                break;
            }
            case "WHITE": {
                panel.setBackground(Color.WHITE);
                break;
            }
            case "DARK_GRAY": {
                panel.setBackground(Color.DARK_GRAY);
                break;
            }
         
        }


    }
    // customize background color
    public void setPanelBackgroundColor(JPanel panel, Color color) {
        panel.setBackground(color);
    }


    public JPanel getPanel() {

        return this.panel;
    }

       
}
