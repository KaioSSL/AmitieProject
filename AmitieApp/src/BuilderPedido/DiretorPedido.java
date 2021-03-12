/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPedido;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author renat
 */
public class DiretorPedido {
    private Pedido pedido;
    private BuilderPedido builder;

    public DiretorPedido(Pessoa pessoa, LinkedList<Item> itens) {
        this.builder = new BuilderPedido(pessoa, itens);
        try {
            this.builder.validaPessoa();
            this.builder.validaItens();
            this.builder.calculaTotal();
            this.builder.criaNota();
        } catch (Exception ex) {
            Logger.getLogger(DiretorPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.pedido = this.builder.finalizaPedido();
    }

    public Pedido getPedido() {
        return this.pedido;
    }
}
