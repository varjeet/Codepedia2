package java2;

import java.sql.*;

public class DBLoader2 
{
     public static ResultSet executeQuery(String SQL) throws Exception
     {
            //////  ##CODE  ///////    
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading done");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root",null);
            System.out.println("Connection done");

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement done");

            ResultSet rs = stmt.executeQuery(SQL);
            System.out.println("ResultSet Created");
            
            return rs;
     }
}
