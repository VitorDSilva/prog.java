package modelo.espacos;

import modelo.enums.NomeDeEspaco;

/**
 *  Espaço que fará o jogador pagar uma taxa de riqueza
 * 

 */
public class TaxaDeRiqueza extends Espaco {

    private final int valor = 200;

    public TaxaDeRiqueza(NomeDeEspaco nome) {
        super(nome);
    }

    public int getValor() {
        return valor;
    }

}
