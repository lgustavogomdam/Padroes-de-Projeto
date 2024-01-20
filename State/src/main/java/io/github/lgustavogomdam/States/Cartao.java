
package io.github.lgustavogomdam.States;

import io.github.lgustavogomdam.Classe.Pagamento;
import io.github.lgustavogomdam.InterfaceState.PagamentoState;
import java.text.DecimalFormat;


public class Cartao implements PagamentoState{

    @Override
    public double calcularValorFinal(double valor, Pagamento pag, int parcelas) {
        for(int i=0;i<parcelas;i++){
            pag.setJuros(pag.getJuros() + 1.85);  
        }
        return valor += (valor * pag.getJuros()) / 100;
    }
    @Override
    public void mostrarValorFinal(double valor, double juros, int parcelas) {
        DecimalFormat df = new DecimalFormat("#,###0.00");
        System.out.println("O valor final com base nos juros de: "
        + df.format(juros) + "\n" + "Aplicados à quantidade de parcelas: "
        + parcelas + "\n" + "Resulta em: R$" + df.format(valor));
    }
    
}
