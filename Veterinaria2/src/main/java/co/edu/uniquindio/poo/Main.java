package co.edu.uniquindio.poo;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Clinica nuevaClinica = new Clinica("Vida Animal","123");
        Mascota[] mascotas = new Mascota[10];
        int contador = 0;
        int opcion;

        do {
            String menu = """
                    === Clínica Veterinaria Vida Animal ===
                    1. Registrar Mascota
                    2. Listar Mascotas
                    3. Actualizar Mascota
                    4. Eliminar Mascota
                    5. Calcular Costo de Consulta
                    0. Salir
                    """;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion){
            case 1:
                if (contador < mascotas.length) {
                    String id = JOptionPane.showInputDialog("Ingrese el número de identificación de la mascota :");
                    String nombre = JOptionPane.showInputDialog("Ingrese nombre :");
                    String tipoAnimal = JOptionPane.showInputDialog("Ingrese el tipo de animal(Perro, Gato, Ave, etc): ");
                    String raza = JOptionPane.showInputDialog("Ingrese raza: ");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad: "));

                    mascotas[contador] = new Mascota(nombre, tipoAnimal, raza, edad, id);
                    contador++;
                    JOptionPane.showMessageDialog(null, "Mascota registrada exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pueden registrar más mascotas.");
                }
                break;

                case 2:
                    if (contador == 0) {
                        JOptionPane.showMessageDialog(null, "No hay mascotas registradas.");
                    } else {
                        StringBuilder sb = new StringBuilder("Lista de Mascotas:\n");
                        for (int i = 0; i < contador; i++) {
                            sb.append(mascotas[i]).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    }
                    break;

                case 3:
                    String idActualizar = JOptionPane.showInputDialog("Ingrese ID de la mascota a actualizar:");
                    boolean encontrada = false;
                    for (int i = 0; i < contador; i++) {
                        if (mascotas[i].getId().equals(idActualizar)) {
                            mascotas[i].setNombre(JOptionPane.showInputDialog("Nuevo nombre:", mascotas[i].getNombre()));
                            mascotas[i].setTipoAnimal(JOptionPane.showInputDialog("Nueva especie:", mascotas[i].getTipoAnimal()));
                            mascotas[i].setRaza(JOptionPane.showInputDialog("Nueva raza:", mascotas[i].getRaza()));
                            mascotas[i].setEdad(Integer.parseInt(JOptionPane.showInputDialog("Nueva edad:", mascotas[i].getEdad())));
                            JOptionPane.showMessageDialog(null, "Mascota actualizada.");
                            encontrada = true;
                            break;
                        }
                    }
                    if (!encontrada) {
                        JOptionPane.showMessageDialog(null, "Mascota no encontrada.");
                    }
                    break;

                case 4:
                    String idEliminar = JOptionPane.showInputDialog("Ingrese ID de la mascota a eliminar:");
                    boolean eliminada = false;
                    for (int i = 0; i < contador; i++) {
                        if (mascotas[i].getId().equals(idEliminar)) {
                            for (int j = i; j < contador - 1; j++) {
                                mascotas[j] = mascotas[j + 1];
                            }
                            mascotas[contador - 1] = null;
                            contador--;
                            eliminada = true;
                            JOptionPane.showMessageDialog(null, "Mascota eliminada.");
                            break;
                        }
                    }
                    if (!eliminada) {
                        JOptionPane.showMessageDialog(null, "Mascota no encontrada.");
                    }
                    break;

                case 5:
                    String idCosto = JOptionPane.showInputDialog("Ingrese ID de la mascota para calcular costo:");
                    Mascota mascotaCosto = null;
                    for (int i = 0; i < contador; i++) {
                        if (mascotas[i].getId().equals(idCosto)) {
                            mascotaCosto = mascotas[i];
                            break;
                        }
                    }
                    if (mascotaCosto != null) {
                        double costo = mascotaCosto.calcularCostoConsulta();
                        JOptionPane.showMessageDialog(null, "El costo de la consulta para " + mascotaCosto.getNombre() + " es: $" + costo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Mascota no encontrada.");
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcion != 0);

    }
}