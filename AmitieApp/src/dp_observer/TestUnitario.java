/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_observer;

/**
 *
 * @author kaiof
 */
public class TestUnitario {
    public static void main(String[] args) {
        //Crio a Materia Prima
        MateriaPrima mp = new MateriaPrima();
        mp.setCod(1);
        mp.setSaldo(1000);
        mp.setUnidade("Kilo");
        mp.setVlr_custo(1500);
        mp.setVlr_venda(2000);
        
        //Crio o Observador
        MateriaPrimaObservador mpObs = new MateriaPrimaObservador();
        //Seta limite de notificação
        mpObs.setLimite(500);
        
        //Linka o observador
        mp.addObservador(mpObs);
        
        //Operações de compra e venda;
        mp.compra(200);
        mp.compra(100);
        mp.compra(500);
        
        mp.venda(500);
        mp.venda(1000);
    }
    
}
