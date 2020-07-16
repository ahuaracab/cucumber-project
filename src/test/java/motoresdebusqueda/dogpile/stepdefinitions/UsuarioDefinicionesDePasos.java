package motoresdebusqueda.dogpile.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import motoresdebusqueda.dogpile.steps.UsuarioDogPile;
import net.thucydides.core.annotations.Steps;

public class UsuarioDefinicionesDePasos {

    @Steps(shared = true)
    UsuarioDogPile usuario;

    @Dado("^Que (.*) entra a dogpile$")
    public void ingresa_a_dogpile(String nombreDeUsuario) {
        usuario.isCalled(nombreDeUsuario);
        usuario.ingresaADogpile();

    }

    @Cuando("^(.*) realiza una busqueda de: (.*)$")
    public void busca_por_palabra_clave(String nombreDeUsuario, String palabraClave) {
        usuario.isCalled(nombreDeUsuario);
        usuario.buscaPorPalabraClave(palabraClave);
    }

    @Entonces("^(.*) deberia poder ver resultados que contengan la palabra: (.*)$")
    public void deberia_ver_publicaciones_con_palabra(String nombreDeUsuario, String palabraEsperada) {
        usuario.isCalled(nombreDeUsuario);
        usuario.deberiaVerPublicacionesConPalabra(palabraEsperada);
    }

    @Entonces("^(.*) deberia ver un texto: (.*) relevante con el titulo: (.*)$")
    public void deberia_ver_resultado_de_titulo_con_texto_correcto(String nombreDeUsuario, String textoDeResultadoEsperado, String tituloDeResultado) {
        usuario.isCalled(nombreDeUsuario);
        usuario.deberiaVerResultadoDeTituloConTextoCorrecto(textoDeResultadoEsperado, tituloDeResultado);
    }
}
