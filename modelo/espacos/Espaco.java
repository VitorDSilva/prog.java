package modelo.espacos;

import modelo.enums.NomeDeEspaco;

/**
 *  Espaço do tabuleiro

 */
public abstract class Espaco {

    private final NomeDeEspaco nome;

    public Espaco(NomeDeEspaco nome) {
        this.nome = nome;
    }

    public NomeDeEspaco getNome() {
		return nome;
	}

    /**
     * 	@return Nome do espaço
     */
	@Override
    public String toString() {
        return nome.toString();
    }

}
