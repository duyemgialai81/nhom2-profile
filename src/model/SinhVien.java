/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author SingPC
 */
public class SinhVien {
    private String maSV;
    private String tenSV;
    private Date ngaySinh;
    private String diaChi;
    private String hinhanh;
    private boolean gioiTinh;
      private boolean tuoi;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, Date ngaySinh, String diaChi, String hinhanh,boolean gioiTinh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.hinhanh = hinhanh;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }
    public void setGioiTinh(boolean gioiTinh){
        this.gioiTinh = gioiTinh;
    }
    public boolean getGioiTinh(){
        return gioiTinh;
    }
    
}
