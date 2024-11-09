/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author SingPC
 */
public class SinhVienSeverice {
    ArrayList<SinhVien> ls = new ArrayList<>();
  
    public int add(SinhVien sv) {
      ls.add(sv);
        return 1; 
    }
      public ArrayList<SinhVien> getAll(){
        return ls;
    }
}
