package modelo.cartas;

import modelo.enums.DescricaoDeCarta;

public abstract class Carta {

	// Variável de instância para armazenar a descrição da carta
    private final DescricaoDeCarta descricao;

	// Construtor que inicializa a descrição da carta
    public Carta(DescricaoDeCarta descricao) {
        this.descricao = descricao;
    }

	// Retorna a descrição
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
