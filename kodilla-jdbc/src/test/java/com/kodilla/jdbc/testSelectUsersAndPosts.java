package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testSelectUsersAndPosts {
    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS NUMBER_OF_POSTS\n" +
                "FROM users U, POST P\n" +
                "WHERE P.USER_ID = U.ID\n" +
                "GROUP BY USER_ID\n" +
                "HAVING COUNT(*) >= 2;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet result = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (result.next()) {
            System.out.println(result.getString("FIRSTNAME") + ", " +
                    result.getString("LASTNAME") + ", " + result.getInt("NUMBER_OF_POSTS"));
            counter++;
        }
        result.close();
        statement.close();
        Assert.assertEquals(1, counter);
    }
}
