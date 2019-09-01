
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fasiha Asim
 */
public class DOWMain {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    
    public DOWMain() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");   //connection -> properties -> driverclass->text copied here
        con=DriverManager.getConnection("str","root","");//str to be replaced by address
        stmt=con.prepareStatement("select * from student");
        rs=stmt.executeQuery();
        while(rs.next())
        {
            System.out.println("ID = "+rs.getString(1)+"----name ="+rs.getString(2)+"Gender = "+rs.getString(3)+"City ="+rs.getString(4));
        }
    }
}
