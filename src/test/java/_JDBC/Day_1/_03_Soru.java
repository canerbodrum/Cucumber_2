package _JDBC.Day_1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_Soru extends JDBCParent {
    // city tablosundaki tüm kayıtlardaki isimleri next ile yazdırınız

    @Test
    public void test1() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select city from city");
        
        int rowCount = 0;
        while (resultSet.next() == true) {
            System.out.println(resultSet.getString("city"));
            rowCount++;

        }
        System.out.println("rowCount = " + rowCount);
    }
    // TODO : city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız
    // TODO : city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız
}
