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
public class MateriaPrima extends Observado {
    private Integer cod;
    private Integer vlr_custo;
    private Integer vlr_venda;
    private String unidade;
    private Integer saldo;
    
    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Integer getVlr_custo() {
        return vlr_custo;
    }

    public void setVlr_custo(Integer vlr_custo) {
        this.vlr_custo = vlr_custo;
    }

    public Integer getVlr_venda() {
        return vlr_venda;
    }

    public void setVlr_venda(Integer vlr_venda) {
        this.vlr_venda = vlr_venda;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
    
    public void compra(Integer qtd){
        this.saldo += qtd;
    }
    public void venda(Integer qtd){
        if(this.saldo - qtd <0){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para essa operação");
        }else{
            this.saldo -=qtd;
            this.notifica();
        }
    }
}
