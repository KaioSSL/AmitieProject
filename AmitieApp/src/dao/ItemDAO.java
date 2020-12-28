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
import objetos.Item;
import objetos.Item_Entrada;
import objetos.Item_Saida;

/**
 *
 * @author kaiof
 */
public class ItemDAO {
        public static boolean insert(Item item){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        
        try{
            if(item.getCod_tipo() == 1){                
                Item_Saida item_saida = (Item_Saida) item;
                //Escrevo minha query utilizando ? para posicionar os parametros                
                stmt = con.prepareStatement("INSERT INTO ITEM_SAIDA(TIPO,VLR_UNIT,QTD,VLR_TOTAL,UNIDADE_TOTAL,DAT_CAD,COD_ARMAZEM,COD_PEDIDO,COD_PRODUTO) VALUES(?,?,?,?,?,CURRENT_DATE,?,?,?)");
                //Insiro os parametros em cada posição e com seu tipo 
                stmt.setInt(1, item_saida.getCod_tipo());
                stmt.setFloat(2, item_saida.getVlr_unit());
                stmt.setFloat(3,item_saida.getQtd());
                stmt.setFloat(4, item_saida.getVlr_total());
                stmt.setFloat(5, item_saida.getUnidade_total());
                stmt.setInt(6, item_saida.getCod_armazem());
                stmt.setInt(7, item_saida.getCod_pedido());
                stmt.setInt(8, item_saida.getCod_produto());
            }else{
                Item_Entrada item_entrada = (Item_Entrada) item;
                //Escrevo minha query utilizando ? para posicionar os parametros
                stmt = con.prepareStatement("INSERT INTO ITEM_ENTRADA(TIPO,VLR_UNIT,VLR_TOTAL,UNIDADE_TOTAL,DAT_CAD,COD_ARMAZEM,COD_PEDIDO,COD_MATERIA_PRIMA) VALUES(?,?,?,?,?,CURRENT_DATE,?,?,?)");
                //Insiro os parametros em cada posição e com seu tipo 
                stmt.setInt(1, item_entrada.getCod_tipo());
                stmt.setFloat(2, item_entrada.getVlr_unit());
                stmt.setFloat(3,item_entrada.getQtd());
                stmt.setFloat(4, item_entrada.getVlr_total());
                stmt.setFloat(5, item_entrada.getUnidade_total());
                stmt.setInt(6, item_entrada.getCod_armazem());
                stmt.setInt(7, item_entrada.getCod_pedido());
                stmt.setInt(8, item_entrada.getCod_materia_prima());
            }
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de inserção na classe Item " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }
    public static boolean delete(Item item){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            //Escrevo minha query utilizando ? para posicionar os parametros
            if(item.getCod_tipo()==1){
                //Insiro os parametros em cada posição e com seu tipo 
                stmt = con.prepareStatement("DELETE FROM ITEM_SAIDA WHERE COD = ?");
                stmt.setInt(1, item.getCod());
            }else{
                //Insiro os parametros em cada posição e com seu tipo 
                stmt = con.prepareStatement("DELETE FROM ITEM_ENTRADA WHERE COD = ?");
                stmt.setInt(1, item.getCod());
            }
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();          
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de deleção na classe Item " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }
    public static boolean update(Item item){
        //Crio Conexão com o Servidor do Banco
        Connection con = ConnectionFactory.getConnection();
        //Crio meu Statement para tratar a query á ser utilizada
        PreparedStatement stmt = null;
        try{
            if(item.getTipo()==1){
                Item_Saida item_saida = (Item_Saida) item;
                //Escrevo minha query utilizando ? para posicionar os parametros
                stmt = con.prepareStatement("UPDATE ITEM_SAIDA SET TIPO = ?, VLR_UNIT = ?, QTD = ?, VLR_TOTAL = ?, UNIDADE_TOTAL = ?, COD_ARMAZEM = ?, COD_PEDIDO = ?, COD_PRODUTO = ? WHERE COD = ?");
                //Insiro os parametros em cada posição e com seu tipo 
                stmt.setInt(1, item_saida.getCod_tipo());
                stmt.setFloat(2, item_saida.getVlr_unit());
                stmt.setFloat(3,item_saida.getQtd());
                stmt.setFloat(4, item_saida.getVlr_total());
                stmt.setFloat(5, item_saida.getUnidade_total());
                stmt.setInt(6, item_saida.getCod_armazem());
                stmt.setInt(7, item_saida.getCod_pedido());
                stmt.setInt(8, item_saida.getCod_produto());      
                stmt.setInt(9, item_saida.getCod());
            }else{
                Item_Entrada item_entrada = (Item_Entrada) item;
                //Escrevo minha query utilizando ? para posicionar os parametros
                stmt = con.prepareStatement("UPDATE ITEM_ENTRADA SET TIPO = ?, VLR_UNIT = ?, QTD = ?, VLR_TOTAL = ?, UNIDADE_TOTAL = ?, COD_ARMAZEM = ?, COD_PEDIDO = ?, COD_MATERIA_PRIMA = ? WHERE COD = ?");
                //Insiro os parametros em cada posição e com seu tipo 
                stmt.setInt(1, item_entrada.getCod_tipo());
                stmt.setFloat(2, item_entrada.getVlr_unit());
                stmt.setFloat(3,item_entrada.getQtd());
                stmt.setFloat(4, item_entrada.getVlr_total());
                stmt.setFloat(5, item_entrada.getUnidade_total());
                stmt.setInt(6, item_entrada.getCod_armazem());
                stmt.setInt(7, item_entrada.getCod_pedido());
                stmt.setInt(8, item_entrada.getCod_materia_prima());      
                stmt.setInt(9, item_entrada.getCod());                
            }
            //executeUpdate é utilizado para operações que não retornam um result set, operações DML
            stmt.executeUpdate();            
        }catch(SQLException e){
            //Caso erro, mostro ao usuário.
            JOptionPane.showMessageDialog(null,"Erro de update na Classe Item " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        return true;
    }    
    
}
