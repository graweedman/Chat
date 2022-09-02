package menus;

import javax.swing.*;

import java.awt.event.*; 

import java.io.*;  
import java.util.HashMap;



public class MenuBar extends JMenuBar implements ActionListener {
    JMenu file;
    JMenuItem open;
    JTextArea ta;  
    public MenuBar() {
        file = new JMenu("file");
        open = new JMenuItem("Save As");
        open.addActionListener(this);
        file.add(open);
        ta=new JTextArea(800,800); 
        ta.setBounds(0,20,800,800); 
        setBounds(0,0,800,20); 
        add(file);
        add(ta);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
        // if(e.getSource()==open){    
        //     JFileChooser fc=new JFileChooser();    
        //     int i=fc.showOpenDialog(this);    
        //     if(i==JFileChooser.APPROVE_OPTION){    
        //         File f=fc.getSelectedFile();    
        //         String filepath=f.getPath();    
        //         try{  
        //         BufferedReader br=new BufferedReader(new FileReader(filepath));    
        //         String s1="",s2="";                         
        //         while((s1=br.readLine())!=null){    
        //         s2+=s1+"\n";    
        //         }    
        //         ta.setText(s2);    
        //         br.close();    
        //         }catch (Exception ex) {ex.printStackTrace();  }                 
        //     }    
        // }    
    }

    

}
