/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template;

import java.util.Date;

/**
 *
 * @author renat
 */
public class Test {
    public static void main(String[] args) {
        Nota nota = new Nota();
        nota.setCod(1);
        nota.setCod_pedido(1);
        nota.setCod_usuario(1);
        nota.setDat_cad(new Date(System.currentTimeMillis()));
        nota.setDat_nota(new Date(System.currentTimeMillis()));
        nota.setSituacao(1);
        nota.setStatus(1);
        nota.setValor((float) 50);
        
        System.out.println("Pagamento Picpay");
        PagamentoPicPay picpay = new PagamentoPicPay(nota);
        
        System.out.println("Pagamento Pix");
        PagamentoPix pix = new PagamentoPix(nota);
        
        System.out.println("Pagamento Cartão de Crédito");
        PagamentoCartaoCredito cartaocredito = new PagamentoCartaoCredito(nota);
    }
    
}
