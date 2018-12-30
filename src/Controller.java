import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {
    public static void main(String[] args) throws Exception {
        System.out.println("hello");
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres","admin");
        Statement statement = connection.createStatement();

        String selectTableSQL = "SELECT * from table_name";
        ResultSet rs = statement.executeQuery(selectTableSQL);

        while (rs.next()) {
            String userid = rs.getString("column_1");

            System.out.println("username : " + userid);
        }

        statement.close();
        connection.close();
    }
}
