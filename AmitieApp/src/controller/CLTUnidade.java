/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UnidadeDAO;
import objetos.Unidade;

/**
 *
 * @author kaiof
 */
public class CLTUnidade {
    public boolean insert_Unidade(String des, String sigla){
        Unidade unidade = new Unidade();
        unidade.setDes(des);
        unidade.setSigla(sigla);
        return UnidadeDAO.insert(unidade);
    };
    public boolean delete_Object(Integer cod){
        Unidade unidade = new Unidade();
        unidade.setCod(cod);
        return UnidadeDAO.delete(unidade);
    };
    public boolean update_Object(Integer cod,String des, String sigla){
        Unidade unidade = new Unidade();
        unidade.setCod(cod);
        unidade.setDes(des);
        unidade.setSigla(sigla);
        return UnidadeDAO.update(unidade);
    };    
}