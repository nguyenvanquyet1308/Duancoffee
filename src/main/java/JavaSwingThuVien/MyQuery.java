package JavaSwingThuVien;

import DAO.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;

/**
 *
 * @author 1bestcsharp.blogspot.com
 */
public class MyQuery {

    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost;database=Duancoffee1", "sa", "123456");
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    public ArrayList<Product2> BindTable() {
        ArrayList<Product2> list = new ArrayList<Product2>();
        Connection con = getConnection();
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
                rs = st.executeQuery("SELECT * FROM SanPham");

            Product2 p;
            while (rs.next()) {
                p = new Product2(
                        rs.getString("MaSP"),
                        rs.getString("TenSP"),
                        rs.getFloat("Gia"),
                        rs.getString("MaLoai"),
                        rs.getString("Mota"),
                        rs.getBytes("HinhAnh")
                       
                );
                list.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
