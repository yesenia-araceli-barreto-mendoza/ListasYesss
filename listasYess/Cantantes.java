/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasYess;
 import java.util.Scanner;
/**
 *
 * @author Yes
 */

 

/**
 *
 * @author don_h_000
 */
public class Cantantes {
    private String entradaTeclado;

    public Cantantes() {
        Scanner sc= new Scanner(System.in);
       
        this.entradaTeclado = sc.nextLine();
    }

    /**
     * @return the entradaTeclado
     */
    public String getEntradaTeclado() {
        return entradaTeclado;
    }

    /**
     * @param entradaTeclado the entradaTeclado to set
     */
    public void setEntradaTeclado(String entradaTeclado) {
        this.entradaTeclado = entradaTeclado;
    }
   
}

