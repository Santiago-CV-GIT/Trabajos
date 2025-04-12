package co.edu.uniquindio.poo.model;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.logging.Logger;

import jdk.internal.org.jline.utils.Log;
import org.junit.jupiter.api.Test;
class BatallonTest {
    private static final Logger LOG=Logger.getLogger(BatallonTest.class.getName());
    @Test
    public void testBatallon() {
        Log.info("Prueba Batallon");
        Batallon mibatallon=new Batallon("PEPE","NORTE");
        String ubi=mibatallon.getUbicacion();
        assertEquals("PEPE",ubi);

        Log.info("Fin");

    }
}