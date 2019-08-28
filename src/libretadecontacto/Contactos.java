package libretadecontacto;

/**
 *
 * @author CBN
 */
public class Contactos {
    private String Nombre, Direccion, Celular, Correo;

    public Contactos(String Nombre, String Direccion, String Celular, String Correo) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Celular = Celular;
        this.Correo = Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
}
