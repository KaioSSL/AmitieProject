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
public class MateriaPrima {
    private Integer cod;
    private String des;
    private Float vlr_custo;
    private Float vlr_venda;
    private Integer cod_unidade;
    private String fabricante;
    private String marca;
    private Date dat_cad;

    public MateriaPrima() {
    }

    public Date getDat_cad() {
        return dat_cad;
    }

    public void setDat_cad(Date dat_cad) {
        this.dat_cad = dat_cad;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Float getVlr_custo() {
        return vlr_custo;
    }

    public void setVlr_custo(Float vlr_custo) {
        this.vlr_custo = vlr_custo;
    }

    public Float getVlr_venda() {
        return vlr_venda;
    }

    public void setVlr_venda(Float vlr_venda) {
        this.vlr_venda = vlr_venda;
    }

    public Integer getCod_unidade() {
        return cod_unidade;
    }

    public void setCod_unidade(Integer cod_unidade) {
        this.cod_unidade = cod_unidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
