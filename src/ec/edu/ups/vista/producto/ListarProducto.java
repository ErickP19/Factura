/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.producto;

import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.modelo.Producto;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erics
 */
public class ListarProducto extends javax.swing.JInternalFrame {

         private ControladorProducto controladorProducto;
    /**
     * Creates new form ListarProducto
     */
    public ListarProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.controladorProducto = controladorProducto;
        llenarDatos();
    }
    public void llenarDatos(){
        DefaultTableModel modelo = (DefaultTableModel) lista.getModel();
        Set<Producto> Lista= controladorProducto.getLista();
        for(Producto producto : Lista){
            Object[] datos = {producto.getCodigoProducto(),
                              producto.getNombre(),
                              producto.getPrecio()};
                              modelo.addRow(datos);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTable();

        setClosable(true);

        lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(lista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lista;
    // End of variables declaration//GEN-END:variables
}
