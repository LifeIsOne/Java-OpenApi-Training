package forecast;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection(){
        String username = "root";
        String password = "1234";
        String url = "jdbc:mysql://127.0.0.1:3306/forecast_db";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("db connect success");
            return connection;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}