/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class RegisterDAO {

    Connection conn = null;

    //Chuyển câu lệnh từ netbean sang sql server
    PreparedStatement ps = null;

    ResultSet rsSearch = null;
    int rs;// Nhận kết quả trả về

    public int Register(String user, String pass, int role) {

        try {
            RegisterDAO registerDao = new RegisterDAO();
            boolean kq = registerDao.search(user);
            System.out.println(kq+ "register Search");

            if (kq == false) {

                String query = "Insert into Account([user], pass, isRole) values (?,?,?)";
                conn = new DBContext().getConnection();
                ps = conn.prepareStatement(query);
                ps.setString(1, user);
                ps.setString(2, pass);
                ps.setInt(3, role);

                System.out.println(ps + "ps register");
                rs = ps.executeUpdate();
                System.out.println(rs + "rs register");

                if (rs > 0) {
                    System.out.println("Register success!");
                    return 1;
                }
                return 1;

            } else {
                System.out.println("<script>window.alert('Đăng ký không thành công!')</script>");
                return 0;
            }

        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }

    }

    public boolean search(String user) {

        try {
            String query = "select * from Account where [user] = ? ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rsSearch = ps.executeQuery();
            System.out.println(rs);

            if (rsSearch.next() == true) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

}
