package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author test
 */
public class ConexionDB {
    
    public String db = "destiny";
    public String url  = "jdbc:mysql://localhost/" + db;
    public String user = "root";
    public String pass = "melvineitor121720070725";
    
    
    public Connection Conectar(){
    
        Connection link = null;
        
        try{
        
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        }
        
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        
        }
        return link;
    
    }
    
}
