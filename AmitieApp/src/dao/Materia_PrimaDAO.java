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
import objetos.Materia_Prima;

/**
 *
 * @author kaiof
 */
public class Materia_PrimaDAO extends Materia_Prima {
    public static boolean insert(Materia_Prima mat) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement(
                    "INSERT INTO MATERIA_PRIMA(DES,VLR_CUSTO,VLR_VENDA,FABRICANTE,MARCA,COD_UNIDADE,DAT_CAD) VALUES(?,?,?,?,?,?,CURRENT_DATE)");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setString(1, mat.getDes());
            stmt.setFloat(2, mat.getVlr_custo());
            stmt.setFloat(3, mat.getVlr_venda());
            stmt.setString(4, mat.getFabricante());
            stmt.setString(5, mat.getMarca());
            stmt.setInt(6, mat.getCod_unidade());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de inserção na classe Materia Prima " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

    public static boolean delete(Materia_Prima mat) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("DELETE FROM MATERIA_PRIMA WHERE COD = ?");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setInt(1, mat.getCod());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de deleção na classe Materia Prima " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

    public static boolean update(Materia_Prima mat) {
        // Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        // Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try {
            // Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement(
                    "UPDATE PRODUTO SET DES = ?, VLR_CUSTO = ?, VLR_VENDA = ?, FABRICANTE = ?, MARCA = ?, COD_UNIDADE = ? WHERE COD = ?");
            // Insiro os parametros em cada posição e com seu tipo
            stmt.setString(1, mat.getDes());
            stmt.setFloat(2, mat.getVlr_custo());
            stmt.setFloat(3, mat.getVlr_venda());
            stmt.setString(4, mat.getFabricante());
            stmt.setString(5, mat.getMarca());
            stmt.setInt(6, mat.getCod_unidade());
            stmt.setInt(7, mat.getCod());
            // executeUpdate é utilizado para operações que não retornam um result set,
            // operações DML
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de update na classe Materia Prima " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return true;
    }

}
