package modelo.espacos;

import modelo.enums.NomeDeEspaco;

/**

 */
public class PontoDePartida extends Espaco {

    private final int valor = 200;

    public PontoDePartida(NomeDeEspaco nome) {
        super(nome);
    }

    /**
     *  @return Valor que o jogador irá receber quando passar pelo espaço
     */
    public int getValor() {
        return valor;
    }
    
}
