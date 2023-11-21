
package DAO;

import ThuVien.JdbcHelper;
import java.util.List;
import Entity.Ban;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nguyenvanquyet
 */
public class BanDAO extends CoffeeDao<Ban, Integer> {

    String INSERT_SQL = "INSERT INTO Ban (TenBan,TrangThai) VALUES (?,?)";
    String UPDATE_SQL = "UPDATE Ban SET TenBan = ?,TrangThai =? where MaBan=?";
    String DELETE_SQL = "DELETE FROM Ban WHERE MaBan=?";
    String SELECT_ALL_SQL = "SELECT * FROM Ban";
    String SELECT_BY_ID_SQL = "SELECT * FROM Ban WHERE MaBan=?";

    @Override
    public void insert(Ban entity) {
        JdbcHelper.executeUpdate(INSERT_SQL, 
                entity.getTenBan(),
                entity.getTrangThai()
        );
    }

    @Override
    public void update(Ban entity) {
        JdbcHelper.executeUpdate(UPDATE_SQL, 
                entity.getTenBan(),
                entity.getTrangThai(),
                entity.getMaBan()
        );
    }

    @Override
    public void delete(Integer id) {
        JdbcHelper.executeUpdate(DELETE_SQL, id);
    }

    @Override
    public Ban selectById(Integer id) {
          List<Ban> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Ban> selectAll() {
       return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    protected List<Ban> selectBySQL(String sql, Object... args) {
        List<Ban> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                Ban entity = new Ban();
                entity.setMaBan(rs.getInt("MaBan"));
                entity.setTenBan(rs.getString("TenBan"));
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
