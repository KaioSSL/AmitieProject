/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProdutoMateriaDAO;
import objetos.Produto;
import objetos.ProdutoMateria;

/**
 *
 * @author kaiof
 */
public class CLTProdutoMateria {
    public boolean insert_ProdutoMateria(Integer cod_produto, Integer cod_materia_prima){
        ProdutoMateria produtoMateria = new ProdutoMateria();
        produtoMateria.setCod_materia_prima(cod_materia_prima);
        produtoMateria.setCod_produto(cod_produto);
        return ProdutoMateriaDAO.insert(produtoMateria);
    }
    public boolean delete_ProdutoMateria(Integer cod, Integer cod_materia_prima, Integer cod_produto){
        ProdutoMateria produtoMateria = new ProdutoMateria();
        produtoMateria.setCod(cod);
        produtoMateria.setCod_materia_prima(cod_materia_prima);
        produtoMateria.setCod_produto(cod_produto);
        return ProdutoMateriaDAO.delete(produtoMateria);
    }
    public boolean update_ProdutoMateria(Integer cod, Integer cod_produto, Integer cod_materia_prima){
        ProdutoMateria produtoMateria = new ProdutoMateria();
        produtoMateria.setCod(cod);
        produtoMateria.setCod_materia_prima(cod_materia_prima);
        produtoMateria.setCod_produto(cod_produto);
        return ProdutoMateriaDAO.update(produtoMateria);
    }
    
}
