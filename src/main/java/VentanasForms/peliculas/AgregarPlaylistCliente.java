package VentanasForms.peliculas;
import ClasesPrincipales.Playlist;
import Funciones.MSQLconnector;
import VentanasForms.VentanaPrincipal;

public class AgregarPlaylistCliente extends javax.swing.JFrame {
    Playlist Nuevaplaylist = new Playlist();
    public String id;
    public AgregarPlaylistCliente() {
        initComponents();
    }
    public void limpiar(){
        txtIDNombre.setText("");
        txtNombre.setText("");
        txtIDPeli.setText("");
        txtPeli.setText("");
    }
    public void guardarid(String x){
        id = x;
    }
    public void limpiartabla(javax.swing.table.DefaultTableModel mo){
        int n = tablapersonal.getRowCount();
        for(int x = n-1; x >= 0; x--){
            mo.removeRow(x);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIDNombre = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtIDPeli = new javax.swing.JTextField();
        txtPeli = new javax.swing.JTextField();
        btnAgregarplaylist = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapeliculas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablapersonal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        jLabel3.setText("Registrar Película");

        jLabel4.setText("ID Nombre:");

        jLabel5.setText("Nombre: ");

        jLabel6.setText("ID Pelicula:");

        jLabel7.setText("Pelicula: ");

        btnAgregarplaylist.setBackground(new java.awt.Color(102, 255, 51));
        btnAgregarplaylist.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        btnAgregarplaylist.setText("Agregar");
        btnAgregarplaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarplaylistActionPerformed(evt);
            }
        });

        btnSalida.setBackground(new java.awt.Color(255, 0, 0));
        btnSalida.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        btnSalida.setText("Salir");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtNombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(29, 29, 29)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIDPeli, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(txtPeli)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAgregarplaylist, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIDNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIDPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarplaylist)
                    .addComponent(btnSalida))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        tablapeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablapeliculasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablapeliculas);

        tablapersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablapersonal);

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        jLabel1.setText("Selecciona la película");

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("PlayList Personal");

        jLabel8.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        jLabel8.setText("Selecciona Cliente");

        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaclientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel8)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarplaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarplaylistActionPerformed
        Nuevaplaylist.setID_nombre(txtIDNombre.getText());
        Nuevaplaylist.setNombre(txtNombre.getText());
        Nuevaplaylist.setID_pelicula(txtIDPeli.getText());
        Nuevaplaylist.setPelicula(txtPeli.getText());
        MSQLconnector.guardarplaylist(VentanaPrincipal.con,Nuevaplaylist.getID_nombre(),Nuevaplaylist.getNombre(),Nuevaplaylist.getID_pelicula(),Nuevaplaylist.getPelicula());
        MSQLconnector.mostrardatosPlayList(VentanaPrincipal.con, tablapersonal);
         
        
        
    }//GEN-LAST:event_btnAgregarplaylistActionPerformed

    private void tablapeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablapeliculasMouseClicked
        int f = tablapeliculas.rowAtPoint(evt.getPoint());
        txtIDPeli.setText(tablapeliculas.getValueAt(f, 0).toString());
        txtPeli.setText(tablapeliculas.getValueAt(f, 1).toString());
   
    }//GEN-LAST:event_tablapeliculasMouseClicked

    private void tablaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientesMouseClicked
        int f = tablaclientes.rowAtPoint(evt.getPoint());
        String id = tablaclientes.getValueAt(f, 0).toString();
        txtIDNombre.setText(id);
        txtNombre.setText(tablaclientes.getValueAt(f, 1).toString());
        guardarid(id);
        MSQLconnector.mostrardatosPlayList(VentanaPrincipal.con, tablapersonal);
       
        
    }//GEN-LAST:event_tablaclientesMouseClicked

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        this.setVisible(false);
        VentanaPrincipal.datosclientev.setVisible(true);
        this.limpiar();
        this.limpiartabla(MSQLconnector.mod);
    }//GEN-LAST:event_btnSalidaActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPlaylistCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPlaylistCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPlaylistCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPlaylistCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPlaylistCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarplaylist;
    private javax.swing.JButton btnSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable tablaclientes;
    public javax.swing.JTable tablapeliculas;
    private javax.swing.JTable tablapersonal;
    private javax.swing.JTextField txtIDNombre;
    private javax.swing.JTextField txtIDPeli;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeli;
    // End of variables declaration//GEN-END:variables
}
