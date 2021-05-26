package Funciones;
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
    public static void error(Exception x){
        JOptionPane.showMessageDialog(null, "Ah ocurrido un error: \n"+x.getMessage());
    }
}