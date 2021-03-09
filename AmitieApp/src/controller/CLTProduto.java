/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProdutoDAO;
import java.util.ArrayList;
import objetos.MateriaPrima;
import objetos.Produto;

/**
 *
 * @author kaiof
 */
public class CLTProduto {
    public boolean insert_Produto(ArrayList<MateriaPrima> materias,String des, Float vlr_custo, Float vlr_venda,Integer val_dias,Integer cod_unidade,Integer cod_categoria){
        Produto produto = new Produto();
        produto.setDes(des);
        produto.setVlr_custo(vlr_custo);
        produto.setVlr_venda(vlr_venda);
        produto.setVal_dias(val_dias);
        produto.setCod_unidade(cod_unidade);
        produto.setCod_categoria(cod_categoria);
        for(MateriaPrima materiaPrima : materias){
            produto.addMateria(materiaPrima);
        }
        if(ProdutoDAO.insert(produto)){
            CLTProdutoMateria cltProdutoMateria = new CLTProdutoMateria();
            for(MateriaPrima materiaPrima : materias){
                cltProdutoMateria.insert_ProdutoMateria(ProdutoDAO.getLast(),materiaPrima.getCod());
            }
            return true;
        }else{
            return false;
        }
    };
    public boolean delete_Object(Integer cod){
        Produto produto = new Produto();
        produto.setCod(cod);
        CLTProdutoMateria cltProdutoMateria = new CLTProdutoMateria();
        if(cltProdutoMateria.delete_ProdutoMateria(null,cod,null)){
            return ProdutoDAO.delete(produto);
        }else{
            return false;
        }
    };
    public boolean update_Object(Integer cod, ArrayList<MateriaPrima> materias,String des, Float vlr_custo, Float vlr_venda,Integer val_dias,Integer cod_unidade,Integer cod_categoria){
        Produto produto = new Produto();
        produto.setCod(cod);
        produto.setDes(des);
        produto.setVlr_custo(vlr_custo);
        produto.setVlr_venda(vlr_venda);
        produto.setVal_dias(val_dias);
        produto.setCod_unidade(cod_unidade);
        produto.setCod_categoria(cod_categoria);
        for(MateriaPrima materiaPrima : materias){
            produto.addMateria(materiaPrima);
        }
        CLTProdutoMateria cltProdutoMateria = new CLTProdutoMateria();
        if(cltProdutoMateria.delete_ProdutoMateria(null, cod, null)){
            if(ProdutoDAO.update(produto)){
                for(MateriaPrima materiaPrima : materias){
                    cltProdutoMateria.insert_ProdutoMateria(cod,materiaPrima.getCod());
                }
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    };
        
        
 }

