import model.PostgresqlJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {
    public static void main(String[] args) throws Exception {
        System.out.println("hello");
        //Class.forName("org.postgresql.Driver");
        //Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","admin");
        //Statement statement = connection.createStatement();

        Connection connection = PostgresqlJDBC.getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE table greetings (Message CHAR(20))");
        statement.executeUpdate("insert into greetings values ('hello world')");
        String selectTableSQL = "SELECT * from greetings";
        ResultSet rs = statement.executeQuery(selectTableSQL);

        if (rs.next()) {
            System.out.println(rs.getString(1));
        }

        statement.close();
        connection.close();
    }
}
