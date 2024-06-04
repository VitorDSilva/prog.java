package modelo.enums;

/**

 */
public enum TipoDeCarta {

    COFRE("Cofre"),
    SORTE("Sorte");
	

    private final String tipo;

    private TipoDeCarta(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }

}
