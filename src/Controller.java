import model.PostgresJDBC;
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
        Connection connection = PostgresJDBC.getConnection();
        PostgresJDBC.createTable(connection);
        connection = PostgresJDBC.getConnection();
        Statement statement = connection.createStatement();
//        statement.executeUpdate("CREATE table greetings (Message CHAR(20))");
        statement.executeUpdate("insert into public.blogPost values (34,7,1,44,current_time,111,1111,1111,321)");
        String selectTableSQL = "SELECT * from blogPost";
        ResultSet rs = statement.executeQuery(selectTableSQL);

        if (rs.next()) {
            System.out.println(rs.getString(1));
        }

        statement.close();
        connection.close();
    }
}
