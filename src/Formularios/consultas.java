package Formularios;

import Formularios.FormLogin;
import Formularios.Opciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class consultas {
    public void guardarUsuario(String usuario, String password){
        Conexion db = new Conexion();
        String sql = "insert into usuarios(nombre, clave) values ('" + usuario +"', '" + password +"');";
        Statement st;
        Connection conexion = db.Conectar();
        try
        {
            st = conexion.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        }catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
   public void consultarUsuario(String user, String pass, JFrame currentFrame) {
    Conexion db = new Conexion();
    try {
        Connection cn = db.Conectar();
        PreparedStatement pst = cn.prepareStatement("SELECT nombre, clave FROM usuarios WHERE nombre = ? AND clave = ?");
        pst.setString(1, user);
        pst.setString(2, pass);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "Login correcto Bienvenido " + user);
            currentFrame.setVisible(false);
            Opciones opcion = new Opciones();
            opcion.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error " + e);
    }
   }
}

