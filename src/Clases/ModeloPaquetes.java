/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author frank
 */

import Formularios.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloPaquetes {

    private final Connection cn;

    // Constructor para inicializar la conexión
    public ModeloPaquetes() {
        Conexion mysql = new Conexion();
        this.cn = mysql.Conectar();
    }

    public ArrayList<Paquetes> obtenerPaquetes() {
        Statement stmt;
        ResultSet rs;
        ArrayList<Paquetes> listaPaquetes = new ArrayList<>();

        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM paquetes");

            while (rs.next()) {
                Paquetes paquete = new Paquetes();
                paquete.setPaqueteID(rs.getInt("PaqueteID"));
                paquete.setClienteID(rs.getString("ClienteID"));
                paquete.setFragil(rs.getString("Fragil"));
                paquete.setPeso(rs.getDouble("Peso"));
                paquete.setAltura(rs.getDouble("Altura"));
                paquete.setAnchura(rs.getDouble("Anchura"));
                paquete.setListaDeObjetos(rs.getString("ListaDeObjetos"));
                paquete.setDatosAdicionales(rs.getString("DatosAdicionales"));
                paquete.setNumeroDePaquete(rs.getString("NumeroDePaquete"));

                listaPaquetes.add(paquete);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPaquetes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaPaquetes;
    }
}