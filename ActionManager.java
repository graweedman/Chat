
import java.awt.event.*;
import javax.swing.*;   
import java.io.*;   

public class ActionManager {
    private ActionEvent event;
    private String command; 
    public ActionManager(ActionEvent e){
        event = e;
        command = e.getActionCommand();
    }

    public void menu(App frame, JTextArea textArea) {
        System.out.println(frame);
        if(command=="open"){    
            JFileChooser fc=new JFileChooser();    
            int i=fc.showOpenDialog(frame);    
            if(i==JFileChooser.APPROVE_OPTION){    
                File f=fc.getSelectedFile();    
                String filepath=f.getPath();    
                try{  
                BufferedReader br=new BufferedReader(new FileReader(filepath));    
                String s1="",s2="";                         
                while((s1=br.readLine())!=null){    
                s2+=s1+"\n";    
                }    
                textArea.setText(s2);    
                br.close();    
                }catch (Exception ex) {ex.printStackTrace();  }                 
            }    
        }    
    }
}
