/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template;

/**
 *
 * @author renat
 */
public abstract class TemplatePagamento {
    protected Nota nota;
    
    public TemplatePagamento(Nota nota){
        this.nota = nota;
        this.registraPagamento();
        this.geraPagamento();
        if(this.confirmaPagamento()){
            this.registraAprovacaoPagamento();
        }
    }
    public abstract void registraPagamento();
    public abstract void geraPagamento();
    public abstract boolean confirmaPagamento();
    public abstract void registraAprovacaoPagamento();
}
