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
import objetos.MateriaPrima;

/**
 *
 * @author kaiof
 */
public class MateriaPrimaDAO{
    public static boolean insert(MateriaPrima mat) {
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

    public static boolean delete(MateriaPrima mat) {
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

    public static boolean update(MateriaPrima mat) {
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
    
    public static Integer getSaldo(MateriaPrima mat){
        //Crio conexão com o servidor do banco
        Connection con = ConnectionFactory.getConnection();
        //Crio o meu Statemente
        PreparedStatement stmt = null;
        // Crio result set
        ResultSet rs = null;
        try{
            stmt = con.prepareStatement(""
                    + "SELECT SUM(PRODUTO_MATERIA.QTD) - SUM(ITEM_ENTRADA.QTD) AS SALDO"
                    + "FROM PRODUTO_MATERIA,"
                    + "ITEM_ENTRADA "
                    + "WHERE PRODUTO_MATERIA.COD_MATERIA  = ? "
                    + "AND ITEM_ENTRADA.COD_MATERIA = ?");
            stmt.setInt(1, mat.getCod());
            stmt.setInt(2, mat.getCod());
            rs = stmt.executeQuery();
            if(rs.next()){
                return rs.getInt("SALDO");
            }
            
        
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro de update na classe Materia Prima " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return 0;
    }
    
    public static MateriaPrima getMateria(MateriaPrima mat){
        //Crio conexão com o servidor do banco
        Connection con = ConnectionFactory.getConnection();
        //Crio o meu Statemente
        PreparedStatement stmt = null;
        // Crio result set
        ResultSet rs = null;        
        try{
            stmt = con.prepareStatement("SLEECT * FROM MATERIA_PRIMA WHERE COD = ?");
            stmt.setInt(1, mat.getCod());
            rs = stmt.executeQuery();
            if(rs.next()){
                mat.setDes(rs.getString("DES"));
                mat.setVlr_custo(rs.getFloat("VLR_CUSTO"));
                mat.setVlr_venda(rs.getFloat("VLR_VENDA"));
                mat.setFabricante(rs.getString("FABRICANTE"));
                mat.setMarca(rs.getString("MARCA"));
                mat.setCod_unidade(rs.getInt("COD_UNIDADE"));
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao consultar materia prima");
            }
            
        
        } catch (SQLException e) {
            // Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null, "Erro ao consultar Materia Prima " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return mat;
    }

}
