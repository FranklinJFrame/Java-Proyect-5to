/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Consultas;
import Formularios.Conexion;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author maria
 */
public class Consultacotizacion extends javax.swing.JFrame {

    /**
     * Creates new form Consultacotizacion
     */
    public Consultacotizacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnmostrar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        txtbuscarpago = new javax.swing.JTextField();
        btnvisualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Toque el botón mostrar para ver todos los paquetes en el inventario.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Franklin Gothic Medium Cond", 0, 18))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnmostrar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        btnmostrar.setText("Mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        btnbuscar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupa.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        txtbuscarpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarpagoActionPerformed(evt);
            }
        });

        btnvisualizar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        btnvisualizar.setText("Visualizar reporte.");
        btnvisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnmostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnvisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtbuscarpago, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(btnmostrar)
                    .addComponent(btnvisualizar)
                    .addComponent(txtbuscarpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed

        Conexion mysql = new Conexion();
        java.sql.Connection cn = mysql.Conectar();

        ResultSet rs;
        PreparedStatement ps;

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jTable1.setModel(modelo);

            ps=cn.prepareStatement("SELECT * FROM Cotizacion");
            rs=ps.executeQuery();

            java.sql.ResultSetMetaData rsMd =rs.getMetaData();
            int cColumnas = rsMd.getColumnCount();
            modelo.addColumn("cotizacionID");
            modelo.addColumn("fecha_cotizacion");
            modelo.addColumn("Cliente_ID");
            modelo.addColumn("NumeroDePaquete");
            modelo.addColumn("ListaDeObjetos");
            modelo.addColumn("CantidadTotalObjetos");
            modelo.addColumn("PlacaVehiculo");
            modelo.addColumn("DomicilioReceptor");

            while (rs.next()){
                Object[] filas = new Object [cColumnas];
                for (int i=0; i<cColumnas;i++){
                    filas[i]=rs.getObject(i+1);
                }
                modelo.addRow(filas);

            }

        }catch(SQLException e){

            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los datos  " + e.getMessage());
        }
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        Conexion mysql = new Conexion();
        java.sql.Connection cn = mysql.Conectar();

        DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("cotizacionID");
            modelo.addColumn("fecha_cotizacion");
            modelo.addColumn("Cliente_ID");
            modelo.addColumn("NumeroDePaquete");
            modelo.addColumn("ListaDeObjetos");
            modelo.addColumn("CantidadTotalObjetos");
            modelo.addColumn("PlacaVehiculo");
            modelo.addColumn("DomicilioReceptor");
        String filtro = txtbuscarpago.getText().trim();

        try {
            String query = "SELECT * FROM cotizacion where cotizacionID like ? or fecha_cotizacion like ? ";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, "%" + filtro + "%");
            ps.setString(2, "%" + filtro + "%");

            ResultSet rs = ps.executeQuery();

            modelo.setRowCount(0);

            while (rs.next()) {
                Object[] fila = new Object[8];

                fila[0] = rs.getInt("cotizacionID");
                fila[1] = rs.getString("fecha_cotizacion");
                fila[2] = rs.getString("cliente_ID");
                fila[3] = rs.getString("NumeroDePaquete");
                fila[4] = rs.getString("ListaDeObjetos");
                fila[5] = rs.getString("CantidadTotalObjetos");
                fila[6] = rs.getString("PlacaVehiculo");
                fila[7] = rs.getString("DomicilioReceptor");
                modelo.addRow(fila);
            }

            jTable1.setModel(modelo);

            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los registros: " + e.getMessage());
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtbuscarpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarpagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarpagoActionPerformed

    private void btnvisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvisualizarActionPerformed
        Conexion mysql = new Conexion();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/destiny" , "root", "Marianny19")) {
                String reportPath = "C:\\Users\\maria\\JaspersoftWorkspace\\MyReports\\cotizacion.jrxml";
                JasperReport jr = JasperCompileManager.compileReport(reportPath);
                JasperPrint jp = JasperFillManager.fillReport(jr, null, cn);
                JasperViewer.viewReport(jp);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnvisualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consultacotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultacotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultacotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultacotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultacotizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnvisualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbuscarpago;
    // End of variables declaration//GEN-END:variables
}
