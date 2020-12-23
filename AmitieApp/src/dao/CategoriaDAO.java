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
import objetos.Categoria;
/**
 *
 * @author kaiof
 */
public class CategoriaDAO extends Categoria {
    public static boolean insert(Categoria cat){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("INSERT INTO CATEGORIA(DES,DAT_CAD,SIGLA,TAGS) VALUES(?,CURRENT_DATE,?,?)");
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setString(1, cat.getDes());
            stmt.setString(2, cat.getSigla());
            stmt.setString(3, cat.getTags());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de inserção na classe Categoria " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }
    public static boolean delete(Categoria cat){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("DELETE FROM CATEGORIA WHERE COD = ?");
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setInt(1,cat.getCod());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();          
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de deleção na classe Categoria " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }
    public static boolean update(Categoria cat){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("UPDATE CATEGORIA SET DES = ?, SIGLA = ?, TAGS = ? WHERE COD = ?");
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setString(1, cat.getDes());
            stmt.setString(2,cat.getSigla());
            stmt.setString(3,cat.getTags());
            stmt.setInt(4,cat.getCod());            
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();            
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de update na Classe Categoria " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }
}
