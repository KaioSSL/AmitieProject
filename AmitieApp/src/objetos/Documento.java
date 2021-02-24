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
public class Documento {
    private Integer cod;
    private String documento;
    private Date dat_cad;
    private Integer cod_tipo_doc;
    private String des;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getCod_tipo_doc() {
        return cod_tipo_doc;
    }

    public void setCod_tipo_doc(Integer cod_tipo_doc) {
        this.cod_tipo_doc = cod_tipo_doc;
    }

    public Documento() {
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getDat_cad() {
        return dat_cad;
    }

    public void setDat_cad(Date dat_cad) {
        this.dat_cad = dat_cad;
    }

}
