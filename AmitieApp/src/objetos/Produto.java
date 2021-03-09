/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author kaiof
 */
public class Produto {
    private Integer cod;
    private String des;
    private Float vlr_custo;
    private Float vlr_venda;
    private Date dat_cad;
    private Integer val_dias;
    private Integer cod_unidade;
    private Integer cod_categoria;
    private ArrayList<MateriaPrima> materias;

    public Produto(){
        this.materias = new ArrayList<>();
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

    public Date getDat_cad() {
        return dat_cad;
    }

    public void setDat_cad(Date dat_cad) {
        this.dat_cad = dat_cad;
    }

    public Integer getVal_dias() {
        return val_dias;
    }

    public void setVal_dias(Integer val_dias) {
        this.val_dias = val_dias;
    }

    public Integer getCod_unidade() {
        return cod_unidade;
    }

    public void setCod_unidade(Integer cod_unidade) {
        this.cod_unidade = cod_unidade;
    }

    public Integer getCod_categoria() {
        return cod_categoria;
    }

    public void setCod_categoria(Integer cod_categoria) {
        this.cod_categoria = cod_categoria;
    }

    public ArrayList<MateriaPrima> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<MateriaPrima> materias) {
        this.materias = materias;
    }
    public void addMateria(MateriaPrima materia){
        this.materias.add(materia);
    }
}
