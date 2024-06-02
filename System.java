/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.system;

/**
 *
 * @author jenne
 */
public class SYSTEM {
    
    public static void main (String []args){
        LoginForm loginForm = new LoginForm ();
        loginForm.setVisible(true);
        
        MainForm m = new MainForm();
        m.setVisible(false);
    }
}
