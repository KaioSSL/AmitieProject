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
import objetos.Pedido;

/**
 *
 * @author kaiof
 */
public class PedidoDAO extends Pedido {
    public static boolean insert(Pedido ped){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("INSERT INTO PEDIDO(TIPO,DAT_PEDIDO,DAT_CAD,STATUS,SITUACAO,COD_PESSOA,COD_PESSOA_DOCUMENTO) VALUES(?,?,CURRENT_DATE,?,?,?,?)");            
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setInt(1, ped.getTipo());
            stmt.setDate(2, (java.sql.Date) ped.getDat_pedido());
            stmt.setInt(3, ped.getStatus());
            stmt.setInt(4, ped.getSituacao());
            stmt.setInt(5, ped.getCod_pessoa());
            stmt.setInt(6, ped.getCod_pessoa_documento());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de inserção na classe Pedido" + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    } 
    public static boolean delete(Pedido ped){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("DELETE FROM PEDIDO WHERE COD = ?");
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setInt(1,ped.getCod());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();          
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de deleção na classe Pedido " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }
    public static boolean update(Pedido ped){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            stmt = con.prepareStatement("UPDATE PEDIDO SET TIPO = ?, DAT_PEDIDO = ?, STATUS = ?, SITUACAO = ?, COD_PESSOA = ?, COD_PESSOA_DOCUMENTO = ? WHERE COD = ?");
            //Insiro os parametros em cada posição e com seu tipo 
            stmt.setInt(1, ped.getTipo());
            stmt.setDate(2, (java.sql.Date) ped.getDat_pedido());
            stmt.setInt(3, ped.getStatus());
            stmt.setInt(4, ped.getSituacao());
            stmt.setInt(5, ped.getCod_pessoa());
            stmt.setInt(6, ped.getCod_pessoa_documento());
            stmt.setInt(7, ped.getCod());
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();            
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de update na classe Pedido " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }     
}
