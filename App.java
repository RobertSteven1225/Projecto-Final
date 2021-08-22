/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Estiven
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        showTableData();
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
        Tabla = new javax.swing.JTable();
        Nuevo = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Volver1 = new javax.swing.JToggleButton();
        NombreUs = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Apelli = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        Contra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Confirm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();
        ID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));

        jPanel1.setBackground(new java.awt.Color(102, 0, 153));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        CerrarSesion.setText("CerrarSesion");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Volver1.setText("Volver");
        Volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(Nuevo)
                        .addGap(35, 35, 35)
                        .addComponent(Actualizar)
                        .addGap(27, 27, 27)
                        .addComponent(Eliminar)
                        .addGap(29, 29, 29)
                        .addComponent(CerrarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Volver1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nuevo)
                    .addComponent(Actualizar)
                    .addComponent(CerrarSesion)
                    .addComponent(Eliminar)
                    .addComponent(Volver1))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jLabel1.setText("Nombre Usuario");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Numero Telefonico");

        jLabel5.setText("Correo Electronico ");

        jLabel6.setText("Contraseña");

        jLabel7.setText("Confirmar Contraseña");

        Confirmar.setText("Confirmar");

        jLabel8.setText("ID(Actualizar, Eliminar)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(NombreUs)
                        .addComponent(Nombre)
                        .addComponent(Apelli)
                        .addComponent(Telefono)
                        .addComponent(Correo)
                        .addComponent(Contra)
                        .addComponent(Confirm)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(Confirmar)
                            .addGap(12, 12, 12)))
                    .addComponent(jLabel8))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NombreUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)
                        .addComponent(Apelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(9, 9, 9)
                        .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9)
                        .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Confirmar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
        String nombreusuario = NombreUs.getText();
        String nombre = Nombre.getText();
        String apellido = Apelli.getText();
        String numero = Telefono.getText();
        String correo = Correo.getText();
        String contraseña = Contra.getText();
        String Cconfirmarcontraseña = Confirm.getText();

        if (nombreusuario.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || numero.isEmpty() || correo.isEmpty() || contraseña.isEmpty() || Cconfirmarcontraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);

        }
        Connection conn = DataBase.connectDB();
        PreparedStatement st;
        if (contraseña.equals(Cconfirmarcontraseña)) {
            try {
                st = (PreparedStatement) conn.prepareStatement("INSERT INTO usuario(NombreUsuario, Nombre, Apellido, NumeroTelefonico, CorreoElectronico, Contraseña, ConfirmarContraseña) VALUES(?,?,?,?,?,?,?)");
                st.setString(1, nombreusuario);
                st.setString(2, nombre);
                st.setString(3, apellido);
                st.setString(4, numero);
                st.setString(5, correo);
                st.setString(6, contraseña);
                st.setString(7, Cconfirmarcontraseña);
                int res = st.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Asegurese de poner la misma contraseña", "Error", JOptionPane.ERROR_MESSAGE);
        }
        showTableData();
    }//GEN-LAST:event_NuevoActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        // TODO add your handling code here:
        String nombreusuario = NombreUs.getText();
        String nombre = Nombre.getText();
        String apellido = Apelli.getText();
        String numero = Telefono.getText();
        String correo = Correo.getText();
        String contraseña = Contra.getText();
        String Cconfirmarcontraseña = Confirm.getText();
        String aeid = ID.getText();

        if (aeid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "DEBE COLOCAR EL ID DEL USUARIO A ACTUALIZAR O ELIMINAR", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Connection conn = DataBase.connectDB();
            PreparedStatement st;
            if (contraseña.equals(Cconfirmarcontraseña)) {
                try {
                    st = (PreparedStatement) conn.prepareStatement("UPDATE usuario SET NombreUsuario=?, Nombre=?, Apellido=?, NumeroTelefonico=?, CorreoElectronico=?, Contraseña=?, ConfirmarContraseña=? WHERE ID=?");
                    st.setString(1, nombreusuario);
                    st.setString(2, nombre);
                    st.setString(3, apellido);
                    st.setString(4, numero);
                    st.setString(5, correo);
                    st.setString(6, contraseña);
                    st.setString(7, Cconfirmarcontraseña);
                    st.setString(8, aeid);
                    int res = st.executeUpdate();

                } catch (SQLException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
                showTableData();
            }
        }
    }//GEN-LAST:event_ActualizarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        String aeid = ID.getText();
        if (aeid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "DEBE COLOCAR EL ID DEL USUARIO A ACTUALIZAR O ELIMINAR", "Error", JOptionPane.ERROR_MESSAGE);
        }

        Connection conn = DataBase.connectDB();
        PreparedStatement st;

        try {
            st = (PreparedStatement) conn.prepareStatement("DELETE FROM usuario  WHERE ID=?");

            st.setString(1, aeid);
            int res = st.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        showTableData();
    }//GEN-LAST:event_EliminarActionPerformed

    private void Volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver1ActionPerformed
        // TODO add your handling code here:
        dispose();
        ProductoUsuario pu = new ProductoUsuario();
        pu.setTitle("Producto o Usuario");
        pu.setVisible(true);
    }//GEN-LAST:event_Volver1ActionPerformed

    public void showTableData() {
        Connection conn = DataBase.connectDB();
        PreparedStatement st;

        try {
            st = (PreparedStatement) conn.prepareStatement("SELECT ID, NombreUsuario, Nombre, Apellido, NumeroTelefonico, CorreoElectronico FROM usuario");
            ResultSet res = st.executeQuery();
            Tabla.setModel(DbUtils.resultSetToTableModel(res));

        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JTextField Apelli;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JTextField Confirm;
    private javax.swing.JButton Confirmar;
    private javax.swing.JTextField Contra;
    private javax.swing.JTextField Correo;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreUs;
    private javax.swing.JButton Nuevo;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField Telefono;
    private javax.swing.JToggleButton Volver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
