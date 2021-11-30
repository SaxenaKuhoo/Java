/*Write a java program that connects to the Mysql database, queries the inbuilt table “emp” and displays the first two columns
 (empno using column index and ename using column name ) of all the rows
 */

import java.sql.*;

public class Q16_part1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/list","root","");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from emp");
        while (rs.next()){
            System.out.println(rs.getInt(1) + "   " + rs.getString("empname"));
        }
        con.close();
    }
}
