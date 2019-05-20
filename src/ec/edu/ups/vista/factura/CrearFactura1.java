/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.factura;

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
        labelcodigoproducto.setText(mensajes.getString("factura.codigoproducto"));
        labelnombreproducto.setText(mensajes.getString("factura.productonombre"));
        labelquitar.setText(mensajes.getString("factura.quitardetalle"));
        labelquitarcodigo.setText(mensajes.getString("producto.codigo"));
        botonquitar.setText(mensajes.getString("factura.quitar"));
        botonbuscar2.setText(mensajes.getString("boton.buscar"));
        labelcantidad.setText(mensajes.getString("factura.cantidad"));
        botonagregar.setText(mensajes.getString("boton.agregar"));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();
        lablesubtotal = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        txtiva = new javax.swing.JTextField();
        labeliva = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        labeltotal = new javax.swing.JLabel();
        botoncrear = new javax.swing.JButton();
        botonbuscar1 = new javax.swing.JButton();
        labelcodigoproducto = new javax.swing.JLabel();
        txtcodigoproducto = new javax.swing.JTextField();
        labelcantidad = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        botonagregar = new javax.swing.JButton();
        botonbuscar2 = new javax.swing.JButton();
        labelnombreproducto = new javax.swing.JLabel();
        txtnombreproducto = new javax.swing.JTextField();
        labelquitar = new javax.swing.JLabel();
        labelquitarcodigo = new javax.swing.JLabel();
        txtquitar = new javax.swing.JTextField();
        botonquitar = new javax.swing.JButton();

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

        labelcodigoproducto.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labelcodigoproducto.setText("Codigo de producto");

        labelcantidad.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labelcantidad.setText("Cantidad");

        botonagregar.setFont(new java.awt.Font("Sitka Subheading", 2, 18)); // NOI18N
        botonagregar.setText("Agregar");
        botonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregarActionPerformed(evt);
            }
        });

        botonbuscar2.setFont(new java.awt.Font("Sitka Subheading", 2, 18)); // NOI18N
        botonbuscar2.setText("Buscar");
        botonbuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscar2ActionPerformed(evt);
            }
        });

        labelnombreproducto.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        labelnombreproducto.setText("Nombre producto");

        txtnombreproducto.setEditable(false);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
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
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtdireccion)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelcantidad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelcodigoproducto)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcodigoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonbuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addComponent(labelnombreproducto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnombreproducto, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelquitar)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelquitarcodigo)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtquitar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonquitar)))
                                .addGap(167, 167, 167)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lablesubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labeliva)
                                    .addComponent(labeltotal))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(botoncrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtiva, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsubtotal)
                                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonbuscar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelnumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnumerofactura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcodigoproducto)
                    .addComponent(txtcodigoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscar2)
                    .addComponent(labelnombreproducto)
                    .addComponent(txtnombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcantidad)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonagregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lablesubtotal)
                            .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labeliva)
                            .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(labelquitar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelquitarcodigo)
                            .addComponent(txtquitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonquitar))))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltotal)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botoncrear)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumerofacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumerofacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumerofacturaActionPerformed

    private void txtsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubtotalActionPerformed

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
        txtcodigoproducto.setText("");
        txtnombreproducto.setText("");
        txtcantidad.setText("");
        txtsubtotal.setText("");
        txttotal.setText("");
        txtquitar.setText("");
    }
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

    private void botonagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregarActionPerformed
        // TODO add your handling code here:
        FacturaDetalle facturaDetalle = new FacturaDetalle();
        int codigoProducto=Integer.parseInt(txtcodigoproducto.getText());
        producto = controladorProducto.read(codigoProducto);
        txtnombreproducto.setText("");
        facturaDetalle.setProducto(producto);
        facturaDetalle.setCantidad(Integer.parseInt(txtcantidad.getText()));
        facturaDetalle.setPrecio((producto.getPrecio()));
        facturaDetalle.setSubtotal((producto.getPrecio()*facturaDetalle.getCantidad()));
        txtcodigoproducto.setText("");
        txtcantidad.setText("");
        
        controladorFacturaDetalle.create(facturaDetalle);
        factura.añadirFacturaDetalle(facturaDetalle);
        llenarDatos();
    }//GEN-LAST:event_botonagregarActionPerformed

    private void botonbuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscar2ActionPerformed
        // TODO add your handling code here:
        int codigoProducto=Integer.parseInt(txtcodigoproducto.getText());
        producto = controladorProducto.read(codigoProducto);
        txtnombreproducto.setText(producto.getNombre());
    }//GEN-LAST:event_botonbuscar2ActionPerformed

    private void txtquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquitarActionPerformed

    private void botonquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonquitarActionPerformed
        // TODO add your handling code here:
        int codigoQuitar = Integer.parseInt(txtquitar.getText());
        factura.delete(codigoQuitar);
        contador = 0;
        vaciarTabla();
        llenarDatos();
        txtquitar.setText("");
    }//GEN-LAST:event_botonquitarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonagregar;
    private javax.swing.JButton botonbuscar1;
    private javax.swing.JButton botonbuscar2;
    private javax.swing.JButton botoncrear;
    private javax.swing.JButton botonquitar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelcantidad;
    private javax.swing.JLabel labelcedula;
    private javax.swing.JLabel labelcodigo;
    private javax.swing.JLabel labelcodigoproducto;
    private javax.swing.JLabel labeldireccion;
    private javax.swing.JLabel labelfecha;
    private javax.swing.JLabel labeliva;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel labelnombreproducto;
    private javax.swing.JLabel labelnumero;
    private javax.swing.JLabel labelquitar;
    private javax.swing.JLabel labelquitarcodigo;
    private javax.swing.JLabel labeltelefono;
    private javax.swing.JLabel labeltotal;
    private javax.swing.JLabel lablesubtotal;
    private javax.swing.JTable tabladetalle;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcodigoproducto;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombreproducto;
    private javax.swing.JTextField txtnumerofactura;
    private javax.swing.JTextField txtquitar;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
