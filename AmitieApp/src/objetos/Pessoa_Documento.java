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
public class Pessoa_Documento {
    private Integer cod;
    private Integer cod_documento;
    private Integer cod_pessoa;
    
    public Pessoa_Documento(){}

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Integer getCod_documento() {
        return cod_documento;
    }

    public void setCod_documento(Integer cod_documento) {
        this.cod_documento = cod_documento;
    }

    public Integer getCod_pessoa() {
        return cod_pessoa;
    }

    public void setCod_pessoa(Integer cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
    }
}
