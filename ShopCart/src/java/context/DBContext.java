package context;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
    
    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
    /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
     public static Connection getConnection()throws Exception {
      String url = "jdbc:jtds:sqlserver://THANG:1433/WebBanHang;instance=SQLEPXRESS";
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        return DriverManager.getConnection(url);
    }   
    /*Insert your other code right after this comment*/
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    public static void main(String[] args) {
        try {
            System.out.println("GG");
            System.out.println(new DBContext().getConnection());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
