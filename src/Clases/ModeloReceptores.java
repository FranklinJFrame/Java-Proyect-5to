/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author frank
 */

// Clase ModeloReceptores
import Formularios.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloReceptores {
    private final Connection cn;

    public ModeloReceptores() {
        Conexion mysql = new Conexion();
        this.cn = mysql.Conectar();
    }

    public ArrayList<Receptores> obtenerReceptores() {
        Statement stmt;
        ResultSet rs;
        ArrayList<Receptores> listaReceptores = new ArrayList<>();
        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM receptores");
            while (rs.next()) {
                Receptores receptor = new Receptores();
                receptor.setReceptorID(rs.getString("ReceptorID"));
                receptor.setNombre(rs.getString("Nombre"));
                receptor.setApellido(rs.getString("Apellido"));
                receptor.setTelefono(rs.getString("Telefono"));
                receptor.setDomicilio(rs.getString("Domicilio"));
                receptor.setNumeroDeCasa(rs.getString("NumeroDeCasa"));
                receptor.setCodigoPostal(rs.getString("CodigoPostal"));
                receptor.setProvincia(rs.getString("Provincia"));

                listaReceptores.add(receptor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloReceptores.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaReceptores;
    }
}