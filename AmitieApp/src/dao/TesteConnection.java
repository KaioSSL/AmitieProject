/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author kaiof
 */
public class TesteConnection {
    public static void main(String[] args){
        ConnectionFactory con = new ConnectionFactory();
        ConnectionFactory.getConnection();
    }
    
}
