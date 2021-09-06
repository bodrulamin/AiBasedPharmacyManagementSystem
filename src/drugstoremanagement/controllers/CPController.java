/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drugstoremanagement.controllers;

import CustomUI.Themes;
import static CustomUI.Themes.getMenuSelectedBg;
import static CustomUI.Themes.getMenuUnselectedBg;
import java.awt.Point;
 import java.awt.event.MouseEvent;
import javafx.animation.Animation;
 import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author b
 */
public class CPController {

    public static JPanel activeMenu = new JPanel();
    public static JInternalFrame activeFrame = new JInternalFrame();
    public static JLabel headerTitle ;
 
    public static void entered(MouseEvent evt) {
        JPanel enteredPanel = (JPanel) evt.getComponent().getParent();
        enteredPanel.setBackground(Themes.getMenuHoverBg());
        
        
      int x=  evt.getComponent().getBounds().x += 2;
        evt.getComponent().setLocation(x, evt.getComponent().getLocation().y);
        
  
    }

    public static void clicked(MouseEvent lbClicked, JInternalFrame selectedFrame) {
        activeMenu.setBackground(Themes.getMenuUnselectedBg());
        activeMenu = (JPanel) lbClicked.getComponent().getParent();
        activeMenu.setBackground(Themes.getMenuSelectedBg());
        activeFrame.setVisible(false);
        activeFrame = selectedFrame;
        activeFrame.setVisible(true);
        
        JLabel jl = (JLabel) lbClicked.getComponent();
        headerTitle.setText(jl.getText());
    }

    public static void exited(MouseEvent evt) {
        JPanel exitedPanlel = (JPanel) evt.getComponent().getParent();
       exitedPanlel.setBackground(Themes.getMenuUnselectedBg());
        activeMenu.setBackground(Themes.getMenuSelectedBg());
        
        int x = evt.getComponent().getBounds().x -= 2;
        evt.getComponent().setLocation(x, evt.getComponent().getLocation().y);
          
        

    }
//    private void unselectAllMenu() {
////        menuDashboard.setBackground(Themes.getMenuUnselectedBg());
////        menuDrugIn.setBackground(Themes.getMenuUnselectedBg());
////        menuDrugSale.setBackground(Themes.getMenuUnselectedBg());
////        menuExpired.setBackground(Themes.getMenuUnselectedBg());
////        menuExpiring.setBackground(Themes.getMenuUnselectedBg());
////        menuInventory.setBackground(Themes.getMenuUnselectedBg());
//        for (Component c : holderMenus.getComponents()) {
//            c.setBackground(Themes.getMenuUnselectedBg());
//        }
//
//    }
}
