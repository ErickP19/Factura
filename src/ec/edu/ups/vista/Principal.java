/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;


import ec.edu.ups.vista.cliente.ListarCLiente;
import ec.edu.ups.vista.cliente.ModificarCliente;
import ec.edu.ups.vista.cliente.BuscarCliente;
import ec.edu.ups.vista.cliente.EliminarCliente;
import ec.edu.ups.vista.cliente.CrearCliente;

import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.controladores.ControladorFactura;
import ec.edu.ups.controladores.ControladorFacturaDetalle;
import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.vista.factura.BuscarFactura;
import ec.edu.ups.vista.factura.CrearFactura1;
import ec.edu.ups.vista.factura.EliminarFactura;
import ec.edu.ups.vista.factura.ListarFactura;
import ec.edu.ups.vista.factura.ModificarFactura;
import ec.edu.ups.vista.producto.BuscarProducto;
import ec.edu.ups.vista.producto.CrearProducto;
import ec.edu.ups.vista.producto.EliminarProducto;
import ec.edu.ups.vista.producto.ListarProducto;
import ec.edu.ups.vista.producto.ModificarProducto;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author erics
 */
public class Principal extends javax.swing.JFrame {
    
    private ControladorCliente  controladorCliente;
    private ControladorProducto controladorProducto;
    private ControladorFactura controladorFactura;
    private ControladorFacturaDetalle controladorFacturaDetalle;
    private Locale localizacion;
    private ResourceBundle mensajes;
    
    //Cliente
    private CrearCliente crearCliente;
    private BuscarCliente readCliente;
    private ModificarCliente updateCliente;
    private EliminarCliente deleteCliente;
    private ListarCLiente listarClientes;

  

    //Producto
    private CrearProducto crearProducto;
    private BuscarProducto readProducto;
    private ModificarProducto updateProducto;
    private EliminarProducto deleteProducto;
    private ListarProducto listarProducto;
    
     //Factura
    private CrearFactura1 crearFactura;
    private BuscarFactura readFactura;
    private ModificarFactura updateFactura;
    private EliminarFactura deleteFactura;
    private ListarFactura listarFacturas;

    

    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
         setLocationRelativeTo(null);
        controladorFactura = new ControladorFactura();
        controladorCliente = new ControladorCliente();
        controladorProducto = new ControladorProducto();
        controladorFacturaDetalle = new ControladorFacturaDetalle();
        localizacion = new Locale("es","EC");
        Locale.setDefault(localizacion);
         cambiaridioma();
        /*
        System.out.println("Localizacion Forzada: "+Locale.getDefault().getLanguage());
        
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());
        System.out.println("Mensajes");
        System.out.println(mensajes.getString("menu.item.crear"));
        */
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        clientemenu = new javax.swing.JMenu();
        crearcliente = new javax.swing.JMenuItem();
        buscarcliente = new javax.swing.JMenuItem();
        modificarcliente = new javax.swing.JMenuItem();
        eliminarcliente = new javax.swing.JMenuItem();
        listarcliente = new javax.swing.JMenuItem();
        menuproducto = new javax.swing.JMenu();
        crearproducto = new javax.swing.JMenuItem();
        buscarproducto = new javax.swing.JMenuItem();
        modificarproducto = new javax.swing.JMenuItem();
        eliminarproducto = new javax.swing.JMenuItem();
        listarproducto = new javax.swing.JMenuItem();
        menufactura = new javax.swing.JMenu();
        crearfactura = new javax.swing.JMenuItem();
        buscarfactura = new javax.swing.JMenuItem();
        modificarfactura = new javax.swing.JMenuItem();
        eliminarfactura = new javax.swing.JMenuItem();
        listarfactura = new javax.swing.JMenuItem();
        menuidioma = new javax.swing.JMenu();
        ingles = new javax.swing.JMenuItem();
        español = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clientemenu.setMnemonic('f');
        clientemenu.setText("Cliente");

        crearcliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        crearcliente.setMnemonic('o');
        crearcliente.setText("Create");
        crearcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearclienteActionPerformed(evt);
            }
        });
        clientemenu.add(crearcliente);

        buscarcliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        buscarcliente.setMnemonic('a');
        buscarcliente.setText("Read");
        buscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarclienteActionPerformed(evt);
            }
        });
        clientemenu.add(buscarcliente);

        modificarcliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        modificarcliente.setMnemonic('s');
        modificarcliente.setText("Update");
        modificarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarclienteActionPerformed(evt);
            }
        });
        clientemenu.add(modificarcliente);

        eliminarcliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        eliminarcliente.setMnemonic('x');
        eliminarcliente.setText("Delete");
        eliminarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarclienteActionPerformed(evt);
            }
        });
        clientemenu.add(eliminarcliente);

        listarcliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        listarcliente.setText("List");
        listarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarclienteActionPerformed(evt);
            }
        });
        clientemenu.add(listarcliente);

        menuBar.add(clientemenu);

        menuproducto.setMnemonic('f');
        menuproducto.setText("Producto");

        crearproducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        crearproducto.setMnemonic('o');
        crearproducto.setText("Create");
        crearproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearproductoActionPerformed(evt);
            }
        });
        menuproducto.add(crearproducto);

        buscarproducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        buscarproducto.setMnemonic('a');
        buscarproducto.setText("Read");
        buscarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarproductoActionPerformed(evt);
            }
        });
        menuproducto.add(buscarproducto);

        modificarproducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        modificarproducto.setMnemonic('s');
        modificarproducto.setText("Update");
        modificarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarproductoActionPerformed(evt);
            }
        });
        menuproducto.add(modificarproducto);

        eliminarproducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        eliminarproducto.setMnemonic('x');
        eliminarproducto.setText("Delete");
        eliminarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarproductoActionPerformed(evt);
            }
        });
        menuproducto.add(eliminarproducto);

        listarproducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        listarproducto.setText("List");
        listarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarproductoActionPerformed(evt);
            }
        });
        menuproducto.add(listarproducto);

        menuBar.add(menuproducto);

        menufactura.setMnemonic('f');
        menufactura.setText("Factura");

        crearfactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        crearfactura.setMnemonic('o');
        crearfactura.setText("Create");
        crearfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearfacturaActionPerformed(evt);
            }
        });
        menufactura.add(crearfactura);

        buscarfactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        buscarfactura.setMnemonic('a');
        buscarfactura.setText("Read");
        buscarfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarfacturaActionPerformed(evt);
            }
        });
        menufactura.add(buscarfactura);

        modificarfactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        modificarfactura.setMnemonic('s');
        modificarfactura.setText("Update");
        modificarfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarfacturaActionPerformed(evt);
            }
        });
        menufactura.add(modificarfactura);

        eliminarfactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        eliminarfactura.setMnemonic('x');
        eliminarfactura.setText("Delete");
        eliminarfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarfacturaActionPerformed(evt);
            }
        });
        menufactura.add(eliminarfactura);

        listarfactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        listarfactura.setText("List");
        listarfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarfacturaActionPerformed(evt);
            }
        });
        menufactura.add(listarfactura);

        menuBar.add(menufactura);

        menuidioma.setText("Idioma");

        ingles.setText("Ingles");
        ingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inglesActionPerformed(evt);
            }
        });
        menuidioma.add(ingles);

        español.setText("Español");
        español.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                españolActionPerformed(evt);
            }
        });
        menuidioma.add(español);

        menuBar.add(menuidioma);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarclienteActionPerformed
        if (deleteCliente == null || deleteCliente.isVisible() == false) {
            deleteCliente = new EliminarCliente(controladorCliente, mensajes);
            deleteCliente.setVisible(true);
            desktopPane.add(deleteCliente);
        }
    }//GEN-LAST:event_eliminarclienteActionPerformed

    private void crearclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearclienteActionPerformed
        // TODO add your handling code here:
        if (crearCliente == null || crearCliente.isVisible() == false) {
            crearCliente = new CrearCliente(controladorCliente, mensajes);
            crearCliente.setVisible(true);
            desktopPane.add(crearCliente);
        }
    }//GEN-LAST:event_crearclienteActionPerformed

    private void buscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarclienteActionPerformed
        // TODO add your handling code here:
       if (readCliente == null || readCliente.isVisible() == false) {
            readCliente = new BuscarCliente(controladorCliente, mensajes);
            readCliente.setVisible(true);
            desktopPane.add(readCliente);
        }
    }//GEN-LAST:event_buscarclienteActionPerformed

    private void modificarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarclienteActionPerformed
        // TODO add your handling code here:
        if (updateCliente == null || updateCliente.isVisible() == false) {
            updateCliente = new ModificarCliente(controladorCliente, mensajes);
            updateCliente.setVisible(true);
            desktopPane.add(updateCliente);
        }
    }//GEN-LAST:event_modificarclienteActionPerformed

    private void listarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarclienteActionPerformed
        // TODO add your handling code here:
        if (listarClientes == null || listarClientes.isVisible() == false) {
            listarClientes = new ListarCLiente(controladorCliente, mensajes);
            listarClientes.setVisible(true);
            desktopPane.add(listarClientes);
        }
    }//GEN-LAST:event_listarclienteActionPerformed

    private void crearproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearproductoActionPerformed
        // TODO add your handling code here:
       if (crearProducto== null || crearProducto.isVisible() == false) {
            crearProducto = new CrearProducto(controladorProducto, mensajes);
            crearProducto.setVisible(true);
            desktopPane.add(crearProducto);
        }
    }//GEN-LAST:event_crearproductoActionPerformed

    private void modificarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarproductoActionPerformed
        // TODO add your handling code here:
       if (updateProducto== null || updateProducto.isVisible() == false) {
            updateProducto = new ModificarProducto(controladorProducto, mensajes);
            updateProducto.setVisible(true);
            desktopPane.add(updateProducto);
        }
    }//GEN-LAST:event_modificarproductoActionPerformed

    private void buscarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarproductoActionPerformed
        // TODO add your handling code here:
        if (readProducto== null || readProducto.isVisible() == false) {
            readProducto = new BuscarProducto(controladorProducto, mensajes);
            readProducto.setVisible(true);
            desktopPane.add(readProducto);
        }
    }//GEN-LAST:event_buscarproductoActionPerformed

    private void eliminarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarproductoActionPerformed
        // TODO add your handling code here:
        if (deleteProducto== null || deleteProducto.isVisible() == false) {
            deleteProducto = new EliminarProducto(controladorProducto, mensajes);
            deleteProducto.setVisible(true);
            desktopPane.add(deleteProducto);
        }
    }//GEN-LAST:event_eliminarproductoActionPerformed

    private void listarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarproductoActionPerformed
        // TODO add your handling code here:
        if (listarProducto== null || listarProducto.isVisible() == false) {
            listarProducto = new ListarProducto(controladorProducto,mensajes);
            listarProducto.setVisible(true);
            desktopPane.add(listarProducto);
        }
    }//GEN-LAST:event_listarproductoActionPerformed

    private void inglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inglesActionPerformed
        // TODO add your handling code here:
         localizacion = new Locale("en","US");
        Locale.setDefault(localizacion);
        cambiaridioma();
        System.out.println("Localizacion Forzada: "+Locale.getDefault().getLanguage());
    }//GEN-LAST:event_inglesActionPerformed

    private void españolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_españolActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("es","EC");
        Locale.setDefault(localizacion);
        cambiaridioma();
        System.out.println("Localizacion Forzada: "+Locale.getDefault().getLanguage());
    }//GEN-LAST:event_españolActionPerformed

    private void crearfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearfacturaActionPerformed
        // TODO add your handling code here:
       if (crearFactura == null || crearFactura.isVisible() == false) {
            crearFactura = new CrearFactura1(controladorFactura, controladorCliente, controladorFacturaDetalle,controladorProducto, mensajes);
            crearFactura.setVisible(true);
            desktopPane.add(crearFactura);
        } 
    }//GEN-LAST:event_crearfacturaActionPerformed

    private void modificarfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarfacturaActionPerformed
        // TODO add your handling code here:
       if (updateFactura== null || updateFactura.isVisible() == false) {
            updateFactura = new ModificarFactura(controladorFactura, controladorProducto, controladorFacturaDetalle, controladorCliente, mensajes);
            updateFactura.setVisible(true);
            desktopPane.add(updateFactura);
        }
    }//GEN-LAST:event_modificarfacturaActionPerformed

    private void buscarfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarfacturaActionPerformed
        // TODO add your handling code here:
        if (readFactura == null || readFactura.isVisible() == false) {
            readFactura = new BuscarFactura(controladorFactura, mensajes);
            readFactura.setVisible(true);
            desktopPane.add(readFactura);
        }
        
 
    }//GEN-LAST:event_buscarfacturaActionPerformed

    private void eliminarfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarfacturaActionPerformed
        // TODO add your handling code here:
        if (deleteFactura== null || deleteFactura.isVisible() == false) {
            deleteFactura = new EliminarFactura(controladorFactura, mensajes);
            deleteFactura.setVisible(true);
            desktopPane.add(deleteFactura);
        }
        
    }//GEN-LAST:event_eliminarfacturaActionPerformed

    private void listarfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarfacturaActionPerformed
        // TODO add your handling code here:
         if (listarFacturas== null || listarFacturas.isVisible() == false) {
            listarFacturas = new ListarFactura(controladorFactura, mensajes);
            listarFacturas.setVisible(true);
            desktopPane.add(listarFacturas);
        }
    }//GEN-LAST:event_listarfacturaActionPerformed
    public void cambiaridioma(){
       mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());
        
        clientemenu.setText(mensajes.getString("menu.cliente"));
        
        crearcliente.setText(mensajes.getString("menu.item.crear"));
        buscarcliente.setText(mensajes.getString("menu.item.buscar"));
        modificarcliente.setText(mensajes.getString("menu.item.modificar"));
        eliminarcliente.setText(mensajes.getString("menu.item.eliminar"));
        listarcliente.setText(mensajes.getString("menu.item.lista"));
        
        menuproducto.setText(mensajes.getString("menu.producto"));
        
        crearproducto.setText(mensajes.getString("menu.item.crear"));
        buscarproducto.setText(mensajes.getString("menu.item.buscar"));
        modificarproducto.setText(mensajes.getString("menu.item.modificar"));
        eliminarproducto.setText(mensajes.getString("menu.item.eliminar"));
        listarproducto.setText(mensajes.getString("menu.item.lista"));
        
        menufactura.setText(mensajes.getString("menu.Factura"));
        
        crearfactura.setText(mensajes.getString("menu.item.crear"));
        buscarfactura.setText(mensajes.getString("menu.item.buscar"));
        modificarproducto.setText(mensajes.getString("menu.item.modificar"));
        eliminarproducto.setText(mensajes.getString("menu.item.eliminar"));
        listarproducto.setText(mensajes.getString("menu.item.lista"));
        
        menuidioma.setText(mensajes.getString("menu.idioma"));
        ingles.setText(mensajes.getString("menu.item.ingles"));
        español.setText(mensajes.getString("menu.item.espa"));
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem buscarcliente;
    private javax.swing.JMenuItem buscarfactura;
    private javax.swing.JMenuItem buscarproducto;
    private javax.swing.JMenu clientemenu;
    private javax.swing.JMenuItem crearcliente;
    private javax.swing.JMenuItem crearfactura;
    private javax.swing.JMenuItem crearproducto;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem eliminarcliente;
    private javax.swing.JMenuItem eliminarfactura;
    private javax.swing.JMenuItem eliminarproducto;
    private javax.swing.JMenuItem español;
    private javax.swing.JMenuItem ingles;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem listarcliente;
    private javax.swing.JMenuItem listarfactura;
    private javax.swing.JMenuItem listarproducto;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menufactura;
    private javax.swing.JMenu menuidioma;
    private javax.swing.JMenu menuproducto;
    private javax.swing.JMenuItem modificarcliente;
    private javax.swing.JMenuItem modificarfactura;
    private javax.swing.JMenuItem modificarproducto;
    // End of variables declaration//GEN-END:variables

}
