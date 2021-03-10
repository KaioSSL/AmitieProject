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
import objetos.Pagamento;

/**
 *
 * @author kaiof
 */
public class PagamentoDAO extends Pagamento {
    public static boolean insert(Pagamento pgt) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement(
                    "INSERT INTO PAGAMENTO(DES, N_PARCELAS, VLR_PARCELAS, COD_TIPO_PAGAMENTO, COD_NOTA) VALUES(?,?,?,?,?)");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setString(1, pgt.getDes());
            stmt.setInt(2, pgt.getN_parcelas());
            stmt.setFloat(3, pgt.getVlr_parcelas());
            stmt.setInt(4, pgt.getCod_tipo_pagamento());
            stmt.setInt(5, pgt.getCod_nota());

            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de inserção na classe Pagamento " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

    public static boolean delete(Pagamento pgt) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("DELETE FROM PAGAMENTO WHERE COD = ?");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setInt(1, pgt.getCod());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de deleção na classe Pagamento " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

    public static boolean update(Pagamento pgt) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement(
                    "UPDATE PAGAMENTO SET DES = ?, N_PARCELAS = ? , VLR_PARCELAS = ?, COD_TIPO_PAGAMENTO = ?, COD_NOTA = ? WHERE COD = ?");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setString(1, pgt.getDes());
            stmt.setInt(2, pgt.getN_parcelas());
            stmt.setFloat(3, pgt.getVlr_parcelas());
            stmt.setInt(4, pgt.getCod_tipo_pagamento());
            stmt.setInt(5, pgt.getCod_nota());
            stmt.setInt(6, pgt.getCod());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de update na Classe Nota " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

}
