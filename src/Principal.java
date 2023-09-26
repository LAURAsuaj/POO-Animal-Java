/**
 * Primera clase que es ejecutada
 */
public class Principal {
    /**
     * Primer método que se ejecuta en mi aplicación
     * @param args
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public static void main(String[] args) {
        Animal perro = new Animal("perro", "guau");
        Animal gato = new Animal("gato", "miau");
        Animal vaca = new Animal("vaca", "muuu");

        perro.hacerSonido();
        gato.hacerSonido();
        vaca.hacerSonido();
    }
}
