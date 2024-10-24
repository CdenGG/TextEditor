

import javax.swing.*;
import screens.*;



public class Main {


    public static void main(String[] args) {

       SwingUtilities.invokeLater(new Runnable() {

        @Override
        public void run() {
            MainWindow mainWindow = new MainWindow();
            mainWindow.show();
        }
       });


    }

}


