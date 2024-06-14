package Formularios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author maria
 */
public class Conexion {
    public String db = "destiny";
    public String url  = "jdbc:mysql://localhost/" + db;
    public String user = "root";
    public String pass = "franklin";
    
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
