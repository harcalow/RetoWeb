package com.orangehrmlive.opensourcedemo.stepdefinition.admin.usermanagement.users;

import com.co.orangehrmlive.opensourcedemo.exceptions.login.ValidationTextDoNotMatch;
import com.orangehrmlive.opensourcedemo.stepdefinition.setup.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.co.orangehrmlive.opensourcedemo.questions.admin.usermanagement.users.UsersTable.tableValidation;
import static com.co.orangehrmlive.opensourcedemo.questions.login.LoginMessage.loginMessage;
import static com.co.orangehrmlive.opensourcedemo.tasks.admin.usermanagement.users.BrowseToUsers.browseToUsers;
import static com.co.orangehrmlive.opensourcedemo.tasks.admin.usermanagement.users.SearchByStatus.searchByStatus;
import static com.co.orangehrmlive.opensourcedemo.tasks.landingpage.OpenLandingPage.openLandingPage;
import static com.co.orangehrmlive.opensourcedemo.tasks.login.FillLogin.fillLogin;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class UsersStepDefinition extends Setup {
    private static final String ACTOR_NAME = "Harold";
    @Given("El empleado ingresa a la página principal donde se le solicita usuario y contraseña este los ingresa luego de esto ira a Admin luego a User management y users")
    public void elEmpleadoIngresaALaPaginaPrincipalDondeSeLeSolicitaUsuarioYContrasenaEsteLosIngresaLuegoDeEstoIraAAdminLuegoAUserManagementYUsers() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
        theActorInTheSpotlight().attemptsTo(
                fillLogin()
                        .usingUserName("Admin")
                        .usingPassword("admin123")
        );
        theActorInTheSpotlight().attemptsTo(
                browseToUsers()
        );
    }

    @When("El empleado seleccionara status y ecogera la opción deseada y finalizara dando clic en Search donde se hará la búsqueda")
    public void elEmpleadoSeleccionaraStatusYEcogeraLaOpcionDeseadaYFinalizaraDandoClicEnSearchDondeSeHaraLaBusqueda() {
        theActorInTheSpotlight().attemptsTo(
                searchByStatus()
                        .usingStatus("Disabled")
        );
    }
    @Then("Se buscaran los usuarios dependiendo su status")
    public void seBuscaranLosUsuariosDependiendoSuStatus() {
        theActorInTheSpotlight().should(
                seeThat(tableValidation()
                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class
                        )
        );
    }
}
