/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPedido;

import java.util.Date;

/**
 *
 * @author kaiof
 */
public class Nota {
    private Integer cod;
    private Float valor;
    private Date dat_nota;
    private Integer cod_pedido;
    private String situacao;

    public Nota() {
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Date getDat_nota() {
        return dat_nota;
    }

    public void setDat_nota(Date dat_nota) {
        this.dat_nota = dat_nota;
    }

    public Integer getCod_pedido() {
        return cod_pedido;
    }

    public void setCod_pedido(Integer cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
