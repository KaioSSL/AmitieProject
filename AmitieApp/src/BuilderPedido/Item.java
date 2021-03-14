/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPedido;

/**
 *
 * @author kaiof e renato
 */
public class Item {
    private Integer cod;
    private Integer tipo;
    private Float vlr_unit;
    private int qtd;
    private Float vlr_total;

    public Item() {
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public void setVlr_unit(float valor) {
        this.vlr_unit = valor;
    }

    public Float getVlr_unit() {
        return vlr_unit;
    }

    public Float getVlr_total() {
        return vlr_total;
    }

    public Integer getCod_tipo() {
        return tipo;
    }

    public void setCod_tipo(Integer cod_tipo) {
        this.tipo = cod_tipo;
    }

    public boolean verificaEstoque() {
        return true;
    }

    public void calculaValorTotal() {
        float valorTotal = this.getVlr_unit() * this.getQtd();
        this.vlr_total = valorTotal;
    }
}
