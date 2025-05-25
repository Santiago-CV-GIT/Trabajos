package co.edu.uniquindio.model;

public class AltavozInteligente extends Electrodomestico implements  Sonido {
    public AltavozInteligente(String nombre,Boolean estado,float consumoenergetico) {
        super(nombre,estado,consumoenergetico);
    }
    @Override
    public Boolean ApagaroEncender(){}

    @Override
    public Void reproducirsonido(){}
}
