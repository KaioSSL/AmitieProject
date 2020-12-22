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
public class Armazem {
    private Integer cod;
    private String nome;
    private Integer cod_endereco;
    private Integer cod_contato;
    private Date dat_cad;
    private String des;
    
    public Armazem(){}

    public Integer getCod_contato() {
        return cod_contato;
    }

    public void setCod_contato(Integer cod_contato) {
        this.cod_contato = cod_contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Integer getCod_endereco() {
        return cod_endereco;
    }

    public void setCod_endereco(Integer cod_endereco) {
        this.cod_endereco = cod_endereco;
    }

    public Date getDat_cad() {
        return dat_cad;
    }

    public void setDat_cad(Date dat_cad) {
        this.dat_cad = dat_cad;
    }
    
    
    
}
