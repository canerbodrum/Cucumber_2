package _JDBC.Day_1;


import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {
    @Test
    public void test1() throws SQLException {
        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        //bağlantıya giriş
        Connection connection = DriverManager.getConnection(hostUrl,username,password); // bağlantıya click 1. madde

        Statement statement = connection.createStatement(); // sorguları çalıştırmak için sorgu gönderme ortamı

        // sorguyu yazdım ve çalıştırdım
        ResultSet resultSet = statement.executeQuery("select * from customer"); // sonuçlar resultSette

        resultSet.next(); // sıradaki ilk satıra gitti

        String firstname = resultSet.getString("first_name");
        String lastname = resultSet.getString("last_name");

        System.out.println("1. Satırın müşteri adı ve soyadı: " + firstname + " " + lastname);

        resultSet.next(); // 2. satıra gider

         firstname = resultSet.getString("first_name");
         lastname = resultSet.getString("last_name");

        System.out.println("2. Satırın müşteri adı ve soyadı: " + firstname + " " + lastname);

        resultSet.previous(); // bi önceki satıra gitti

         firstname = resultSet.getString("first_name");
         lastname = resultSet.getString("last_name");

        System.out.println("Bir önceki satırın müşteri adı ve soyadı = " + firstname + " " + lastname);

        connection.close();

    }
}
