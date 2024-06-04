package modelo.entidades;

import java.util.Random;

/**

 */
public class Dado {

    private final int qtLados = 6;
    private final Random gerador;

    public Dado() {
        this.gerador = new Random();
    }

    /**
     *  @return Resultado do lançamento
     */
    public int lancar() {
        return gerador.nextInt(this.qtLados) + 1;
    }

}
