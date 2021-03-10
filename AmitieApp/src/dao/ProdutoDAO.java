/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connectionfactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import objetos.Produto;

/**
 *
 * @author kaiof
 */
public class ProdutoDAO{
    public static boolean insert(Produto prod) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement(
                    "INSERT INTO PRODUTO(DES,VLR_CUSTO,VLR_VENDA,DAT_CAD,VAL_DIAS,COD_UNIDADE,COD_CATEGORIA) VALUES(?,?,?,CURRENT_DATE,?,?,?)");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setString(1, prod.getDes());
            stmt.setFloat(2, prod.getVlr_custo());
            stmt.setFloat(3, prod.getVlr_venda());
            stmt.setInt(4, prod.getVal_dias());
            stmt.setInt(5, prod.getCod_unidade());
            stmt.setInt(6, prod.getCod_categoria());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de inserção na classe Produto " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

    public static boolean delete(Produto prod) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("DELETE FROM PRODUTO WHERE COD = ?");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setInt(1, prod.getCod());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de deleção na classe Produto " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

    public static boolean update(Produto prod) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement(
                    "UPDATE PRODUTO SET DES = ?, VLR_CUSTO = ?, VLR_VENDA = ?, VAL_DIAS = ?, COD_UNIDADE = ?, COD_CATEGORIA = ? WHERE COD = ?");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setString(1, prod.getDes());
            stmt.setFloat(2, prod.getVlr_custo());
            stmt.setFloat(3, prod.getVlr_venda());
            stmt.setInt(4, prod.getVal_dias());
            stmt.setInt(5, prod.getCod_unidade());
            stmt.setInt(6, prod.getCod_categoria());
            stmt.setInt(7, prod.getCod());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de update na classe Produto " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }
    
    public static Integer getLast(){
        //Crio Conexão com o servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statemenet para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer last_cod;
        try{
            //Escrevo minha query
            stmt = con.prepareCall("SELECT MAX(COD) AS LAST_COD FROM PRODUTO");
            rs = stmt.executeQuery();
            if(rs.next()){
                last_cod = rs.getInt("LAST_COD");
                return last_cod;
            }   
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro no getLast cod Produto " + e.getMessage());
            
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return 0;
    }
}
