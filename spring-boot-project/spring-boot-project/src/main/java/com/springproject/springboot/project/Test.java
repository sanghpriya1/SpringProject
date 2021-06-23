package com.springproject.springboot.project;

import java.sql.*;
public class Test {
    public static void main(String[] a)
            throws Exception {
        Connection conn = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/department", "root", "Sangh@1234");
        // add application code here
        conn.close();
    }
}
