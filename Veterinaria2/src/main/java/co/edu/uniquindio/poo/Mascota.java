package co.edu.uniquindio.poo;

public class Mascota {

    private String nombre, tipoAnimal, raza, id;
    private int edad;

    public Mascota(String nombre, String tipoAnimal, String raza, int edad, String id) {
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.raza = raza;
        this.edad = edad;
        this.id = id;
    }

    public double calcularCostoConsulta() {
        double valorBase = 30000;
        double costoTotal = valorBase;

        switch (tipoAnimal.toLowerCase()) {
            case "perro":
                costoTotal = valorBase += 20000;
                break;
            case "gato":
                costoTotal = valorBase += 10000;
                break;
            default:
                costoTotal += 30000;
                break;


        }

        if (edad >= 7) {
            costoTotal += 10000;
        } else if (edad <= 1) {
            costoTotal += 30000;
        }
        return costoTotal;
    }

    //------------------------------------------- Getter and Setter ---------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "ID: " + id +
                " | Nombre: " + nombre +
                " | Especie: " + tipoAnimal +
                " | Raza: " + raza +
                " | Edad: " + edad + " años";

    }
}