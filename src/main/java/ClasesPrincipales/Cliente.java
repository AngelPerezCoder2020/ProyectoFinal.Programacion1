package ClasesPrincipales;

public class Cliente {
    private String nombre;
    private String direccion;
    private String edad;
    
    public Cliente(){
        this.nombre = null;
        this.direccion = null;
        this.edad = null;
    }
    public void setNombre(String x){
        nombre = x;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDireccion(String x){
        direccion = x;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setEdad(String x){
        edad = x;
    }
    public String getEdad(){
        return edad;
    }   
}
