/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author renato
 */
public class Pedido {
    private Integer cod;

    public Pedido() {
        this.cod = SingletonID.getInstance().getNextSerial();
    }

    public Integer getCod() {
        return cod;
    }

}
