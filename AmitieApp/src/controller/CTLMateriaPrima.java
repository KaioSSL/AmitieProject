/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.MateriaPrimaDAO;
import objetos.MateriaPrima;

/**
 *
 * @author kaiof
 */
public class CTLMateriaPrima {
    public boolean insert_MateriaPrima(String des,Float vlr_custo, Float vlr_venda,Integer cod_unidade,String fabricante,String marca){
        MateriaPrima materiaPrima = new MateriaPrima();
        materiaPrima.setVlr_custo(vlr_custo);
        materiaPrima.setVlr_venda(vlr_venda);
        materiaPrima.setCod_unidade(cod_unidade);
        materiaPrima.setFabricante(fabricante);
        materiaPrima.setMarca(marca);
        return MateriaPrimaDAO.insert(materiaPrima);
    }
    public boolean delete_MateriaPrima(Integer cod){
        MateriaPrima materiaPrima = new MateriaPrima();
        materiaPrima.setCod(cod);
        return MateriaPrimaDAO.delete(materiaPrima);
    }
    public boolean update_MateriaPrima(Integer cod,String des,Float vlr_custo, Float vlr_venda,Integer cod_unidade,String fabricante,String marca){
        MateriaPrima materiaPrima = new MateriaPrima();
        materiaPrima.setCod(cod);
        materiaPrima.setVlr_custo(vlr_custo);
        materiaPrima.setVlr_venda(vlr_venda);
        materiaPrima.setCod_unidade(cod_unidade);
        materiaPrima.setFabricante(fabricante);
        materiaPrima.setMarca(marca);
        return MateriaPrimaDAO.update(materiaPrima);
    }
    
    public Integer getSaldo(Integer cod){
        MateriaPrima materiaPrima = new MateriaPrima();
        materiaPrima.setCod(cod);
        return MateriaPrimaDAO.getSaldo(materiaPrima);
    }
    public String getDescMateria(Integer cod){
        MateriaPrima materiaPrima = new MateriaPrima();
        materiaPrima.setCod(cod);
        return MateriaPrimaDAO.getMateria(materiaPrima).getDes();
    }
}
