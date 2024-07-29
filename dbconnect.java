package db;
import java.sql.*;
import javax.swing.JOptionPane;

public class dbconnect 
{
    public static Connection c;
    public static Statement s;
    static
    {
        try
        {
             c= DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false","root", "pridhi20");
             s=c.createStatement();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
            
    
}
