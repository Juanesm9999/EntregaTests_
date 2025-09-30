package co.edu.uniquindio;

public class Veterinaria {
    // Atributos Propios
    private String nombre;
    private String nit;

    // Atributos de Relaciones
    private Propietario[] listPropietarios;
    private Mascota[] listMascotas;


    public Veterinaria(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        listPropietarios = new Propietario[10];
        listMascotas = new Mascota[10];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Propietario[] getListPropietarios() {
        return listPropietarios;
    }

    public void setListPropietarios(Propietario[] listPropietarios) {
        this.listPropietarios = listPropietarios;
    }

    public Mascota[] getListMascotas() {
        return listMascotas;
    }

    public void setListMascotas(Mascota[] listMascotas) {
        this.listMascotas = listMascotas;
    }
    public boolean verificarMascota(Mascota mascota) {
        for (int i=0; i<listMascotas.length; i++){
        if (listMascotas[i].equals(mascota)){
        return true;
        }
        }
        return false;
    }

    public boolean verificarNombre(String nombre){
        for(int i = 0; i < listMascotas.length; i++) {
            if(listMascotas[i].getNombre().equals(nombre)){
                return true;

            }
        }
        return false;
    }
    public Mascota VerificarNull(){
        for (int i = 0; i < listMascotas.length; i++) {
            if (listMascotas[i] != null) {
                return listMascotas[i];
            }
        }
        return null;
    }
}
