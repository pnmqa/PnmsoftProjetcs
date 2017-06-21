package Connections;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class SQLconn {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Loading the required JDBC Driver class
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        //Creating a connection to the database
       // Connection conn = DriverManager.getConnection("jdbc:sqlserver://10.10.20.57:1433;DatabaseName=SEQ83_79", "sa", "QA-team1");
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://devsql;instanceName=SEQUENCE;DatabaseName=Sequence7Long", "sa", "lions");

        //Executing SQL query and fetching the result
        Statement st = conn.createStatement();
        String sqlStr = "select * from tblEmployees";
        ResultSet rs = st.executeQuery(sqlStr);
        while (rs.next()) {
            System.out.println(rs.getString("fldEmpName"));
        }
    }
}