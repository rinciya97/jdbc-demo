package com.stackroute.db;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBatchProcessingDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb", "root", "Root@123");
        con.setAutoCommit(false);

        Statement stmt=con.createStatement();

        stmt.addBatch("insert into customer(name,age,gender) VALUES('shreyas',25,'M')");
        stmt.addBatch("insert into customer(name,age,gender) VALUES('dhoni',40,'M')");
        stmt.executeBatch();//executing the batch
        con.commit();
        con.close();
    }
}
