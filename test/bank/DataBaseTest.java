package bank;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.assertNotNull;

public class DataBaseTest {
    @Test
    public void testDataBaseConnectivity(){
        try(Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost/elites?createDatabaseIfNotExist=true","root","1212")){

               assertNotNull(connection);
            System.out.println(connection);
        }catch(SQLException exception){
            System.err.println("ERROR connection to database->" + exception.getMessage());
        }

    }
}
