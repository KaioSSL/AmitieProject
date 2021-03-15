/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author renat
 */
public class TesteUnitarioSingleton {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        System.out.println("ID do pedido: " + pedido.getCod());
    }
}
