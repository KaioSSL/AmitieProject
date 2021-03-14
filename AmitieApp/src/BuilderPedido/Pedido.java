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
 * @author kaiof
 */
public class Pedido {
    private Integer cod;
    private Date dat_pedido;
    private Pessoa pessoa;
    private Nota nota;
    private LinkedList<Item> itens;

    public Pedido(int cod, Pessoa pessoa, LinkedList<Item> itens, Nota nota) {
        this.cod = cod;
        this.itens = itens;
        this.pessoa = pessoa;
        this.nota = nota;
    }

    public Integer getCod() {
        return cod;
    }

    public Date getDat_pedido() {
        return dat_pedido;
    }

    public void setDat_pedido(Date dat_pedido) {
        this.dat_pedido = dat_pedido;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public Nota getNota() {
        return this.nota;
    }

    public LinkedList<Item> getItens() {
        return this.itens;
    }
}
