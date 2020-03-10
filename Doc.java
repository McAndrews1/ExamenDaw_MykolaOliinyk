
/**
 * Devuelve el contenido de la fila x del fichero de texto con la ruta absoluta file.
 * 
 * @author Mykola Oliinyk
 * @version 1.1
 */
public interface Doc
{

    // Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
    /**
     * Devuelve el contenido de la fila x del fichero de texto con la ruta absoluta file.
     *
     * @param   x       Es el numero entero (Tipo int) de la fila 
     *                  de la cual se requiere devolver el contenido.
     *                  
     * @param   file    La ruta absoluta del fichero, es de tipo String.
     * 
     * @return          Devuelve el contenido de la fila x del fichero de texto
     *                  
     */
    public abstract String obtenerLinea(int x, String file);

}
