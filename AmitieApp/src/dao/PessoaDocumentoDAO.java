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
import objetos.PessoaDocumento;

/**
 *
 * @author kaiof
 */
public class PessoaDocumentoDAO extends PessoaDocumento {
    public static boolean insert(PessoaDocumento pesd) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("INSERT INTO PESSOA_DOCUMENTO(COD_PESSOA,COD_DOCUMENTO) VALUES(?,?)");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setInt(1, pesd.getCod_pessoa());
            stmt.setInt(2, pesd.getCod_documento());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de inserção na classe Pessoa Documento " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

    public static boolean delete(PessoaDocumento pesc) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("DELETE FROM PESSOA_DOCUMENTO WHERE COD = ?");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setInt(1, pesc.getCod());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de deleção na classe Pessoa Documento " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

    public static boolean update(PessoaDocumento pesc) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("UPDATE PESSOA_DOCUMENTO SET COD_PESSOA = ?, COD_DOCUMENTO = ? WHERE COD = ?");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setInt(1, pesc.getCod_pessoa());
            stmt.setInt(2, pesc.getCod_documento());
            stmt.setInt(3, pesc.getCod());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de update na classe Pessoa Documento " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }
}
