/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPedido;

/**
 *
 * @author kaiof e renato
 */
public class Pessoa {
    private Integer cod;
    private String nome;
    private final boolean ativo = true;

    public Pessoa() {
    }

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

    public boolean getAtivo() {
        return this.ativo;
    }
}
