package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.io.File;

public class AirbnbSearchStepsDefs {

    @Steps
    AirbnbSearchSteps airbnbSearchSteps;

    @Given("que me enuentro en el login de Airbnb")
    public void que_me_enuentro_en_el_login_de_airbnb() {
        airbnbSearchSteps.clickClose();
    }

    @When("busco {string}")
    public void busco(String place) {
        airbnbSearchSteps.searchByText(place);
    }

    @Then("muestra el texto {string}")
    public void muestra_el_texto(String text) {

        Assert.assertEquals(airbnbSearchSteps.getResultText(), text);
    }

    @Given("que ingreso a la app Airbnb y cierro cualquier ventana emergente")
    public void queIngresoALaAppAirbnbYCierroCualquierVentanaEmergente() {
        airbnbSearchSteps.clickClose();
    }


    @When("ingreso {string} en el formulario: Where To?")
    public void ingresoEnElFormularioWhereTo(String arg0) {

        airbnbSearchSteps.ingresoLugar(arg0);
    }


    @And("selecciono SKIP en el formulario :When's your trip?")
    public void seleccionoSKIPEnElFormularioWhenSYourTrip() {
        airbnbSearchSteps.botonSKIP();
    }


    @And("hago clic en el botón Search")
    public void hagoClicEnElBotónSearch() {
        airbnbSearchSteps.clickBuscar();
    }

    @Then("la pantalla muestra resultados mayores a {int}")
    public void laPantallaMuestraResultadosMayoresA(int arg0) {
        int itemsListSize = 0;
        //prueba: validar que al menos exista un item

        Assert.assertTrue(itemsListSize > arg0);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @And("se muestra el mensaje {string}")
    public void seMuestraElMensaje(String msg) {
        Assert.assertEquals(airbnbSearchSteps.getResultText(), msg);
    }



}
