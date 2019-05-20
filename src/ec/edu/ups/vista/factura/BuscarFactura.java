/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.factura;

import ec.edu.ups.controladores.ControladorFactura;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Factura;
import ec.edu.ups.modelo.FacturaDetalle;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erics
 */
public class BuscarFactura extends javax.swing.JInternalFrame {
    
    private ControladorFactura controladorFactura;
    private ResourceBundle mensajes;
    private Factura factura;

    /**
     * Creates new form BuscarFactura
     */
    public BuscarFactura(ControladorFactura controladorFactura, ResourceBundle mensajes) {
        initComponents();
        this.controladorFactura = controladorFactura;
        this.mensajes = mensajes;
        //cambiarIdioma(mensajes);
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
        txtcedula = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtnumerofactura = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();
        lblSubTotal = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        txtiva = new javax.swing.JTextField();
        lblIva = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        botonbuscar = new javax.swing.JButton();

        txtcedula.setEditable(false);

        lblCedula.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lblCedula.setText("Cedula de Cliente");

        lblNumero.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lblNumero.setText("Número de Factura");

        txtnumerofactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumerofacturaActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lblCodigo.setText("Codigo");

        lblNombre.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lblNombre.setText("Nombre");

        lblTelefono.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lblTelefono.setText("Teléfono");

        lblDireccion.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lblDireccion.setText("Dirección");

        txtcodigo.setEditable(false);

        txtnombre.setEditable(false);

        txttelefono.setEditable(false);

        txtdireccion.setEditable(false);

        lblFecha.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lblFecha.setText("Fecha");

        txtfecha.setEditable(false);

        tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cantidad", "Producto", "Precio Unitario", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabladetalle);

        lblSubTotal.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lblSubTotal.setText("Subtotal");
        lblSubTotal.setToolTipText("");

        txtsubtotal.setEditable(false);
        txtsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubtotalActionPerformed(evt);
            }
        });

        txtiva.setEditable(false);

        lblIva.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lblIva.setText("Iva");

        txttotal.setEditable(false);

        lblTotal.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lblTotal.setText("Total");

        botonbuscar.setFont(new java.awt.Font("Sitka Subheading", 2, 18)); // NOI18N
        botonbuscar.setText("Buscar");
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero)
                            .addComponent(lblCedula))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumerofactura, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblFecha)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtfecha))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(lblDireccion)
                                .addGap(18, 18, 18)
                                .addComponent(txtdireccion))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonbuscar)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblTelefono)
                                        .addGap(18, 18, 18)
                                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(24, 24, 24))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIva)
                    .addComponent(lblTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtiva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(txtsubtotal)
                    .addComponent(txttotal))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtnumerofactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscar))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTelefono))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccion))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubTotal)
                    .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIva)
                    .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumerofacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumerofacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumerofacturaActionPerformed

    private void txtsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubtotalActionPerformed

    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
        // TODO add your handling code here:
        vaciarTabla();
        int numero = Integer.parseInt(txtnumerofactura.getText());
        factura = controladorFactura.read(numero);
        Cliente cliente = factura.getCliente();
        txtcedula.setText(cliente.getCedula());
        txtcodigo.setText(Integer.toString(cliente.getCodigo()));
        txtnombre.setText(cliente.getNombre());
        txtfecha.setText(factura.getFecha());
        txttelefono.setText(cliente.getTelefono());
        txtdireccion.setText(cliente.getDireccion());

        llenarDatos();
    }//GEN-LAST:event_botonbuscarActionPerformed
    public void llenarDatos(){
        
        DefaultTableModel modelo = (DefaultTableModel) tabladetalle.getModel();
        List<FacturaDetalle> lista = factura.getDetalles();
        
        for(int i = 0; i < lista.size(); i++){
            Object[] datos = {lista.get(i).getProducto().getCodigoProducto(),
                lista.get(i).getCantidad(),
                lista.get(i).getProducto().getNombre(),
                lista.get(i).getPrecio(),
                lista.get(i).getSubtotal() };
            modelo.addRow(datos);
        }
        
        txtsubtotal.setText(Double.toString(factura.getSubtotal()));
        txttotal.setText(Double.toString(factura.getTotal()));
        
    }
    
    public void vaciarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) tabladetalle.getModel();
        int filas=tabladetalle.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }

    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonbuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tabladetalle;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumerofactura;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
