/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmgmsystem;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Rutu
 */
public class db {
    Connection con;
    PreparedStatement pre;
    public Connection getconnection() throws SQLException, ClassNotFoundException{
        
    try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        
    }
    
    catch(ClassNotFoundException | SQLException e)
    {
        JOptionPane.showMessageDialog(null,e);
    }
    return con;
    }
    
}
