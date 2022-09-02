
import javax.swing.*;

import menus.*;

import java.awt.event.*;    
import java.io.*;   

import java.util.*;
import java.util.Map.Entry;

public class App extends JFrame implements ActionListener{
    MenuBar menu;
    public JTextArea textArea;

    //Creating Menu options
    LinkedHashMap<String, String[]> layout;
    App(int width, int height) {
        layout = new LinkedHashMap<String,String[]>();
        layout.put("file", new String[] {"open", "save", "save as..."});
        layout.put("help", new String[] {});

        
        menu = new MenuBar(layout,this);
        textArea = new JTextArea(800,800);
        textArea.setBounds(0,20,800,800); 
        add(menu);
        add(textArea);
        setSize(width, height);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        ActionManager manager = new ActionManager(e);
        manager.menu(this, textArea);
        
    }

    public static void main(String args[]) {  
        System.out.println("Hello Java");  
        App main = new App(500,500);
        
        main.setDefaultCloseOperation(EXIT_ON_CLOSE);
       }  
   
}
