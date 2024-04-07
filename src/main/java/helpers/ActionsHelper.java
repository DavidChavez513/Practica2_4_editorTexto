/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import javax.swing.*;

/**
 *
 * @author super
 */
public class ActionsHelper {
    
    private JButton boton;
    private JMenuItem btnMenuItem;
    private JMenu btnMenu;
    private JTextArea editorArea;
    
    public ActionsHelper(JButton btn) {
        boton = btn;
    }

    public ActionsHelper(JMenuItem btnMenu) {
        this.btnMenuItem = btnMenu;
    }

    public ActionsHelper(JMenu globalBtnMenu) {
        this.btnMenu = globalBtnMenu;
    }

    public ActionsHelper(JTextArea editorArea) {
        this.editorArea = editorArea;
    }

    
    public void exit() {
        
    }
    
    
    
    
}
