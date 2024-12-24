
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {

    public static  Connection getConnection ()throws SQLException{
        Connection con = DriverManager.getConnection(
                "jdbc:sqlserver://Memo:1433;databaseName=university;encrypt=false;",
                "sa",
                "Ahmed#memo2004"
        );
        return con;
    }
}

