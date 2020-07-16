# language: es

@Cucumber
Característica: Busquedas en dogpile
  esta feature se trata de hacer una busqueda o multiples busquedas en dogpile y revisar los resultados obtenidos de esas busquedas.

  @Regresion
  Escenario: Buscar resultados relevantes
    Dado Que Marcelo entra a dogpile
    Cuando Marcelo realiza una busqueda de: rock nacional
    Entonces Marcelo deberia poder ver resultados que contengan la palabra: rock

  Esquema del escenario: Verificar que los resultados con texto relevante al titulo
    Dado Que Marcelo entra a dogpile
    Cuando Marcelo realiza una busqueda de: rock nacional
    Entonces Marcelo deberia ver un texto: <texto> relevante con el titulo: <titulo>

    Ejemplos:

      | descripcion         | titulo                           | texto                                                   |
      | resultado wikipedia | Argentine rock - Wikipedia       | Argentine rock                                          |
      | resultado espanol   | Nacional Rock – Radio Nacional   | NACIONAL ROCK. La hora líquida Aguante 93.7 Especiales  |
      | resultado sitio web | Rock Nacional                    | Rock Nacional -arg. Lo mejor de nuestro Rock en la web. |
      | resultado youtube   | rock nacional 80 90 00 - YouTube | Sign in to like videos                                  |