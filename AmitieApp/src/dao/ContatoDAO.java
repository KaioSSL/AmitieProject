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
import objetos.Contato;

/**
 *
 * @author kaiof
 */
public class ContatoDAO {
    public static boolean insert(Contato ct){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("INSERT INTO CONTATO(CONTATO,DES,DAT_CAD,COD_TIPO_CONTATO) VALUES(?,?,CURRENT_DATE,?)");            
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setString(1, ct.getContato());
            stmt.setString(2, ct.getDes());
            stmt.setInt(3, ct.getCod_tipo_contato());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de inserção na classe Contato " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    } 
    public static boolean delete(Contato ct){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("DELETE FROM CONTATO WHERE COD = ?");
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setInt(1,ct.getCod());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();          
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de deleção na classe Contato " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }
    public static boolean update(Contato ct){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("UPDATE CONTATO SET CONTATO = ?, DES = ?, COD_TIPO_CONTATO = ? WHERE COD = ?");
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setString(1, ct.getContato());
            stmt.setString(2, ct.getDes());
            stmt.setInt(3, ct.getCod_tipo_contato());
            stmt.setInt(4, ct.getCod());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();            
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de update na classe Contato " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }    
    
}
