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
public class Pessoa {
    private Integer cod;
    private String nome;
    private Date dat_cad;
    private Date dat_nasc;    
    
    public Pessoa(){}
    
    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDat_cad() {
        return dat_cad;
    }

    public void setDat_cad(Date dat_cad) {
        this.dat_cad = dat_cad;
    }

    public Date getDat_nasc() {
        return dat_nasc;
    }

    public void setDat_nasc(Date dat_nasc) {
        this.dat_nasc = dat_nasc;
    }
}
