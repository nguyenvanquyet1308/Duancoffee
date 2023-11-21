/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nguyenvanquyet
 */
public class Ban {

    int MaBan;
    String TenBan;
    Boolean TrangThai;

    public Ban() {
    }

    public Ban(int MaBan, String TenBan, Boolean TrangThai) {
        this.MaBan = MaBan;
        this.TenBan = TenBan;
        this.TrangThai = TrangThai;
    }

    public int getMaBan() {
        return MaBan;
    }

    public void setMaBan(int MaBan) {
        this.MaBan = MaBan;
    }

    public String getTenBan() {
        return TenBan;
    }

    public void setTenBan(String TenBan) {
        this.TenBan = TenBan;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
    }


    @Override
    public String toString() {
        return String.valueOf(MaBan);
    }

}
