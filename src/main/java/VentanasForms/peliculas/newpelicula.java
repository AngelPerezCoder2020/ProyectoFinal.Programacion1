package VentanasForms.peliculas;

import VentanasForms.VentanaPrincipal;
import Funciones.MSQLconnector;
import ClasesPrincipales.*;
import javax.swing.JOptionPane;

public class newpelicula extends javax.swing.JFrame {
    Peliculas pelicula = new Peliculas();
    public newpelicula() {
        initComponents();
    }
    public void limpiar(){
        nombrepelitxt.setText("");
        sinopsistxt.setText("");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnGuardarPeli = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombrepelitxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tipopeli = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        generopeli = new javax.swing.JComboBox<>();
        sinopsistxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("GUARDAR NUEVA PELICULA");

        btnGuardarPeli.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarPeli.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        btnGuardarPeli.setText("GUARDAR");
        btnGuardarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPeliActionPerformed(evt);
            }
        });

        btnSalida.setBackground(new java.awt.Color(204, 204, 204));
        btnSalida.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        btnSalida.setText("Atras");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("TIPO:");

        tipopeli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SERIE", "PELICULA" }));

        jLabel4.setText("GENERO:");

        generopeli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DRAMA", "COMEDIA", "TERROR ", "SUSPENSO", " " }));

        jLabel5.setText("SINOPSIS:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(sinopsistxt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nombrepelitxt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tipopeli, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(generopeli, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombrepelitxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tipopeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(generopeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(sinopsistxt, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 93, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalida)
                    .addComponent(btnGuardarPeli))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPeliActionPerformed
       if (nombrepelitxt.getText().isEmpty() || sinopsistxt.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "No se pueden guardar campos vacios");
       }else{
            pelicula.setNombre(nombrepelitxt.getText());
            pelicula.setTipo(tipopeli.getSelectedItem().toString());
            pelicula.setGenero(generopeli.getSelectedItem().toString());
            pelicula.setSinopsis(sinopsistxt.getText());
            MSQLconnector.guardarPeli(VentanaPrincipal.con,pelicula.getNombre(),pelicula.getTipo(),pelicula.getGenero(),pelicula.getSinopsis());
            this.limpiar();
            this.setVisible(false);
            MSQLconnector.mostrardatosPeli(VentanaPrincipal.con, VentanaPrincipal.ventanapeliculasv.getTabla());
            VentanaPrincipal.ventanapeliculasv.setVisible(true);
       
       }
       
    }//GEN-LAST:event_btnGuardarPeliActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        this.limpiar();
        this.setVisible(false);
        VentanaPrincipal.ventanapeliculasv.setVisible(true);
    }//GEN-LAST:event_btnSalidaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newpelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarPeli;
    private javax.swing.JButton btnSalida;
    private javax.swing.JComboBox<String> generopeli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombrepelitxt;
    private javax.swing.JTextField sinopsistxt;
    private javax.swing.JComboBox<String> tipopeli;
    // End of variables declaration//GEN-END:variables
}
