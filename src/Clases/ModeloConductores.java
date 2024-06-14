/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Clases;

import Formularios.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author test
 */
public class ModeloConductores {
private final Connection cn;

    // Constructor para inicializar la conexión
    public ModeloConductores() {
        Conexion mysql = new Conexion();
        this.cn = mysql.Conectar();
    }

    public ArrayList<Conductores> obtenerConductores() {
        Statement stmt;
        ResultSet rs;
        ArrayList<Conductores> listaConductores = new ArrayList<>();

        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM conductores"); 

            while (rs.next()) {
                Conductores conductor = new Conductores();
                conductor.setConductorID(rs.getInt("ConductorID"));
                conductor.setEmpleadoID(rs.getInt("EmpleadoID"));
                conductor.setNombre(rs.getString("Nombre"));
                conductor.setTipoLicencia(rs.getString("TipoLicencia"));
                conductor.setVehiculosQuePuedeConducir(rs.getString("VehiculosQuePuedeConducir"));
                conductor.setNivelExperiencia(rs.getString("NivelExperiencia"));
                
                listaConductores.add(conductor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloConductores.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaConductores;
    }
}
