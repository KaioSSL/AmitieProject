/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import objetos.Tipo_Documento;

/**
 *
 * @author kaiof
 */
public class Tipo_DocumentoDAO extends Tipo_Documento {
    public static boolean insert(Tipo_Documento td) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("INSERT INTO TIPO_DOCUMENTO(DES,SIGLA,DAT_CAD) VALUES(?,?,CURRENT_DATE)");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setString(1, td.getDes());
            stmt.setString(2, td.getSigla());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de inserção na classe Tipo Documento " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

    public static boolean delete(Tipo_Documento td) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("DELETE FROM TIPO_DOCUMENTO WHERE COD = ?");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setInt(1, td.getCod());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de deleção na classe Tipo Pagamento " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

    public static boolean update(Tipo_Documento td) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("UPDATE TIPO_DOCUMENTO SET DES = ?, SIGLA = ?  WHERE COD = ?");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setString(1, td.getDes());
            stmt.setString(2, td.getSigla());
            stmt.setInt(3, td.getCod());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de update na classe Tipo Documento " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

}
