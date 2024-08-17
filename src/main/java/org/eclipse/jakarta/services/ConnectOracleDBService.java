package org.eclipse.jakarta.services;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectOracleDBService {


    public void connectOracleDB() {
        // Connect to Oracle DB
        OracleDataSource ods;
        try {
            ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@localhost:1521:FREE");
            ods.setUser("sys as sysdba");
            ods.setPassword("98712345pwd");
            Connection conn = ods.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM DUAL");
            ResultSet rset = stmt.executeQuery();
            while (rset.next()) {
                System.out.println(rset.getString(1));
                System.out.println("Connection Established Successfully");
            }

        } catch (Exception e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }

    }
}
