package com.alcebiades.model;

import com.alcebiades.enumeration.Status;

/**
 *
 * @author Alcebiades
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pedido p = new Pedido();
        p.setSatus(Status.PROCESSANDO);
        p.alterar();
    }
    
}
