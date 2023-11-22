/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.ChiTietHoaDon;
import Entity.SanPham;
import ThuVien.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguyenvanquyet
 */
public class ChiTietHoaDonDAO extends CoffeeDao<ChiTietHoaDon, Integer> {

    String INSERT_SQL = "INSERT INTO ChiTietHoaDon (MaHDCT,MaHD,MaSP,SoLuong,GiaTien) VALUES (?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE ChiTietHoaDon SET MaHD = ?,MaSP =?,SoLuong=?,GiaTien =? where ChiTietHoaDon=?";
    String DELETE_SQL = "DELETE FROM ChiTietHoaDon WHERE MaHDCT=?";
    String SELECT_ALL_SQL = "SELECT * FROM ChiTietHoaDon";
    String SELECT_BY_ID_SQL = "SELECT * FROM ChiTietHoaDon WHERE ChiTietHoaDon=?";

    @Override
    public void insert(ChiTietHoaDon entity) {
        JdbcHelper.executeUpdate(INSERT_SQL,
                entity.getHoaDonCT(),
                entity.getMaHD(),
                entity.getMaSP(),
                entity.getSoLuong(),
                entity.getGiaTien()
        );
    }

    @Override
    public void update(ChiTietHoaDon entity) {
        JdbcHelper.executeUpdate(UPDATE_SQL,
                entity.getMaHD(),
                entity.getMaSP(),
                entity.getSoLuong(),
                entity.getGiaTien(),
                entity.getHoaDonCT()
        );
    }

    @Override
    public void delete(Integer maHDCT) {
         JdbcHelper.executeUpdate(DELETE_SQL, maHDCT);
    }

    @Override
    public ChiTietHoaDon selectById(Integer maHDCT) {
           List<ChiTietHoaDon> list = this.selectBySQL(SELECT_BY_ID_SQL, maHDCT);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChiTietHoaDon> selectAll() {
         return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    protected List<ChiTietHoaDon> selectBySQL(String sql, Object... args) {
          List<ChiTietHoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                ChiTietHoaDon entity = new ChiTietHoaDon();
                entity.setHoaDonCT(rs.getInt("MaHDCT"));
                entity.setMaHD(rs.getString("MaHD"));
                entity.setMaSP(rs.getString("MaSP"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setGiaTien(rs.getFloat("GiaTien"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

}
