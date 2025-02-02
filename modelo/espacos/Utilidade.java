package modelo.espacos;

import modelo.enums.NomeDeEspaco;

/**
 *  Representa a Companhia Elétrica e a Companhia de Distribuição de Agua
 *
 
 */
public class Utilidade extends Propriedade {

    public Utilidade(NomeDeEspaco nome, int preco) {
        super(nome, preco);
    }

    /**
     *  @param valor - valor tirado nos dados
     */
    @Override
    public int calcularAluguel(Integer valor) {
    	if( this.getDono().getUtilidades().size() == 1 )
            return valor * 4;
        else
            return valor * 10;
    }
    
}
