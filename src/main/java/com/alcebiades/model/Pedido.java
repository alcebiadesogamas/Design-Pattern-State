package com.alcebiades.model;

import com.alcebiades.interfaces.SituacaoPedido;
import com.alcebiades.enumeration.Status;

/**
 *
 * @author Alcebiades
 */
public class Pedido implements SituacaoPedido {

    private String msg;
    private Status status;

    
    public Pedido() {
    
    }
    
    @Override
    public void alterar() {
        switch (status) {
            case PROCESSANDO:
                //código para alteração do pedido
                System.out.println("Pedido alterado!");
                break;
            case CANCELADO:
                msg = "Não é possível alterar um pedido cancelado";
                throw new IllegalStateException(msg);
            case ENVIADO:
                msg = "Não é possivel alterar um pedido enviado";
                throw new IllegalStateException(msg);
        }
    }

    @Override
    public void cancelar() {
      //...  
    }

    @Override
    public void enviar() {
        //...
    }
    public void setSatus(Status status)
    {
        this.status = status;
    }
}
