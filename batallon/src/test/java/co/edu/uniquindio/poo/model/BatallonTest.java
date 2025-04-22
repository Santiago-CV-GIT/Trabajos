package co.edu.uniquindio.poo.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class BatallonTest {

    private static final Logger LOG = Logger.getLogger(BatallonTest.class.getName());

    @Test
    public void testBatallon() {
        LOG.info("Prueba Batallon");

        Batallon mibatallon = new Batallon("PEPE", "NORTE");
        String ubi = mibatallon.getUbicacion();
        assertEquals("NORTE", ubi);

        LOG.info("Fin");

        LOG.info("Prueba Batallon2");
         assertNotEquals("Colombia",ubi);

         LOG.info("Fin");

         LOG.info("Prueba Batallon3");
         assertNotNull(mibatallon.getUbicacion());
         LOG.info("Eres un crack");

         LOG.info("Inico de prueba de null");

         Batallon Mibatallon2=new Batallon(null,null);

         assertNull(Mibatallon2.getUbicacion());

         LOG.info("Fin");

    }
}
