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
public class Pedido {
    private Integer cod;
    private Integer tipo;
    private Date dat_pedido;
    private Date dat_cad;
    private Integer status;
    private Integer situacao;
    private Integer cod_pessoa;
    private Integer cod_pessoa_documento;
    
    public Pedido(){}
    
    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Date getDat_pedido() {
        return dat_pedido;
    }

    public void setDat_pedido(Date dat_pedido) {
        this.dat_pedido = dat_pedido;
    }

    public Date getDat_cad() {
        return dat_cad;
    }

    public void setDat_cad(Date dat_cad) {
        this.dat_cad = dat_cad;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSituacao() {
        return situacao;
    }

    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }

    public Integer getCod_pessoa() {
        return cod_pessoa;
    }

    public void setCod_pessoa(Integer cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
    }

    public Integer getCod_pessoa_documento() {
        return cod_pessoa_documento;
    }

    public void setCod_pessoa_documento(Integer cod_pessoa_documento) {
        this.cod_pessoa_documento = cod_pessoa_documento;
    }
    
    
    
}
