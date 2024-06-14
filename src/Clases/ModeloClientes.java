/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Clases;


import Formularios.Conexion;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author test
 */
public class ModeloClientes {
    private final Connection cn;

    // Constructor para inicializar la conexión
    public ModeloClientes() {
        Conexion mysql = new Conexion();
        this.cn = mysql.Conectar();
    }

    public ArrayList<Clientes> obtenerClientes() {
        Statement stmt;
        ResultSet rs;
        ArrayList<Clientes> listaClientes = new ArrayList<>();

        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM clientes WHERE estado = 'Activo'"); 

            while (rs.next()) {
                Clientes cliente = new Clientes();
                cliente.setClienteID(rs.getString("ClienteID"));
                cliente.setNombre(rs.getString("Nombre"));
                cliente.setApellido(rs.getString("Apellido"));
                cliente.setTelefono(rs.getString("Telefono"));
                cliente.setDomicilio(rs.getString("Domicilio"));
                cliente.setNumeroDeCasa(rs.getString("NumeroDeCasa"));
                cliente.setCodigoPostal(rs.getString("CodigoPostal"));
                cliente.setEstado(rs.getString("Estado"));
                
                listaClientes.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaClientes;
    }
}
