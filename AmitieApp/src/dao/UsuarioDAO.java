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
import objetos.Usuario;

/**
 *
 * @author kaiof
 */
public class UsuarioDAO extends Usuario {
    public static boolean insert(Usuario us) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con
                    .prepareStatement("INSERT INTO USUARIO(DES,ROLE,LOGIN,SENHA,DAT_CAD) VALUES(?,?,?,?,CURRENT_DATE)");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setString(1, us.getDes());
            stmt.setInt(2, us.getRole());
            stmt.setString(3, us.getLogin());
            stmt.setString(4, us.getSenha());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de inserção na classe Usuario " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

    public static boolean delete(Usuario us) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("DELETE FROM USUARIO WHERE COD = ?");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setInt(1, us.getCod());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de deleção na classe Usuario " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

    public static boolean update(Usuario us) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("UPDATE USUARIO SET DES = ?, ROLE = ?, LOGIN = ?, SENHA = ? WHERE COD = ?");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setString(1, us.getDes());
            stmt.setInt(2, us.getRole());
            stmt.setString(3, us.getLogin());
            stmt.setString(4, us.getSenha());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de update na classe Usuario " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }
}
