/**
 * Primera clase que es ejecutada
 */
public class Principal {
    /**
     * Primer método que se ejecuta en la aplicación
     * @param args
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public static void main(String[] args) {
        Emociones tristeza = new Emociones("Tristeza", "☹️");
        Emociones felicidad = new Emociones("Felicidad", "😃");
        Emociones risa = new Emociones("Risa", "\uD83E\uDD23");
        Emociones aburrido = new Emociones("Aburrido", "\uD83D\uDE12");
        Emociones divertido = new Emociones("Divertido", "\uD83E\uDD2A");
        Emociones silencio = new Emociones("Silencio", "\uD83E\uDD2B");
        Emociones mentiroso = new Emociones("Mentiroso", "\uD83E\uDD25");
        Emociones enamorado = new Emociones("Enamorado", "\uD83E\uDD70");

        tristeza.visualizar();
        felicidad.visualizar();
        risa.visualizar();
        aburrido.visualizar();
        divertido.visualizar();
        silencio.visualizar();
        mentiroso.visualizar();
        enamorado.visualizar();
    }
}
