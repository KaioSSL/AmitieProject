/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connectionfactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import objetos.ProdutoMateria;

/**
 *
 * @author kaiof
 */
public class ProdutoMateriaDAO{
    public static boolean insert(ProdutoMateria prod_m) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement(
                    "INSERT INTO PRODUTO_MATERIA(VLR_UNIT_CUSTO,VLR_UNIT_VENDA,QTD,UNIDADE_TOTAL,VLR_TOTAL_CUSTO,VLR_TOTAL_VENDA,COD_MATERIA_PRIMA,COD_PRODUTO) VALUES(?,?,?,?,?,?,?,?)");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setFloat(1, prod_m.getVlr_unit_custo());
            stmt.setFloat(2, prod_m.getVlr_unit_venda());
            stmt.setFloat(3, prod_m.getQtd());
            stmt.setFloat(4, prod_m.getUnidade_total());
            stmt.setFloat(5, prod_m.getVlr_total_custo());
            stmt.setFloat(6, prod_m.getVlr_total_venda());
            stmt.setInt(7, prod_m.getCod_materia_prima());
            stmt.setInt(8, prod_m.getCod_produto());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de inserção na classe Produto Materia " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

    public static boolean delete(ProdutoMateria prod_m) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("DELETE FROM PRODUTO_MATERIA WHERE (COD = ? OR ? IS NULL) AND (COD_MATERIA_PRIMA = ? OR ? IS NULL) AND  (COD_PRODUTO = ? OR ? IS NULL)");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setInt(1, prod_m.getCod());
            stmt.setInt(2, prod_m.getCod());
            stmt.setInt(3, prod_m.getCod_materia_prima());
            stmt.setInt(4, prod_m.getCod_materia_prima());
            stmt.setInt(5, prod_m.getCod_produto());
            stmt.setInt(6, prod_m.getCod_produto());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de deleção na classe Produto Materia " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

    public static boolean update(ProdutoMateria prod_m) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement(
                    "UPDATE PRODUTO_MATERIA SET VLR_UNIT_CUSTO = ?, VLR_UNIT_VENDA = ?, QTD = ?,  UNIDADE_TOTAL = ?,VLR_TOTAL_CUSTO = ?, VLR_TOTAL_VENDA = ?, COD_MATERIA_PRIMA = ?, COD_PRODUTO = ? WHERE COD = ?");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setFloat(1, prod_m.getVlr_unit_custo());
            stmt.setFloat(2, prod_m.getVlr_unit_venda());
            stmt.setFloat(3, prod_m.getQtd());
            stmt.setFloat(4, prod_m.getUnidade_total());
            stmt.setFloat(5, prod_m.getVlr_total_custo());
            stmt.setFloat(6, prod_m.getVlr_total_venda());
            stmt.setInt(7, prod_m.getCod_materia_prima());
            stmt.setInt(8, prod_m.getCod_produto());
            stmt.setInt(9, prod_m.getCod());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de update na Classe Produto Materia " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }
}
