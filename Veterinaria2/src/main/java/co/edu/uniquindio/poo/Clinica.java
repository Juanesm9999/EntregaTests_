package co.edu.uniquindio.poo;

public class Clinica {
    private String nombre, nit;

    private Mascota[] listMascotas;
    private Propietario[] listPropietarios;

    public Clinica(String nombre, String nit){
        this.nombre = nombre;
        this.nit = nit;
        listMascotas = new Mascota[10];
        listPropietarios = new Propietario[10];
    }

    // ---------------------------------------------- CRUD Porpietario ------------------------------------------------

    public boolean agregarPropietario (String nombre, String numContacto, String direccion, String identificacion){

        Propietario nuevoPropietario =
                new Propietario(nombre, numContacto, direccion, identificacion);

        for (int i = 0; i < listPropietarios.length; i++){
            if (listPropietarios[i] == null && listPropietarios[i].getIdentificacion().equals(identificacion)){
                return false;
            }
        }

        for (int i = 0; i < listPropietarios.length; i++){
            if (listPropietarios[i] == null ){
                listPropietarios[i] = nuevoPropietario;
                return true;
            }
        }
        return false;
    }

    private int obtenerPosicionPropietario (String identificacion){
        for (int i = 0; i < listPropietarios.length; i++) {
            if (listPropietarios[i] == null &&
                    listPropietarios[i].getIdentificacion().equals(identificacion)){
                return i;
            }
        }
        return -1;
    }

    public boolean eliminarPropietario (String identificacion){
        int indexPropietario = obtenerPosicionPropietario(identificacion);

        if (indexPropietario == -1) return false;

        listPropietarios[indexPropietario] = null;
        return true;
    }

    public boolean actualizarPropietario (String nombre, String numContacto, String direccion, String identificacion){
        int indexPropietario = obtenerPosicionPropietario(identificacion);
        if (indexPropietario == -1) return false;

        Propietario actualPropietario = listPropietarios[indexPropietario];

        actualPropietario.setIdentificacion(identificacion);
        actualPropietario.setNombre(nombre);
        actualPropietario.setNumContacto(numContacto);
        actualPropietario.setDireccion(direccion);
        return true;
    }

    public Propietario obtenerPropietario (String identificacion){
        int indexPropietario = obtenerPosicionPropietario(identificacion);
        if (indexPropietario == -1) return null;
        return listPropietarios[indexPropietario];
    }

    public Propietario obtenerListaPropietarios (){
        return listPropietarios[0];
    }



    // ---------------------------------------------- CRUD Mascota -------------------------------------------------------------

    public boolean agregarMascota (String nombre, String tipoAnimal, String raza, int edad, String id) {

        Mascota nuevaMascota =
                new Mascota(nombre, tipoAnimal, raza, edad, id);

        for (int i = 0; i < listMascotas.length; i++) {
            if (listMascotas[i] != null && listMascotas[i].getId().equals(id)) {
                return false;
            }
        }

        for (int i = 0;i < listMascotas.length;i++) {
            if (listMascotas[i] == null ) {
                listMascotas[i] = nuevaMascota;
                return true;
            }
        }

        return false;
    }

    private int obtenerPosicionMascota (String id){
        for (int i = 0; i < listMascotas.length; i++) {
            if (listMascotas[i] == null &&
                    listMascotas[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public boolean eliminarMascota (String id){
        int indexMascota = obtenerPosicionMascota(id);

        if (indexMascota == -1) return false;

        listMascotas[indexMascota] = null;
        return true;
    }

    public boolean actualizarMascota (String nombre, String tipoAnimal, String raza, int edad, String id){
        int indexMascota = obtenerPosicionMascota(id);
        if (indexMascota == -1) return false;

        Mascota actualMascota = listMascotas[indexMascota];

        actualMascota.setId(id);
        actualMascota.setNombre(nombre);
        actualMascota.setTipoAnimal(tipoAnimal);
        actualMascota.setRaza(raza);
        actualMascota.setEdad(edad);
        return true;
    }

    public Mascota obtenerMascota (String id){
        int indexMascota = obtenerPosicionMascota(id);
        if (indexMascota == -1) return null;
        return listMascotas[indexMascota];
    }

    public Mascota obtenerListaMascotas (){
        return listMascotas[0];
    }

    //----------------------------------------------- Getter and Setter ----------------------------------------------

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

    public Mascota[] getListMascotas() {
        return listMascotas;
    }

    public void setListMascotas(Mascota[] listMascotas) {
        this.listMascotas = listMascotas;
    }
}
