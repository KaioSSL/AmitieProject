/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Date;

/**
 *
 * @author kaiof
 */
public class Item {
    private Integer cod;
    private Integer cod_armazem;
    private Integer cod_pedido;
    private Integer tipo;
    private Float vlr_unit;
    private Float qtd;
    private Float vlr_total;
    private Float unidade_total;
    private Date dat_cad;

    public Item() {
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Float getQtd() {
        return qtd;
    }

    public void setQtd(Float qtd) {
        this.qtd = qtd;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Integer getCod_armazem() {
        return cod_armazem;
    }

    public void setCod_armazem(Integer cod_armazem) {
        this.cod_armazem = cod_armazem;
    }

    public Integer getCod_pedido() {
        return cod_pedido;
    }

    public void setCod_pedido(Integer cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    public Float getVlr_unit() {
        return vlr_unit;
    }

    public void setVlr_unit(Float vlr_unit) {
        this.vlr_unit = vlr_unit;
    }

    public Float getVlr_total() {
        return vlr_total;
    }

    public void setVlr_total(Float vlr_total) {
        this.vlr_total = vlr_total;
    }

    public Float getUnidade_total() {
        return unidade_total;
    }

    public void setUnidade_total(Float unidade_total) {
        this.unidade_total = unidade_total;
    }

    public Date getDat_cad() {
        return dat_cad;
    }

    public void setDat_cad(Date dat_cad) {
        this.dat_cad = dat_cad;
    }

    public Integer getCod_tipo() {
        return tipo;
    }

    public void setCod_tipo(Integer cod_tipo) {
        this.tipo = cod_tipo;
    }

}
