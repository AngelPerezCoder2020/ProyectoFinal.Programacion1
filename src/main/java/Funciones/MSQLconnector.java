package Funciones;

import VentanasForms.VentanaPrincipal;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class MSQLconnector {
    public static Connection con = null;
    public static Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/proyectofinalprogra1","root","");
            JOptionPane.showMessageDialog(null, "Base de Datos conectada con exito");
        }catch(Exception ex){
            error(ex);
        }
        return con;
    }
    public static void guardar(Connection x, javax.swing.JTextField n, javax.swing.JTextField a, javax.swing.JTextField d){
        String c = "INSERT INTO `clientes` (`NOMBRE`, `DIRECCION`, `EDAD`) VALUES (?, ?, ?);";
        try{
            PreparedStatement pst = x.prepareStatement(c);
            pst.setString(1, n.getText());
            pst.setString(2, a.getText());
            pst.setString(3, d.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente Guardado en la base de datos");
        }catch(Exception ex){
            error(ex);
        }
    }
    public static void guardarPeli(Connection x, javax.swing.JTextField n, javax.swing.JComboBox t, javax.swing.JComboBox g, javax.swing.JTextField s){
        String c = "INSERT INTO `peliculas` (`NOMBRE`, `TIPO`, `GENERO`, `SINOPSIS`) VALUES (?, ?, ?, ?);";
        try{
            PreparedStatement pst = x.prepareStatement(c);
            pst.setString(1, n.getText());
            pst.setString(2, t.getSelectedItem().toString());
            pst.setString(3, g.getSelectedItem().toString());
            pst.setString(4, s.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Pelicula Guardada en la base de datos");
        }catch(Exception ex){
            error(ex);
        }
    }
    public static void mostrardatos(Connection x, javax.swing.JTable t){
        String[] titulos = {"ID", "NOMBRE", "DIRECCION", "EDAD"};
        String[] Re = new String[4];
        DefaultTableModel mo = new DefaultTableModel(null, titulos);
        t.setModel(mo);
        try{
            Statement st = con.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM `clientes`");
            while(resultado.next()){
                Re[0] = resultado.getString("ID");
                Re[1] = resultado.getString("NOMBRE");
                Re[2] = resultado.getString("DIRECCION");
                Re[3] = resultado.getString("EDAD");
                mo.addRow(Re);
            }
        }catch(Exception ex){
            error(ex);
        }
    }
    public static void mostrardatosPeli(Connection x, javax.swing.JTable t){
        String[] titulos = {"ID", "NOMBRE", "TIPO", "GENERO", "SINOPSIS"};
        String[] Re = new String[5];
        DefaultTableModel mo = new DefaultTableModel(null, titulos);
        t.setModel(mo);
        try{
            Statement st = con.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM `peliculas`");
            while(resultado.next()){
                Re[0] = resultado.getString("ID");
                Re[1] = resultado.getString("NOMBRE");
                Re[2] = resultado.getString("TIPO");
                Re[3] = resultado.getString("GENERO");
                Re[4] = resultado.getString("SINOPSIS");
                mo.addRow(Re);
            }
        }catch(Exception ex){
            error(ex);
        }
    }
    public static void mostrardatosPlayList(Connection x, javax.swing.JTable t){
        String[] titulos = {"NOMBRE", "TIPO", "GENERO", "SINOPSIS"};
        String[] Re = new String[4];
        DefaultTableModel mo = new DefaultTableModel(null, titulos);
        t.setModel(mo);
        try{
            Statement st = con.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM `playlist`");
            while(resultado.next()){
                if(Integer.parseInt(resultado.getString("ID_CLIENTE"))==VentanaPrincipal.ventanaclientev.id){
                    String c = "SELECT FROM `peliculas` WHERE `peliculas`.`ID` = "+resultado.getString("ID_PELICULA").toString()+";";
                    try{
                        ResultSet playL = st.executeQuery(c);
                        Re[0]= playL.getString("NOMBRE").toString();
                        Re[1]= playL.getString("TIPO").toString();
                        Re[2]= playL.getString("GENERO").toString();
                        Re[3]= playL.getString("SINOPSIS").toString();
                        mo.addRow(Re);
                    }catch(Exception ex){
                        error(ex);
                    }
                }else{
                    continue;
                }
            }
        }catch(Exception ex){
            error(ex);
        }
    }
    public static void error(Exception x){
        JOptionPane.showMessageDialog(null, "Ah ocurrido un error: \n"+x.getMessage());
    }
}