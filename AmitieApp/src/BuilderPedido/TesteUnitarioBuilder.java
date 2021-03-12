/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPedido;

import java.util.LinkedList;

/**
 *
 * @author renat
 */
public class TesteUnitarioBuilder {
    public static void main(String[] args) {
        Item item = new Item();
        item.setCod(1);
        item.setCod_tipo(1);
        item.setQtd(3);
        item.setVlr_unit(5);

        LinkedList<Item> itens = new LinkedList<Item>();
        itens.add(item);

        Item item2 = new Item();
        item2.setCod(2);
        item2.setCod_tipo(2);
        item2.setQtd(5);
        item2.setVlr_unit(10);

        itens.add(item2);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bruno Silva");
        pessoa.setCod(1);

        DiretorPedido diretor = new DiretorPedido(pessoa, itens);
        Pedido pedido = diretor.getPedido();
    }

}
