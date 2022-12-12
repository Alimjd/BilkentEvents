import java.beans.Statement;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        // Your Database address
        String url ="jdbc:mysql://localhost:3306/jdbc";
        // Do not change it
        String username="root";
        // Deafault password
        String password="";
        try {
        // Do not change it except the jdbc part
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Do not change it
        Connection connection = DriverManager.getConnection(url,username,password);
        // Do not change it
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from students");
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+ " " + resultSet.getInt(3));
        }
            connection.close();
        } catch (Exception e) {
            // Do not change it
            System.out.println(e);
            
        }
    }
}