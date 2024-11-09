/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SingPC
 */
public class userseversice {
    ArrayList<user> ls = new ArrayList<>();
    public userseversice(){
        ls.add(new user("duyem","1", true));
       
    }
    public boolean check(String tk, String mk){
        for (user l : ls) {
            if(l.getTaiKhoan().equals(tk)&&l.getMatKhau().equals(mk)){
                return true;
            }
        }
        return false;
    }
}
