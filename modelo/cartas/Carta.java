package modelo.cartas;

import modelo.enums.DescricaoDeCarta;

/**

 */
public abstract class Carta {

    private final DescricaoDeCarta descricao;

    public Carta(DescricaoDeCarta descricao) {
        this.descricao = descricao;
    }

    public DescricaoDeCarta getDescricao() {
		return descricao;
	}

    /**
     * 	@return Descrição da carta
     */
	@Override
    public String toString() {
        return descricao.toString();
    }

}
