package co.edu.uniquindio.poo.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class BatallonTest {

    private static final Logger LOG = Logger.getLogger(BatallonTest.class.getName());

    public boolean datocorrecto(){
        return true;
    }

    @Test
    public void testBatallon() {
        LOG.info("Prueba Batallon");

        Batallon mibatallon = new Batallon("PEPE", "NORTE");
        ArrayList<Mision> listamisiones1=new ArrayList<>();
        ArrayList<Soldado> listasoldado=new ArrayList<>();
        mibatallon.agregarSoldado("12","MAYOR","Esteban","Castillo",19,listamisiones1);
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

         LOG.info("Prueba Batallon4");
         assertTrue(datocorrecto());
         LOG.info("Fin");

    }
}
