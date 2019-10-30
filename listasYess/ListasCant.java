/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasYess;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Yes
 */
public class ListasCant {
   
    private ArrayList<CantanteFamoso>listaCantantesFamosos;

    public ListasCant() {
        this.listaCantantesFamosos = new <CantanteFamoso>ArrayList();
       
    }
   
   
   
    public void listarCantantesFamosos(){
        CantanteFamoso c;
        Iterator<CantanteFamoso>it=listaCantantesFamosos.iterator();
        while (it.hasNext()) {
            c = it.next();
            System.out.println("Cantante: "+ c.getNombre());
            System.out.println("Disco con más ventas:"+c.getDiscoConMasVentas());
        }
    }
    /**
     * @return the listaCantantesFamosos
     */
    public ArrayList<CantanteFamoso> getListaCantantesFamosos() {
        return listaCantantesFamosos;
    }

    /**
     * @param listaCantantesFamosos the listaCantantesFamosos to set
     */
    public void setListaCantantesFamosos(ArrayList<CantanteFamoso> listaCantantesFamosos) {
        this.listaCantantesFamosos = listaCantantesFamosos;
    }
    public void setCantanteFamoso(CantanteFamoso Cantante){
        listaCantantesFamosos.add(Cantante);
    }
}

