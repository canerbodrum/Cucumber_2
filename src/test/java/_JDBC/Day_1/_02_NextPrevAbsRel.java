package _JDBC.Day_1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRel extends JDBCParent {

    @Test
    public void nextPrev() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from language");

        //1. satır
        resultSet.next();
        System.out.println("1. satir dilAdi = " + resultSet.getString(2)); //English

        //2. satır
        resultSet.next();
        System.out.println("2. satir dilAdi = " + resultSet.getString(2)); //Italian

        //3. satır
        resultSet.next();
        System.out.println("3. satir dilAdi = " + resultSet.getString(2)); //Japanese

        // 2. satıra gitti
        resultSet.previous();
        System.out.println("1 geri satir dilAdi = " + resultSet.getString(2)); //Italian

    }

    @Test
    public void AbsoluteRelative() throws SQLException {

        ResultSet resultSet = statement.executeQuery("select * from film");

        resultSet.absolute(10); // direkt 10. satıra gider
        System.out.println("10. satır - title = " + resultSet.getString("title"));

        resultSet.relative(5); //15. satıra gider. Niye? çünkü en son bulunduğu yerden 5 satır gider
        System.out.println("15. satır - title = " + resultSet.getString("title"));

        resultSet.absolute(-10); // sondan 10. satıra gider
        System.out.println("Sondan 10. satır - title = " + resultSet.getString("title"));


    }
}
