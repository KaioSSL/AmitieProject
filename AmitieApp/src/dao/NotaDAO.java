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
import objetos.Nota;

/**
 *
 * @author kaiof
 */
public class NotaDAO extends Nota {
        public static boolean insert(Nota nota){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("INSERT INTO NOTA(VALOR,DAT_CAD,DAT_NOTA,SITUACAO,STATUS,COD_PEDIDO,COD_USUARIO) VALUES(?,CURRENT_DATE,?,?,?,?,?)");
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setFloat(1, nota.getValor());
            stmt.setDate(2, new java.sql.Date(nota.getDat_nota().getTime()) );
            stmt.setInt(3, nota.getSituacao());
            stmt.setInt(4, nota.getStatus());
            stmt.setInt(5, nota.getCod_pedido());
            stmt.setInt(6, nota.getCod_usuario());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de inserção na classe Nota " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }
    public static boolean delete(Nota nota){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("DELETE FROM NOTA WHERE COD = ?");
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setInt(1,nota.getCod());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();          
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de deleção na classe Nota " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }
    public static boolean update(Nota nota){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("UPDATE NOTA SET VALOR = ?, DAT_NOTA = ?, SITUACAO = ?, STATUS = ?, COD_PEDIDO = ?, COD_USUARIO = ? WHERE COD = ?");
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setFloat(1, nota.getValor());
            stmt.setDate(2, new java.sql.Date(nota.getDat_nota().getTime()));
            stmt.setInt(3, nota.getSituacao());
            stmt.setInt(4, nota.getStatus());
            stmt.setInt(5, nota.getCod_pedido());
            stmt.setInt(6, nota.getCod_usuario());      
            stmt.setInt(7, nota.getCod());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();            
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de update na Classe Nota " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }  
}
