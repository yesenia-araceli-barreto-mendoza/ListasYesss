/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasYess;

/**
 *
 * @author Yes
 */
public class CantanteFamoso {
   
    private String nombre;
    private String discoConMasVentas;

    public CantanteFamoso() {
        this.nombre = "";
        this.discoConMasVentas = "";
    }

    public CantanteFamoso(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the discoConMasVentas
     */
    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    /**
     * @param discoConMasVentas the discoConMasVentas to set
     */
    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }
   
}

