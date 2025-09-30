package co.edu.uniquindio.poo;

public class Propietario {

    private String nombre, numContacto, direccion, identificacion;

    public Propietario(String nombre, String numContacto, String direccion, String identificacion) {
        this.nombre = nombre;
        this.numContacto = numContacto;
        this.direccion = direccion;
        this.identificacion = identificacion;
    }



    // ---------------------------------------- Getter and Setter -----------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(String numContacto) {
        this.numContacto = numContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String id) {
        this.identificacion = identificacion;
    }
}
