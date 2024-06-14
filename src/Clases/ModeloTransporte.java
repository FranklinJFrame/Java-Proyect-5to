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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author test
 */
public class ModeloTransporte {

    private final Connection cn;

    // Constructor para inicializar la conexión
    public ModeloTransporte() {
        Conexion mysql = new Conexion();
        this.cn = mysql.Conectar();
    }

    public ArrayList<Transporte> obtenerTransporte() {
        Statement stmt;
        ResultSet rs;
        ArrayList<Transporte> listaTransporte = new ArrayList<>();

        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM transporte"); 

            while (rs.next()) {
                Transporte transporte = new Transporte();
                transporte.setTransporteID(rs.getInt("TransporteID"));
                transporte.setMarca(rs.getString("Marca"));
                transporte.setModelo(rs.getString("Modelo"));
                transporte.setTipoVehiculo(rs.getString("TipoVehiculo"));
                transporte.setLicenciaNecesaria(rs.getString("LicenciaNecesaria"));
                transporte.setCapacidadKG(rs.getDouble("CapacidadKG"));
                transporte.setDimensionesFt(rs.getString("DimensionesFt"));
                transporte.setNumeroPlaca(rs.getString("NumeroPlaca"));
                
                 
                listaTransporte.add(transporte);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloTransporte.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaTransporte;
    }
}
