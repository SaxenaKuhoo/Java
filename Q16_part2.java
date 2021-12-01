/* Modify the above program to display all the rows where sal is greater than 1000 and less than 2000. Display the columns
ename, job, sal and comm.
 */

import java.sql.*;

public class Q16_part2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/table1","root","");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from emp");
        while (rs.next()){
            if(rs.getInt("empsal")>1000 && rs.getInt("empsal")<2000){
                System.out.println(rs.getInt(1) + "    " + rs.getString(2) + "    " + rs.getString(3) + "    " + rs.getInt(4));
            }
        }
        con.close();
    }
}
