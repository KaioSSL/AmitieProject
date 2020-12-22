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
public class Pessoa_Contato {
    private Integer cod;
    private Integer cod_pessoa;
    private Integer cod_contato;

    public Pessoa_Contato(){}
    
    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Integer getCod_pessoa() {
        return cod_pessoa;
    }

    public void setCod_pessoa(Integer cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
    }

    public Integer getCod_contato() {
        return cod_contato;
    }

    public void setCod_contato(Integer cod_contato) {
        this.cod_contato = cod_contato;
    }
    
}
