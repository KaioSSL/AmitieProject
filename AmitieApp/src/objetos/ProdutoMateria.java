/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author kaiof
 */
public class ProdutoMateria {
    private Integer cod;
    private Integer cod_materia_prima;
    private Integer cod_produto;
    private Float vlr_unit_custo;
    private Float vlr_unit_venda;
    private Float unidade_total;
    private Float vlr_total_custo;
    private Float vlr_total_venda;

    public ProdutoMateria() {
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Integer getCod_materia_prima() {
        return cod_materia_prima;
    }

    public void setCod_materia_prima(Integer cod_materia_prima) {
        this.cod_materia_prima = cod_materia_prima;
    }

    public Integer getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(Integer cod_produto) {
        this.cod_produto = cod_produto;
    }

    public Float getVlr_unit_custo() {
        return vlr_unit_custo;
    }

    public void setVlr_unit_custo(Float vlr_unit_custo) {
        this.vlr_unit_custo = vlr_unit_custo;
    }

    public Float getVlr_unit_venda() {
        return vlr_unit_venda;
    }

    public void setVlr_unit_venda(Float vlr_unit_venda) {
        this.vlr_unit_venda = vlr_unit_venda;
    }

    public Float getUnidade_total() {
        return unidade_total;
    }

    public void setUnidade_total(Float unidade_total) {
        this.unidade_total = unidade_total;
    }

    public Float getVlr_total_custo() {
        return vlr_total_custo;
    }

    public void setVlr_total_custo(Float vlr_total_custo) {
        this.vlr_total_custo = vlr_total_custo;
    }

    public Float getVlr_total_venda() {
        return vlr_total_venda;
    }

    public void setVlr_total_venda(Float vlr_total_venda) {
        this.vlr_total_venda = vlr_total_venda;
    }

}
