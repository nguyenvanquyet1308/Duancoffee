/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.ChiTietHoaDon;
import Entity.HoaDon;
import ThuVien.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguyenvanquyet
 */
public class HoaDonDAO extends CoffeeDao<HoaDon, String> {

    String INSERT_SQL = "INSERT INTO HoaDon (MaHD,MaKH,MaNV,NgayDonHang,MaBan,ThanhTien,TrangThai) VALUES (?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE HoaDon SET MaKH = ?,MaNV =?,NgayDonHang=?,MaBan=?,ThanhTien=? where MaHD=?";
    String DELETE_SQL = "DELETE FROM HoaDon WHERE MaHD=?";
    String SELECT_ALL_SQL = "SELECT * FROM HoaDon";
    String SELECT_BY_ID_SQL = "SELECT * FROM HoaDon WHERE MaHD=?";

    @Override
    public void insert(HoaDon entity) {
          JdbcHelper.executeUpdate(INSERT_SQL,
                entity.getMaHD(),
                entity.getMaKH(),
                entity.getMaNV(),
                entity.getNgayDatHang(),
                entity.getMaBan(),
                entity.getThanhTien(),
                entity.getTrangThai()
        );
    }

    @Override
    public void update(HoaDon entity) {
        JdbcHelper.executeUpdate(UPDATE_SQL,
                entity.getMaKH(),
                entity.getMaNV(),
                entity.getNgayDatHang(),
                entity.getMaBan(),
                entity.getThanhTien(),
                entity.getMaHD()
        );
    }

    @Override
    public void delete(String maHD) {
          JdbcHelper.executeUpdate(INSERT_SQL, maHD);
    }

    @Override
    public HoaDon selectById(String maHD) {
          List<HoaDon> list = this.selectBySQL(SELECT_BY_ID_SQL, maHD);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HoaDon> selectAll() {
         return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    protected List<HoaDon> selectBySQL(String sql, Object... args) {
           List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                HoaDon entity = new HoaDon();
                entity.setMaHD(rs.getString("MaHD"));
                entity.setMaKH(rs.getString("MaKH"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayDatHang(rs.getDate("NgayDonHang"));
                entity.setMaBan(rs.getInt("MaBan"));
                entity.setThanhTien(rs.getFloat("ThanhTien"));
                entity.setTrangThai(rs.getBoolean("TrangThai"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        }

}
