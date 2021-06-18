package JDBCContnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 〈插数据临时使用〉
 *
 * @author cql
 * @create 2021/5/7
 * @since 1.0.0
 */
public class JDBCConnector {
    public  JDBCConnector() throws ClassNotFoundException, SQLException {

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/test?serverTimezone=GMT";
        String  user ="root";
        String pswd="960960";
        Connection conn= DriverManager.getConnection(url,user,pswd);
        Statement statement=conn.createStatement();
        String sql="select *  from user";
        ResultSet resultSet=statement.executeQuery(sql);
        resultSet.close();
        statement.close();
        conn.close();
    }
}