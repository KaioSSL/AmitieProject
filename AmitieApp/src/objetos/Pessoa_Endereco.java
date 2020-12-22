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
public class Pessoa_Endereco {
    private Integer cod;
    private Integer cod_endereco;
    private Integer cod_pessoa;
    
    public Pessoa_Endereco(){}
    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Integer getCod_endereco() {
        return cod_endereco;
    }

    public void setCod_endereco(Integer cod_endereco) {
        this.cod_endereco = cod_endereco;
    }

    public Integer getCod_pessoa() {
        return cod_pessoa;
    }

    public void setCod_pessoa(Integer cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
    }
    
}
