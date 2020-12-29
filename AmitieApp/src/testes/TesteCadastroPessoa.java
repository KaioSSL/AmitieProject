/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import dao.PessoaDAO;
import objetos.Pessoa;

/**
 *
 * @author kaiof
 */
public class TesteCadastroPessoa {
    public static void main(String args[]){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alexandre Albuquerque");
        pessoa.setDat_nasc(new java.util.Date("28/12/2020"));
        PessoaDAO.insert(pessoa);
    }
    
}
