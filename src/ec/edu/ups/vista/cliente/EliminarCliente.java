/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.cliente;

import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author erics
 */
public class EliminarCliente extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;
    private ResourceBundle mensajes;
    /**
     * Creates new form Eliminar
     */
    public EliminarCliente(ControladorCliente controladorCliente,ResourceBundle mensajes) {
        initComponents();
        this.controladorCliente = controladorCliente;
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
    }
    public void cambiarIdioma(ResourceBundle mensajes){
        
        labelcedula.setText(mensajes.getString("cliente.cedula"));
        labelnombre.setText(mensajes.getString("cliente.nombre"));
        labelcodigo.setText(mensajes.getString("cliente.codigo"));
        labeldireccion.setText(mensajes.getString("cliente.direccion"));
        labeltelefono.setText(mensajes.getString("cliente.telefono"));
        botonbuscar.setText(mensajes.getString("boton.buscar"));
        botoneliminar.setText(mensajes.getString("boton.eliminar"));
     
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelcedula = new javax.swing.JLabel();
        botonbuscar = new javax.swing.JButton();
        txtcedula = new javax.swing.JTextField();
        labelnombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        labelcodigo = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        labeldireccion = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        labeltelefono = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        botoneliminar = new javax.swing.JButton();

        setClosable(true);

        labelcedula.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labelcedula.setText("Cedula:");

        botonbuscar.setFont(new java.awt.Font("Sitka Subheading", 2, 18)); // NOI18N
        botonbuscar.setText("Buscar");
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });

        labelnombre.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labelnombre.setText("Nombre");

        txtnombre.setEditable(false);
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        labelcodigo.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labelcodigo.setText("Codigo");

        txtcodigo.setEditable(false);

        labeldireccion.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labeldireccion.setText("Dirección");

        txtdireccion.setEditable(false);
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        labeltelefono.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labeltelefono.setText("Teléfono");

        txttelefono.setEditable(false);

        botoneliminar.setFont(new java.awt.Font("Sitka Subheading", 2, 18)); // NOI18N
        botoneliminar.setText("Eliminar");
        botoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelcedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonbuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labeltelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(labeldireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(botoneliminar)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcedula)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscar))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelnombre))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelcodigo))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeldireccion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeltelefono))
                .addGap(33, 33, 33)
                .addComponent(botoneliminar)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
        // TODO add your handling code here:
        String cedula = txtcedula.getText();
        Cliente cliente = controladorCliente.read1(cedula);
        txtnombre.setText(cliente.getNombre());
        txtcodigo.setText(Integer.toString(cliente.getCodigo()));
        txtdireccion.setText(cliente.getDireccion());
        txttelefono.setText(cliente.getTelefono());
    }//GEN-LAST:event_botonbuscarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void botoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminarActionPerformed
        // TODO add your handling code here:
        String cedula = txtcedula.getText();
        Cliente cliente = controladorCliente.read1(cedula);
        int codigo = cliente.getCodigo();
        controladorCliente.delete(codigo);
        txtcedula.setText("");
        txtnombre.setText("");
        txtdireccion.setText("");
        txtcodigo.setText("");
        txttelefono.setText("");
        JOptionPane.showMessageDialog(this, "Cliente Eliminado exitosamente", "Eliminar cliente", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_botoneliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonbuscar;
    private javax.swing.JButton botoneliminar;
    private javax.swing.JLabel labelcedula;
    private javax.swing.JLabel labelcodigo;
    private javax.swing.JLabel labeldireccion;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel labeltelefono;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
