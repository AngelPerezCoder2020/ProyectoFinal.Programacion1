package ClasesPrincipales;

public class Peliculas {
    
    private String nombre;
    private String tipo;
    private String genero;
    private String sinopsis;
    
    public Peliculas(){
        this.nombre = null;
        this.tipo = null;
        this.genero = null;
        this.sinopsis = null;
    }  
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }
}
