package deTodoSA;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author johan
 */
public class BusqPorPrecio extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form BusqPorPrecio
     */
    public BusqPorPrecio() {
        initComponents();
        armarCabecera();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPrecioMin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecioMax = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("Listado Rango de Precios");

        jLabel2.setText("Entre $");

        txtPrecioMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioMinKeyReleased(evt);
            }
        });

        jLabel3.setText("y $");

        txtPrecioMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioMaxActionPerformed(evt);
            }
        });
        txtPrecioMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioMaxKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioMaxActionPerformed
        
    }//GEN-LAST:event_txtPrecioMaxActionPerformed
// COMO REALIZAR LA BUSQUEDA SI CON UN EVN O AGREGAR UN BOTÓN PARA COMPLETAR EL CODIGO
    
    private void txtPrecioMinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioMinKeyReleased
        // TODO add your handling code here:
        borrarFilas();
        if (txtPrecioMax.equals("")) {
            for (Producto aux :MenuPrincipal.listaProducto) {
                if (aux.getPrecio() >= Double.parseDouble(txtPrecioMin.getText())) {
                    modelo.addRow(new Object[] {aux.getCodigo(), aux.getDescripcion(), aux.getPrecio(), aux.getStock()});
                }
            }
        } else {
            for (Producto aux :MenuPrincipal.listaProducto) {
                if (aux.getPrecio() >= Double.parseDouble(txtPrecioMin.getText()) &&
                      aux.getPrecio() <= Double.parseDouble(txtPrecioMax.getText())) {
                    modelo.addRow(new Object[] {aux.getCodigo(), aux.getDescripcion(), aux.getPrecio(), aux.getStock()});
                }
        }
        }
    }//GEN-LAST:event_txtPrecioMinKeyReleased

    private void txtPrecioMaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioMaxKeyReleased
        // TODO add your handling code here:
        borrarFilas();
        if (txtPrecioMin.equals("")) {
            for (Producto aux :MenuPrincipal.listaProducto) {
                if (aux.getPrecio() <= Double.parseDouble(txtPrecioMax.getText())) {
                    modelo.addRow(new Object[] {aux.getCodigo(), aux.getDescripcion(), aux.getPrecio(), aux.getStock()});
                }
            }
        } else {
            for (Producto aux :MenuPrincipal.listaProducto) {
                if (aux.getPrecio() >= Double.parseDouble(txtPrecioMin.getText()) &&
                      aux.getPrecio() <= Double.parseDouble(txtPrecioMax.getText())) {
                    modelo.addRow(new Object[] {aux.getCodigo(), aux.getDescripcion(), aux.getPrecio(), aux.getStock()});
                }
        }
        }
    }//GEN-LAST:event_txtPrecioMaxKeyReleased

    private void armarCabecera() {
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jTable1.setModel(modelo);
    }

    private void borrarFilas() {
        int f = jTable1.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtPrecioMax;
    private javax.swing.JTextField txtPrecioMin;
    // End of variables declaration//GEN-END:variables
}
