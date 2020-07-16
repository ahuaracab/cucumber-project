package motoresdebusqueda.dogpile.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class DogPilePaginaPrincipal extends PageObject {

    @FindBy(css = "#q")
    WebElementFacade cajaDeBusqueda;

    @FindBy(css = ".search-form-home__button")
    WebElementFacade botonDeBusqueda;

    public void ingresarPalabra(String palabraClave) {
        cajaDeBusqueda.type(palabraClave);
    }

    public void realizarBusqueda() {
        botonDeBusqueda.click();
    }
}
