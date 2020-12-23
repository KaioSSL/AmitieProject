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
import objetos.Endereco;

/**
 *
 * @author kaiof
 */
public class EnderecoDAO {
    public static boolean insert(Endereco end){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("INSERT INTO ENDERECO(RUA,BAIRRO,LOGRADOURO,CIDADE,UF,CEP,COMPLEMENTO,DAT_CAD) VALUES(?,?,?,?,?,?,?,CURRENT_DATE) ");            
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setString(1, end.getRua());
            stmt.setString(2, end.getBairro());
            stmt.setString(3, end.getLogradouro());
            stmt.setString(4, end.getCidade());
            stmt.setString(5, end.getUF());
            stmt.setString(6, end.getCEP());
            stmt.setString(7, end.getComplemento());                        
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de inserção na classe Endereço " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    } 
    public static boolean delete(Endereco end){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("DELETE FROM ENDERECO WHERE COD = ?");
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setInt(1,end.getCod());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();          
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de deleção na classe Endereço " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }
    public static boolean update(Endereco end){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("UPDATE ENDERECO SET RUA = ?, BAIRRO = ?, LOGRADOURO = ?, CIDADE = ?, UF = ?, CEP = ?, COMPLEMENTO = ?  WHERE COD = ?");
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setString(1, end.getRua());
            stmt.setString(2, end.getBairro());
            stmt.setString(3, end.getLogradouro());
            stmt.setString(4, end.getCidade());
            stmt.setString(5, end.getUF());
            stmt.setString(6, end.getCEP());
            stmt.setString(7, end.getComplemento()); 
            stmt.setInt(8, end.getCod());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();            
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de update na classe Endereço " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }    
}
