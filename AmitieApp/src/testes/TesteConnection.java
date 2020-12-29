/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import dao.CategoriaDAO;
import dao.ConnectionFactory;
import objetos.Categoria;

/**
 *
 * @author kaiof
 */
public class TesteConnection {
    public static void main(String[] args){
        ConnectionFactory con = new ConnectionFactory();
        ConnectionFactory.getConnection();
        Categoria categoria = new Categoria();
        
        categoria.setDes("SENTA");
        categoria.setSigla("TST");
        categoria.setTags("#TESTE;#TESTE2;#TESTE3");
        categoria.setCod(2);
        try{
            if(CategoriaDAO.update(categoria)){
                System.out.println("Sucesso");
            };
        }catch(Exception e){
            System.out.println("ERRO");
        
        }
    }
    
}
