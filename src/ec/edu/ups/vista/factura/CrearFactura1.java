/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.factura;

import com.sun.glass.events.KeyEvent;
import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.controladores.ControladorFactura;
import ec.edu.ups.controladores.ControladorFacturaDetalle;
import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Factura;
import ec.edu.ups.modelo.FacturaDetalle;
import ec.edu.ups.modelo.Producto;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author erics
 */
public class CrearFactura1 extends javax.swing.JInternalFrame {
    
        private ControladorFactura controladorFactura;
        private ControladorFacturaDetalle controladorFacturaDetalle;
        private ControladorCliente controladorCliente;
        private ControladorProducto controladorProducto;
        private ResourceBundle mensajes;
        private Factura factura;
        private Producto producto;
        private int contador;
        
        private double total1,subtotal,iva,total2;
        private DefaultTableModel tablaF;

    /**
     * Creates new form CrearFactura1
     */
    public CrearFactura1(ControladorFactura controladorFactura, ControladorCliente controladorCliente,ControladorFacturaDetalle controladorFacturaDetalle, ControladorProducto controladorProducto,ResourceBundle mensajes) {
        initComponents();
        contador = 0;
        this.controladorFactura = controladorFactura;
        this.controladorCliente = controladorCliente;
        this.controladorFacturaDetalle=controladorFacturaDetalle;
        this.controladorProducto= controladorProducto;
        this.factura = new Factura();
        txtnumerofactura.setText(Integer.toString(this.controladorFactura.getCodigo()));
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        
        total1 = 0;
        subtotal = 0;
        iva = 0;
        total2=0;
        tablaF=null;
        producto=null;
        
        
                
    }
    
     public void llenarDatos(){
        
        DefaultTableModel modelo = (DefaultTableModel) tabladetalle.getModel();
        List<FacturaDetalle> lista = factura.getDetalles(); 
        while(contador < lista.size()){
            Object[] datos = {factura.getDetalles().get(contador).getCodigo(),
                lista.get(contador).getCantidad(),
                lista.get(contador).getProducto().getNombre(),
                lista.get(contador).getPrecio(),
                lista.get(contador).getSubtotal() };
            modelo.addRow(datos);
            contador++;
        }
        calcularSubtotal();
        txtsubtotal.setText(Double.toString(factura.getSubtotal()));
        calcularTotal();
        txttotal.setText(Double.toString(factura.getTotal()));
        
    }
    
    public void calcularSubtotal(){
        double suma = 0;
        for(int i = 0; i < factura.getDetalles().size(); i++){
            suma += factura.getDetalles().get(i).getSubtotal();
        }
        factura.setSubtotal(suma);
    }
    
    public void calcularTotal(){
        double total = factura.getSubtotal() + (factura.getSubtotal()*factura.getIva());
        factura.setTotal(total);
    }
      public void cambiarIdioma(ResourceBundle mensajes){
        
        labelnumero.setText(mensajes.getString("factura.numero"));
        labelcodigo.setText(mensajes.getString("cliente.codigo"));
        labelnombre.setText(mensajes.getString("cliente.nombre"));
        labelcedula.setText(mensajes.getString("cliente.cedula"));
        labeldireccion.setText(mensajes.getString("cliente.direccion"));
        labeltelefono.setText(mensajes.getString("cliente.telefono"));
        labelfecha.setText(mensajes.getString("factura.fecha"));
        labeliva.setText(mensajes.getString("factura.iva"));
       // labelcodigoproducto.setText(mensajes.getString("factura.codigoproducto"));
       // labelnombreproducto.setText(mensajes.getString("factura.productonombre"));
        labelquitar.setText(mensajes.getString("factura.quitardetalle"));
        labelquitarcodigo.setText(mensajes.getString("producto.codigo"));
        botonquitar.setText(mensajes.getString("factura.quitar"));
       // botonbuscar2.setText(mensajes.getString("boton.buscar"));
       // labelcantidad.setText(mensajes.getString("factura.cantidad"));
      //  botonagregar.setText(mensajes.getString("boton.agregar"));
        botonbuscar1.setText(mensajes.getString("boton.buscar"));
        botoncrear.setText(mensajes.getString("boton.crear"));
        
        JTableHeader tableHeader = tabladetalle.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();
        TableColumn tableColumn;
        tableColumn = tableColumnModel.getColumn(0);
        tableColumn.setHeaderValue(mensajes.getString("cliente.codigo"));
        tableColumn = tableColumnModel.getColumn(1);
        tableColumn.setHeaderValue(mensajes.getString("factura.cantidad"));
        tableColumn = tableColumnModel.getColumn(2);
        tableColumn.setHeaderValue(mensajes.getString("factura.producto"));
        tableColumn = tableColumnModel.getColumn(3);
        tableColumn.setHeaderValue(mensajes.getString("factura.precio"));
        tableHeader.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel1 = new javax.swing.JPanel();
        txtcedula = new javax.swing.JTextField();
        labelcedula = new javax.swing.JLabel();
        labelnumero = new javax.swing.JLabel();
        txtnumerofactura = new javax.swing.JTextField();
        labelcodigo = new javax.swing.JLabel();
        labelnombre = new javax.swing.JLabel();
        labeltelefono = new javax.swing.JLabel();
        labeldireccion = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        labelfecha = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        lablesubtotal = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        txtiva = new javax.swing.JTextField();
        labeliva = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        labeltotal = new javax.swing.JLabel();
        botoncrear = new javax.swing.JButton();
        botonbuscar1 = new javax.swing.JButton();
        labelquitar = new javax.swing.JLabel();
        labelquitarcodigo = new javax.swing.JLabel();
        txtquitar = new javax.swing.JTextField();
        botonquitar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();

        setClosable(true);

        labelcedula.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labelcedula.setText("Cedula de Cliente");

        labelnumero.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labelnumero.setText("Número de Factura");

        txtnumerofactura.setEditable(false);
        txtnumerofactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumerofacturaActionPerformed(evt);
            }
        });

        labelcodigo.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labelcodigo.setText("Codigo");
        labelcodigo.setToolTipText("");

        labelnombre.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labelnombre.setText("Nombre");

        labeltelefono.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labeltelefono.setText("Teléfono");

        labeldireccion.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labeldireccion.setText("Dirección");

        txtcodigo.setEditable(false);

        txtnombre.setEditable(false);

        txttelefono.setEditable(false);

        txtdireccion.setEditable(false);

        labelfecha.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labelfecha.setText("Fecha");

        txtfecha.setEditable(false);

        lablesubtotal.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lablesubtotal.setText("Subtotal");

        txtsubtotal.setEditable(false);
        txtsubtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubtotalActionPerformed(evt);
            }
        });

        txtiva.setEditable(false);
        txtiva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtiva.setText("12%");

        labeliva.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labeliva.setText("Iva");

        txttotal.setEditable(false);
        txttotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        labeltotal.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labeltotal.setText("Total");

        botoncrear.setFont(new java.awt.Font("Sitka Subheading", 2, 18)); // NOI18N
        botoncrear.setText("Crear");
        botoncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncrearActionPerformed(evt);
            }
        });

        botonbuscar1.setFont(new java.awt.Font("Sitka Subheading", 2, 18)); // NOI18N
        botonbuscar1.setText("Buscar");
        botonbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscar1ActionPerformed(evt);
            }
        });

        labelquitar.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labelquitar.setText("Quitar Detalle");

        labelquitarcodigo.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labelquitarcodigo.setText("Codigo");

        txtquitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquitarActionPerformed(evt);
            }
        });

        botonquitar.setFont(new java.awt.Font("Sitka Subheading", 2, 18)); // NOI18N
        botonquitar.setText("Quitar");
        botonquitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonquitarActionPerformed(evt);
            }
        });

        tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "0", null, null, null}
            },
            new String [] {
                "Codigo", "Cantidad", "Nombre", "Precio Unitario", "Total"
            }
        ));
        tabladetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabladetalleKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabladetalle);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelcodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelfecha)
                            .addGap(18, 18, 18)
                            .addComponent(txtfecha))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(labelnombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labeldireccion)
                    .addComponent(labeltelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion))
                .addGap(225, 225, 225))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelquitar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelquitarcodigo)
                        .addGap(18, 18, 18)
                        .addComponent(txtquitar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonquitar)))
                .addGap(186, 186, 186)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lablesubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeliva)
                    .addComponent(labeltotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botoncrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtiva, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsubtotal)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addComponent(labelcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonbuscar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(labelnumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnumerofactura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelnumero)
                            .addComponent(txtnumerofactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelcedula)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonbuscar1))))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelcodigo)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeltelefono))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelnombre)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeldireccion))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelfecha)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lablesubtotal)
                        .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelquitar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelquitarcodigo)
                            .addComponent(txtquitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonquitar))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeliva)
                    .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltotal)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botoncrear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonquitarActionPerformed
        // TODO add your handling code here:
        int codigoQuitar = Integer.parseInt(txtquitar.getText());
        factura.delete(codigoQuitar);
        contador = 0;
        vaciarTabla();
        llenarDatos();
        txtquitar.setText("");
    }//GEN-LAST:event_botonquitarActionPerformed

    private void txtquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquitarActionPerformed

    private void botonbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscar1ActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaTexto = formato.format(date.getTime());

        Cliente cliente = controladorCliente.read1(txtcedula.getText());
        txtcodigo.setText(Integer.toString(cliente.getCodigo()));
        txtnombre.setText(cliente.getNombre());
        txtfecha.setText(fechaTexto);
        txttelefono.setText(cliente.getTelefono());
        txtdireccion.setText(cliente.getDireccion());
    }//GEN-LAST:event_botonbuscar1ActionPerformed

    private void botoncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncrearActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        Cliente cliente = controladorCliente.read1(txtcedula.getText());
        factura.setFecha(date);
        factura.setCliente(cliente);
        controladorFactura.create(factura);
        contador = 0;
        factura = new Factura();
        llenarDatos();
        vaciarCajasTexto();
        vaciarTabla();
        txtnumerofactura.setText(Integer.toString(controladorFactura.getCodigo()));
        JOptionPane.showMessageDialog(this, "Factura creada exitosamente", "Crear factura", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_botoncrearActionPerformed

    private void txtsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubtotalActionPerformed

    private void txtnumerofacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumerofacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumerofacturaActionPerformed

    private void tabladetalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabladetalleKeyReleased
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if(key == KeyEvent.VK_ENTER){
            int fila = tabladetalle.getSelectedRow();
            int columna = tabladetalle.getSelectedColumn();
            int codigo1 = 0;
            
           Object[] datos1 = {"", 0, "", "", ""};
           if (columna==0){
               codigo1= Integer.parseInt(tabladetalle.getValueAt(fila, columna).toString());
               producto=controladorProducto.read(codigo1);
               double precio = producto.getPrecio();
               int canti = Integer.parseInt(tabladetalle.getValueAt(fila, 1).toString());
               tablaF = (DefaultTableModel)tabladetalle.getModel();
               tablaF.removeRow(fila);
               total1 = precio*canti;
               
               Object []datos= {codigo1,canti,producto.getNombre(),producto.getPrecio(),total1};
               tablaF.addRow(datos);
               tablaF.addRow(datos1);
           }else if (columna == 1){
               
                codigo1= Integer.parseInt(tabladetalle.getValueAt(fila, columna -1).toString());
                int canti = Integer.parseInt(tabladetalle.getValueAt(fila, columna).toString());
                tablaF.removeRow(fila);
                tablaF.removeRow(tabladetalle.getRowCount()-1);
                total1 = producto.getPrecio()*canti;
                Object []datos= {codigo1,canti,producto.getNombre(),producto.getPrecio(),total1}; 
                tablaF.addRow(datos);
                tablaF.addRow(datos1); 
           }
           subtotal = subtotal+total1;
           iva = subtotal *0.12;
           total2= subtotal+iva;
           txtsubtotal.setText(String.valueOf(subtotal));
           txtiva.setText(String.valueOf(iva));
           txttotal.setText(String.valueOf(total2));
           
           
   
        }
    }//GEN-LAST:event_tabladetalleKeyReleased
    public void vaciarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) tabladetalle.getModel();
        int filas=tabladetalle.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    } 
    public void vaciarFila(int num){
        DefaultTableModel modelo = (DefaultTableModel) tabladetalle.getModel();
        modelo.removeRow(num);
    }
    public void vaciarCajasTexto(){
        txtcedula.setText("");
        txtcodigo.setText("");
        txtnombre.setText("");
        txtfecha.setText("");
        txttelefono.setText("");
        txtdireccion.setText("");
       // txtcodigoproducto.setText("");
       // txtnombreproducto.setText("");
       // txtcantidad.setText("");
        txtsubtotal.setText("");
        txttotal.setText("");
        txtquitar.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonbuscar1;
    private javax.swing.JButton botoncrear;
    private javax.swing.JButton botonquitar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelcedula;
    private javax.swing.JLabel labelcodigo;
    private javax.swing.JLabel labeldireccion;
    private javax.swing.JLabel labelfecha;
    private javax.swing.JLabel labeliva;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel labelnumero;
    private javax.swing.JLabel labelquitar;
    private javax.swing.JLabel labelquitarcodigo;
    private javax.swing.JLabel labeltelefono;
    private javax.swing.JLabel labeltotal;
    private javax.swing.JLabel lablesubtotal;
    private javax.swing.JTable tabladetalle;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumerofactura;
    private javax.swing.JTextField txtquitar;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
