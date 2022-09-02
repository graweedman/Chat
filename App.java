import javax.swing.*;

import menus.*;

import java.awt.event.*;    
import java.io.*;   

public class App extends JFrame{
    JTextArea textArea = new JTextArea(800,800);
    MenuBar menu = new MenuBar();
    App(int width, int height) {
        add(menu);
        add(textArea);
        setSize(width, height);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {  
        System.out.println("Hello Java");  
        App main = new App(500,500);
        
        main.setDefaultCloseOperation(EXIT_ON_CLOSE);
       }  
   
}
