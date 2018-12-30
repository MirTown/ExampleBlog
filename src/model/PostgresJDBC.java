package model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class PostgresJDBC {


    //D:\intelij_IDEA\exampleBlog\src\model\DataBase.properties
    public static Connection getConnection() throws SQLException,IOException {
        Properties properties = new Properties();
        try (InputStream inputStream = Files.newInputStream(Paths.get("src/model/DataBase.properties"))) {
            properties.load(inputStream);
        }
        String drivers = properties.getProperty("jdbc.drivers");
        if (drivers != null) {
            System.setProperty("jdbc.drivers", drivers);
        }
        String url = properties.getProperty("jdbc.url");
        String username = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");

        return DriverManager.getConnection(url, username, password);
    }

    public static void createTable(Connection connection) throws SQLException {
//  statement.execute("CREATE TABLE IF NOT EXISTS user(name varchar(100),
//  id integer primary key auto_increment, nickname varchar(100));");
        String blogPostSql;
        blogPostSql = "CREATE TABLE if not exists blogPost\n" +
                "(\n" +
                "    id bigserial PRIMARY KEY NOT NULL,\n" +
                "    title character,\n" +
                "    post character,\n" +
                "    \"user\" bigint,\n" +
                "    localDateTime time,\n" +
                "    tags bigint,\n" +
                "    comments bigint,\n" +
                "    likes bigint,\n" +
                "    dislikes bigint\n" +
                ")";
//
        Statement statement = connection.createStatement();
        statement.execute(blogPostSql);
//
//        private Long id;
//        private String title;
//        private String post;
//        private User author;
//        private LocalDateTime date;
//        private Set<Tag> tags;
//        private Set<Comment> comments;
//        private Set<User> likes;
//        private Set<User> dislikes;

        statement.close();
        connection.close();
    }

}
