/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPedido;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author renato
 */
public class BuilderPedido {
    private Pedido pedido;
    private Pessoa pessoa;
    private float valorTotalPedido;
    private int codPedido;
    private Nota nota;
    private LinkedList<Item> itens;

    public BuilderPedido(Pessoa pessoa, LinkedList<Item> itens) {
        this.itens = itens;
        this.pessoa = pessoa;
        this.codPedido = 1;
    }

    public void validaPessoa() throws Exception {
        if (!this.pessoa.getAtivo()) {
            throw new Exception("Cliente não está ativo!");
        }
    }

    public void validaItens() throws Exception {
        for (Item item : this.itens) {
            if (!item.verificaEstoque()) {
                throw new Exception("Item está fora de estoque!");
            }
        }
    }

    public void calculaTotal() {
        float valorTotal = 0;
        for (Item item : this.itens) {
            item.calculaValorTotal();
            valorTotal += item.getVlr_total();
        }
        this.valorTotalPedido = valorTotal;
    }

    public void criaNota() {
        this.nota = new Nota();
        this.nota.setCod(1);
        this.nota.setDat_nota(new Date());
        this.nota.setValor(this.valorTotalPedido);
        this.nota.setCod_pedido(this.codPedido);
        this.nota.setSituacao("Pendente");
    }

    public Pedido finalizaPedido() {
        this.pedido = new Pedido(this.codPedido, this.pessoa, this.itens, this.nota);
        return this.pedido;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

}
