package modelo.cartas;

import modelo.enums.DescricaoDeCarta;

/**
 *  Carta que causará movimentação do jogador pelo espaço
 * 

 */
public abstract class CartaDeMovimento extends Carta {

	public CartaDeMovimento(DescricaoDeCarta descricao) {
        super(descricao);
    }

}
