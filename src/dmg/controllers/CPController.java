/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmg.controllers;

import CustomUI.Themes;

import java.awt.Component;

 import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author b
 */
public class CPController {

    public static JLabel activeMenu = null;
     public static JLabel headerTitle ;
 
    public static void entered(MouseEvent evt) {
        JPanel enteredPanel = (JPanel) evt.getComponent().getParent();
        enteredPanel.setBackground(Themes.getMenuHoverBg());
        
        
      int x=  evt.getComponent().getBounds().x += 2;
        evt.getComponent().setLocation(x, evt.getComponent().getLocation().y);
        
  
    }

    public static void clicked(MouseEvent lbClicked, JPanel selectedFrame) {
        activeMenu.getParent().setBackground(Themes.getMenuUnselectedBg());
        activeMenu =  (JLabel) lbClicked.getComponent();
        activeMenu.setBackground(Themes.getMenuSelectedBg());
       for(Component c : lbClicked.getComponent().getParent().getParent().getComponents()) {
           c.setBackground(Themes.getMenuUnselectedBg());
       }
        activeMenu.setBackground(Themes.getMenuSelectedBg());
        
        
       for(Component c : selectedFrame.getParent().getComponents()) {
           c.setVisible(false);
       }
       // selectedFrame.setBackground(Themes.getMenuUnselectedBg());
        selectedFrame.setVisible(true);
        
        JLabel jl = (JLabel) lbClicked.getComponent();
        headerTitle.setText(jl.getText().trim());
    }

    public static void exited(MouseEvent evt) {
        JPanel exitedPanlel = (JPanel) evt.getComponent().getParent();
       exitedPanlel.setBackground(Themes.getMenuUnselectedBg());
        activeMenu.getParent().setBackground(Themes.getMenuSelectedBg());
        
        int x = evt.getComponent().getBounds().x -= 2;
        evt.getComponent().setLocation(x, evt.getComponent().getLocation().y);
          
        

    }

    public static void setTheme(JPanel leftPanel,JPanel rightPanel,JLabel lbDashboard) {
        leftPanel.setBackground(Themes.getLeftPanelColor());
        for(Component c : leftPanel.getComponents()){
            c.setBackground(Themes.getLeftPanelColor());
        }
        
        lbDashboard.getParent().setBackground(Themes.getMenuSelectedBg());
        
        

    }
 
}
