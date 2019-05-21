package com.stackroute.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTransactionDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb", "root", "Root@123");
        try{

            //Assume a valid connection object conn
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into customer values(11,'monisha',22,'F')");
            stmt.executeUpdate("insert into customer values(12,'saranya',25,'F')");
            // If there is no error.
            con.commit();
        }catch(SQLException se){
            // If there is any error.
            con.rollback();
        }
    }
}
