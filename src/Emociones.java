/**
 * Clase emociones
 */
public class Emociones {
    /**
     * Atributos
     */
    String emocion;
    String imagen;

    /**
     *  Constructor de la clase
     * @param emocion
     * @param imagen
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    Emociones(String emocion, String imagen) {
    this.emocion = emocion;
    this.imagen = imagen;
    }
    /**
     * Método de imprime la imagen correspondiente de cada emoción
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    void visualizar() {System.out.println("La cara de " + emocion + " se ve asi: " + imagen);
    }
}
