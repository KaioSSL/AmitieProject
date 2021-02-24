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
public class Pagamento {
    private Integer cod;
    private String des;
    private Integer n_parcelas;
    private Float vlr_parcelas;
    private Integer cod_tipo_pagamento;
    private Integer cod_nota;

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

    public Integer getN_parcelas() {
        return n_parcelas;
    }

    public void setN_parcelas(Integer n_parcelas) {
        this.n_parcelas = n_parcelas;
    }

    public Float getVlr_parcelas() {
        return vlr_parcelas;
    }

    public void setVlr_parcelas(Float vlr_parcelas) {
        this.vlr_parcelas = vlr_parcelas;
    }

    public Integer getCod_tipo_pagamento() {
        return cod_tipo_pagamento;
    }

    public void setCod_tipo_pagamento(Integer cod_tipo_pagamento) {
        this.cod_tipo_pagamento = cod_tipo_pagamento;
    }

    public Integer getCod_nota() {
        return cod_nota;
    }

    public void setCod_nota(Integer cod_nota) {
        this.cod_nota = cod_nota;
    }
}
