package menus;

import javax.swing.*;

import java.awt.event.*; 

import java.io.*;  

import java.util.*;
import java.util.Map.Entry;



public class MenuBar extends JMenuBar {
    // HashMap<JMenu, ArrayList<JMenuItem>> menus = new HashMap<JMenu, ArrayList<JMenuItem>>();
    HashMap<String, JMenuItem> menuList = new HashMap<String, JMenuItem>();
    JMenu file;    
    JMenuItem open;    
    public MenuBar(LinkedHashMap<String, String[]> menus, ActionListener listener) {

        Set<Entry<String, String[]>> list = menus.entrySet();
        Iterator<Entry<String, String[]>> itr = list.iterator();

        while(itr.hasNext()) {
            Entry<String, String[]> entry = itr.next();
            JMenu menu = new JMenu(entry.getKey());
            for (String item : entry.getValue()) {
                JMenuItem menuItem = new JMenuItem(item);
                menuItem.addActionListener(listener);
                menuList.put(item,menuItem);
                menu.add(menuItem);
            }
            add(menu);
        }
        setBounds(0,0,800,20); 
    }
}
