
package CMS;

import java.sql.Connection;
import java.sql.DriverManager;
public class DataConnection {    
    public static Connection databaseConnection(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:CMSdatabase.db");
            System.out.println("Connection succeeded");
            return con;  
        }
        catch(Exception e){
            System.out.println("connection Failed");
            return null;  
        }
    }
}
