package ar.edu.info.unlp.ejer12P2;

public class FileSystem {
  private Directorio raiz;

  /**
   * Retorna el espacio total ocupado, incluyendo todo su contenido.
   */
  public int tamanoTotalOcupado() {
    return this.raiz.tamanoTotalOcupado();

  }

  /**
   * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
   * filesystem
   */
  public Archivo archivoMasGrande() {
  }

  /**
   * Retorna el archivo con fecha de creación más reciente en cualquier nivel
   * del filesystem
   */
  public Archivo archivoMasNuevo() {
  }

  /**
   * Retorna el primer elemento con el nombre solicitado contenido en cualquier
   * nivel del filesystem
   */
  public ??

    buscar(String nombre){}

  /**
   * Retorna la lista con los elementos que coinciden con el nombre solicitado
   * contenido en cualquier nivel del filesystem
   */
  public List<??>

    buscarTodos(String nombre)
{}

  /**
   * Retorna un String con los nombres de los elementos contenidos en todos los
   * niveles del filesystem. De cada elemento debe retornar el path completo
   * (similar al comando pwd de linux) siguiendo el modelo presentado a
   * continuación
   * /Directorio A
   * /Directorio A/Directorio A.1
   * /Directorio A/Directorio A.1/Directorio A.1.1
   * /Directorio A/Directorio A.1/Directorio A.1.2
   * /Directorio A/Directorio A.2
   * /Directorio B
   */
  public String listadoDeContenido() {
  }
}
