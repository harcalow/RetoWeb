package com.orangehrmlive.opensourcedemo.stepdefinition.login;

import static com.co.orangehrmlive.opensourcedemo.questions.login.LoginHome.loginHome;


import com.co.orangehrmlive.opensourcedemo.exceptions.login.ValidationTextDoNotMatch;
import com.orangehrmlive.opensourcedemo.stepdefinition.setup.Setup;

import static com.co.orangehrmlive.opensourcedemo.questions.login.LoginMessage.loginMessage;
import static com.co.orangehrmlive.opensourcedemo.tasks.landingpage.OpenLandingPage.openLandingPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.co.orangehrmlive.opensourcedemo.tasks.loginform.FullLogin.fillPracticeForm;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginStepDefinition extends Setup {
    private static final String ACTOR_NAME = "Harold";
    private DataTable dataToValidate;
    @Given("El empleado ingresa a la página principal donde se le solicita usuario y contraseña")
    public void elEmpleadoIngresaALaPáginaPrincipalDondeSeLeSolicitaUsuarioYContraseña() {
           actorSetupTheBrowser(ACTOR_NAME);
          theActorInTheSpotlight().attemptsTo(
                    openLandingPage()
            );
    }

    @When("El empleado introduce en el campo usuario el usuario correcto y el campo password la contraseña correcta y dará clic en el botón login")
    public void elEmpleadoIntroduceEnElCampoUsuarioElUsuarioCorrectoYElCampoPasswordLaContraseñaCorrectaYDaráClicEnElBotónLogin() {
        theActorInTheSpotlight().attemptsTo(
                fillPracticeForm()
                        .usingUserName("Admin")
                        .usingPassword("admin123")
        );
    }


    @Then("El sistema le dará acceso y lo llevara al home de la página.")
    public void elSistemaLeDaráAccesoYLoLlevaraAlHomeDeLaPágina() {
        theActorInTheSpotlight().should(
                seeThat(loginHome()
                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class
                        )
        );
    }

    @When("El empleado introduce en el campo usuario un usuario valido y en el campo de password introduce una contraseña incorrecta y dará clic en el botón login")
    public void elEmpleadoIntroduceEnElCampoUsuarioUnUsuarioValidoYEnElCampoDePasswordIntroduceUnaContraseñaIncorrectaYDaráClicEnElBotónLogin() {
        theActorInTheSpotlight().attemptsTo(
                fillPracticeForm()
                        .usingUserName("Admin")
                        .usingPassword("admin0")
        );
    }

    @Then("El sistema mostrara un mensaje de error y no podra ingresar")
    public void elSistemaMostraraUnMensajeDeErrorYNoPodraIngresar() {
        theActorInTheSpotlight().should(
                seeThat(loginMessage()
                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class
                        )
        );

    }

    @When("El empleado introduce en el campo usuario un usuario no valido y en el campo de password introduce una contraseña valida y dará clic en el botón login")
    public void elEmpleadoIntroduceEnElCampoUsuarioUnUsuarioNoValidoYEnElCampoDePasswordIntroduceUnaContraseñaValidaYDaráClicEnElBotónLogin() {
        theActorInTheSpotlight().attemptsTo(
                fillPracticeForm()
                        .usingUserName("AdminNN")
                        .usingPassword("admin123")
        );
    }

    @When("El empleado no introduce ningun usuario y tampoco un password y esta da clic en el botón login")
    public void elEmpleadoNoIntroduceNingunUsuarioYTampocoUnPasswordYEstaDaClicEnElBotónLogin() {
        theActorInTheSpotlight().attemptsTo(
                fillPracticeForm()
                        .usingUserName("")
                        .usingPassword("")
        );
    }

}
