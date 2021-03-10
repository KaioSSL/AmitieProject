/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_observer;

import javax.swing.JOptionPane;

/**
 *
 * @author kaiof
 */
public class MateriaPrimaObservador implements Observer{
    private Integer limite;   

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }
    
    @Override
    public void analisa(Observado obs) {
        MateriaPrima mp = (MateriaPrima) obs;
        if(mp.getSaldo()<=limite){
            if(mp.getSaldo()<=0){
                JOptionPane.showMessageDialog(null, "Saldo negativo ou zerado, favor repor estoque, saldo: " + mp.getSaldo());
            }else{
                JOptionPane.showMessageDialog(null, "Saldo abaixo do limite, favor report estoque, saldo: " + mp.getSaldo()+ ", Limite: " + this.limite);
            }
        }
    }
    
}
