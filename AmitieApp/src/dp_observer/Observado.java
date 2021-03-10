/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_observer;

import java.util.ArrayList;

/**
 *
 * @author kaiof
 */
public abstract class Observado {
    private final ArrayList<Observer> monitores = new ArrayList();
    
    public void addObservador(Observer obs){
        this.monitores.add(obs);
    }
    public void removeObservador(Observer obs){
        this.monitores.remove(obs);
    }
    public void notifica(){
        for(Observer obs : this.monitores){
            obs.analisa(this);
        }
    }
    
}
