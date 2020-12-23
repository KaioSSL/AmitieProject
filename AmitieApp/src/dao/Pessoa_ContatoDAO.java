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
import objetos.Pessoa_Contato;

/**
 *
 * @author kaiof
 */
public class Pessoa_ContatoDAO {
    public static boolean insert(Pessoa_Contato pesc){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("INSERT INTO PESSOA_CONTATO(COD_PESSOA,COD_CONTATO) VALUES(?,?)");            
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setInt(1, pesc.getCod_pessoa());
            stmt.setInt(2, pesc.getCod_contato());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de inserção na classe Pessoa Contato " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    } 
    public static boolean delete(Pessoa_Contato pesc){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("DELETE FROM PESSOA_CONTATO WHERE COD = ?");
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setInt(1,pesc.getCod());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();          
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de deleção na classe Pessoa Contato " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }
    public static boolean update(Pessoa_Contato pesc){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("UPDATE PESSOA_CONTATO SET COD_PESSOA = ?, COD_CONTATO = ? WHERE COD = ?");
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setInt(1, pesc.getCod_pessoa());
            stmt.setInt(2, pesc.getCod_contato());
            stmt.setInt(3, pesc.getCod());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();            
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de update na classe Pessoa Contato " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }    
}
