/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SingPC
 */
public class user {
        private String taiKhoan;
        private String matKhau;
        private boolean role;
        private boolean DUy;
    public user() {
    }

    public user(String taiKhoan, String matKhau, boolean role) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.role = role;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }
        
}
