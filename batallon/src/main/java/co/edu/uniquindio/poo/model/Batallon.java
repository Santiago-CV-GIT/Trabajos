package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Optional;

public class Batallon {
    private String nombre;
    private String ubicacion;
    private ArrayList<Vehiculo> listaVehiculos;
    private ArrayList<Mision> listaMisiones;
    private ArrayList<Soldado> listaSoldados;

    public Batallon(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String agregarVehiculo(String id, String modelo, String fechaFabricacion, int kilometraje, EstadoOperativo estadoOperativo) {
        String mensaje = "";
        Vehiculo encontrado = null;
        Optional<Vehiculo> optionalVehiculo = buscarVehiculo(id);
        Vehiculo nuevoVehiculo = null;
        if (encontrado != null) {
            mensaje = " El vehiculo ya existe";
        }else{
            nuevoVehiculo= new Vehiculo(id, modelo, fechaFabricacion, kilometraje, estadoOperativo);
            listaVehiculos.add(nuevoVehiculo);
            mensaje = " El vehiculo se ha registrado";
        }
        return mensaje;
    }

    /**public Vehiculo buscarVehiculo(String idVehiculo) {
        Vehiculo encontrado = null;
        for (Vehiculo aux : listaVehiculos) {
            if(aux.getId().equals(idVehiculo)) {
                encontrado = aux;
            }
        }
        return encontrado;
    }
     */
    public Vehiculo buscarVehiculomision(){
        for (Mision aux  :listaMisiones ) {
            ArrayList<Vehiculo> vehiculosmisiones=aux.getVehiculosRequeridos();
            if () {}
        }
    }
    public Optional<Vehiculo> buscarVehiculo(String id) {
        return Optional.of(listaVehiculos.stream().filter(v -> v != null && v.getId().equals(id)).findFirst().get());
    }


    public String actualizarVehiculo(String idVehiculo, int newKilometraje, EstadoOperativo newEstadoOperativo) {
        String mensaje = "";
        Vehiculo encontrado = null;
        Optional<Vehiculo> optionalVehiculo = buscarVehiculo(idVehiculo);
        if (encontrado != null) {
            encontrado.setKilometraje(newKilometraje);
            encontrado.setEstadoOperativo(newEstadoOperativo);
            mensaje = " El vehiculo se ha actualizado";
        }else{
            mensaje = " El vehiculo no existe";
        }
        return mensaje;
    }

    public String eliminarVehiculo(String idVehiculo) {
        String mensaje = "";
        Vehiculo encontrado = null;
        Optional<Vehiculo> optionalVehiculo = buscarVehiculo(idVehiculo);
        if (encontrado != null) {
            listaVehiculos.remove(encontrado);
            mensaje = " El vehiculo se ha eliminado";
        }else{
            mensaje = " El vehiculo no existe";
        }

        return mensaje;
    }

    public String agregarMision(String codigoMision,String fecha, String ubicacion) {
        String mensaje = "";
        Mision encontrado = null;
        encontrado = buscarMision(codigoMision);
        Mision nuevaMison = null;
        if (encontrado != null) {
            mensaje = "La mision ya existe en el sistema";
        }else{
            nuevaMison = new Mision(codigoMision, fecha, ubicacion);
            listaMisiones.add(nuevaMison);
            mensaje = " El mision se ha agregado";
        }
        return mensaje;
    }

    public Mision buscarMision(String idMision) {
        Mision encontrado = null;
        for (Mision aux : listaMisiones) {
            if(aux.getCodigoMision().equals(idMision)) {
                encontrado = aux;
            }
        }
        return encontrado;
    }

    public String eliminarMision(String idMision) {
        String mensaje = "";
        Mision encontrada = null;
        encontrada = buscarMision(idMision);
        if (encontrada != null) {
            listaMisiones.remove(encontrada);
            mensaje = " El mision se ha eliminado con exito ";
        }
        return mensaje;
    }

    public String agregarSoldado(String id, String rango, String nombre, String apellido, int edad){
        String mensaje = "";
        Soldado encontrado = null;
        encontrado = buscarSoldado(id);
        Soldado nuevoSoldado = null;
        if (encontrado != null) {
            mensaje = "La soldada ya existe en el sistema";
        }else{
            nuevoSoldado = new Soldado(id, rango, nombre, apellido, edad);
            listaSoldados.add(nuevoSoldado);
            mensaje = " El soldada se ha agregado";
        }
        return mensaje;
    }

    public Soldado buscarSoldado(String id) {
        Soldado encontrado = null;
        for (Soldado aux : listaSoldados) {
            if(aux.getId().equals(id)) {
                encontrado = aux;
            }
        }
        return encontrado;
    }


    public String actualizarSoldado(String id, String newRango, String newNombre){
        String mensaje = "";
        Soldado encontrado = null;
        encontrado = buscarSoldado(id);
        if (encontrado != null) {
            encontrado.setRango(newRango);
            encontrado.setNombre(newNombre);
            mensaje = " El soldada se ha actualizado";
        }else{
            mensaje = " El soldada no existe";
        }
        return mensaje;
    }


    public String eliminarSoldado(String id){
        String mensaje = "";
        Soldado encontrado = null;
        encontrado = buscarSoldado(id);
        if (encontrado != null) {
            listaSoldados.remove(encontrado);
            mensaje = " El soldada se ha eliminado";
        }else{
            mensaje = " El soldada no existe";
        }
        return mensaje;
    }



    public ArrayList<Soldado> getListaSoldados() {
        return listaSoldados;
    }

    public void setListaSoldados(ArrayList<Soldado> listaSoldados) {
        this.listaSoldados = listaSoldados;
    }

    public ArrayList<Mision> getListaMisiones() {
        return listaMisiones;
    }

    public void setListaMisiones(ArrayList<Mision> listaMisiones) {
        this.listaMisiones = listaMisiones;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
