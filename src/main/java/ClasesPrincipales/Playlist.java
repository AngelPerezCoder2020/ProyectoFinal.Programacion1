package ClasesPrincipales;

public class Playlist {
    private String ID_nombre;
    private String nombre;
    private String ID_pelicula;
    private String pelicula;

    public Playlist() {
    }

    
    public String getID_nombre() {
        return ID_nombre;
    }

    public void setID_nombre(String ID_nombre) {
        this.ID_nombre = ID_nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID_pelicula() {
        return ID_pelicula;
    }

    public void setID_pelicula(String ID_pelicula) {
        this.ID_pelicula = ID_pelicula;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
}
