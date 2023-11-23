package DAO;

import Entity.Loai;
import Entity.SanPham;
import ThuVien.JdbcHelper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 * @author nguyenvanquyet
 */
public class SanPhamDAO extends CoffeeDao<SanPham, String> {

    String INSERT_SQL = "INSERT INTO SanPham (MaSP,TenSP,Gia,MaLoai,MoTa,HinhAnh) VALUES (?,?,?,?,?,cast(? as varbinary(max)))";
    String UPDATE_SQL = "UPDATE SanPham SET TenSP = ?,Gia =?,MaLoai=?,MoTa=?,HinhAnh=? where MaSP=?";
    String DELETE_SQL = "DELETE FROM SanPham WHERE MaSP=?";
    String SELECT_ALL_SQL = "SELECT * FROM SanPham";
    String SELECT_BY_ID_SQL = "SELECT * FROM SanPham WHERE MaSP=?";
    String SELECT_BY_ID_SQL1 = "select MaSP,TenSP,Gia,MaLoai,MoTa,HinhAnh from SanPham";

    @Override
    public void insert(SanPham entity) {
        JdbcHelper.executeUpdate(INSERT_SQL,
                entity.getMaSP(),
                entity.getTenSP(),
                entity.getGia(),
                entity.getMaLoai(),
                entity.getMoTa(),
                entity.getHinhanh()
        );
    }

    @Override
    public void update(SanPham entity) {
        JdbcHelper.executeUpdate(UPDATE_SQL,
                entity.getTenSP(),
                entity.getGia(),
                entity.getMaLoai(),
                entity.getMoTa(),
                entity.getHinhanh(),
                entity.getMaSP()
        );
    }

    @Override
    public void delete(String String) {
        JdbcHelper.executeUpdate(DELETE_SQL, String);
    }

    @Override
    public SanPham selectById(String masp) {
        List<SanPham> list = this.selectBySQL(SELECT_BY_ID_SQL, masp);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<SanPham> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    protected List<SanPham> selectBySQL(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                SanPham entity = new SanPham();
                entity.setMaSP(rs.getString("MaSP"));
                entity.setTenSP(rs.getString("TenSP"));
                entity.setGia(rs.getFloat("Gia"));
                entity.setMaLoai(rs.getString("MaLoai"));
                entity.setMoTa(rs.getString("MoTa"));
                entity.setHinhanh(rs.getBytes("HinhAnh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<SanPham> BindTable() {
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=DuanCoffee";
            Connection con = DriverManager.getConnection(url, "sa", "123456");
            Statement st;
            ResultSet rs;
            try {
                st = con.createStatement();
                rs = st.executeQuery(SELECT_ALL_SQL);
                SanPham p;
                while (rs.next()) {
                    p = new SanPham(
                            rs.getString("MaSP"),
                            rs.getString("TenSP"),
                            rs.getFloat("Gia"),
                            rs.getString("MaLoai"),
                            rs.getString("MoTa"),
                            rs.getBytes("HinhAnh"));
                    list.add(p);
                }

            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        return list;

    }

}
