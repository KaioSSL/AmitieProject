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
public class PagamentoPix extends TemplatePagamento{
    public PagamentoPix(Nota nota){
        super(nota);
    }

    @Override
    public void registraPagamento() {
        System.out.println("Registrando pagamento.");
    }

    @Override
    public void geraPagamento() {
        System.out.println("Gerando pagamento.");
    }

    @Override
    public boolean confirmaPagamento() {
        System.out.println("Pagamento confirmado!");
        return true;
    }

    @Override
    public void registraAprovacaoPagamento() {
        System.out.println("Registrando pagamento aprovado.");
    }
}
