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
public class Contato {
    private Integer cod;
    private Integer cod_tipo_contato;
    private String contato;
    private Date dat_cad;
    private String des;
    
    public Contato(){}

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Integer getCod_tipo_contato() {
        return cod_tipo_contato;
    }

    public void setCod_tipo_contato(Integer cod_tipo_contato) {
        this.cod_tipo_contato = cod_tipo_contato;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Date getDat_cad() {
        return dat_cad;
    }

    public void setDat_cad(Date dat_cad) {
        this.dat_cad = dat_cad;
    }
    
}
