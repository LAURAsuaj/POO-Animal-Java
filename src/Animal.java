/**
 * Clase Animal
 */
public class Animal {
    /**
     * Atributos:
     */
    String nombre;
    String sonido;

    /**
     * Constructor de la clase
     * @param nombre Nombre del animal
     * @param sonido Sonido que hace el animal
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    Animal(String nombre, String sonido) {
        this.nombre = nombre;
        this.sonido = sonido;
    }

    /**
     * Método de imprime el sonido que hace el animal
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    void hacerSonido() {
        System.out.println("El " + nombre + " hace " + sonido);
    }
}
