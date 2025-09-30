package co.edu.uniquindio;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());
    @Test
    public void CompararNotNull(){
        LOG.info("Inicio de test CompararNotNull");
        Veterinaria veterinaria1 = new Veterinaria("Dogs lifes", "108553");
        Mascota mascota1 = new Mascota("Roky", "10933");
        assertNotNull(mascota1);
        LOG.info("Fin de test CompararNotNull");
    }
    @Test
    public void CompararNull(){
        LOG.info("Inicio de test CompararNull");
        Veterinaria veterinaria2 = new Veterinaria("Animal Medical", "1114");
        Propietario propietario1 = null;
        assertNull(propietario1);
        LOG.info("Fin de test CompararNull");
    }
    @Test
    public void CompararNombre(){
        LOG.info("Inicio de test CompararNombre");
        Veterinaria veterinaria3 = new Veterinaria("Snoopys", "16546");
        Mascota mascota3 = new Mascota("Rodrigo", "22234");
        assertFalse( veterinaria3.verificarNombre("Rodrigo"));
    }
    /// listMascotas esta vacia , corregir el Assertfalse

}
