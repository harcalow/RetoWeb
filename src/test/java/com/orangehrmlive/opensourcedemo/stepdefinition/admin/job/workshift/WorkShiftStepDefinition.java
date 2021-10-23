package com.orangehrmlive.opensourcedemo.stepdefinition.admin.job.workshift;

import com.co.orangehrmlive.opensourcedemo.exceptions.login.ValidationTextDoNotMatch;
import com.orangehrmlive.opensourcedemo.stepdefinition.setup.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.co.orangehrmlive.opensourcedemo.questions.admin.job.workshift.WorkshiftMessage.workshiftMessage;
import static com.co.orangehrmlive.opensourcedemo.questions.admin.usermanagement.users.UsersTable.tableValidation;
import static com.co.orangehrmlive.opensourcedemo.tasks.admin.job.workshift.BrowseToWorkShift.browseToWorkShift;
import static com.co.orangehrmlive.opensourcedemo.tasks.admin.job.workshift.CreateWorkShifts.createWorkShifts;
import static com.co.orangehrmlive.opensourcedemo.tasks.admin.job.workshift.DeleteWorkShifts.deleteWorkShifts;
import static com.co.orangehrmlive.opensourcedemo.tasks.admin.usermanagement.users.SearchByStatus.searchByStatus;
import static com.co.orangehrmlive.opensourcedemo.tasks.landingpage.OpenLandingPage.openLandingPage;
import static com.co.orangehrmlive.opensourcedemo.tasks.login.FillLogin.fillLogin;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class WorkShiftStepDefinition extends Setup {
    private static final String ACTOR_NAME = "Harold";
    @Given("El empleado ingresa a la página principal donde se le solicita usuario y contraseña este los ingresa luego de esto ira a admin luego job y work shift")
    public void elEmpleadoIngresaALaPaginaPrincipalDondeSeLeSolicitaUsuarioYContrasenaEsteLosIngresaLuegoDeEstoIraAAdminLuegoJobYWorkShift() {
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
                browseToWorkShift()
        );
    }

    @When("El empleado seleccionara add e ingresara nombre del turno en el campo correspondiente posteriormente a esto escogerá hora de inicio y final para finalizar escoge el o los empleados que se asignaran con la operación de selecciona el empleado y se le da en add luego de esto se confirma los datos con save.")
    public void elEmpleadoSeleccionaraAddEIngresaraNombreDelTurnoEnElCampoCorrespondientePosteriormenteAEstoEscogeraHoraDeInicioYFinalParaFinalizarEscogeElOLosEmpleadosQueSeAsignaranConLaOperacionDeSeleccionaElEmpleadoYSeLeDaEnAddLuegoDeEstoSeConfirmaLosDatosConSave() {
        theActorInTheSpotlight().attemptsTo(
                createWorkShifts()
                        .usingNameWorkShift("Turno1")
                        .usingHourFrom("01:15")
                        .usingHourTo("18:15")
        );

    }
    @Then("En la tabla work shifs aparecerá el turno creado.")
    public void enLaTablaWorkShifsApareceráElTurnoCreado() {

        theActorInTheSpotlight().should(
                seeThat(workshiftMessage()
                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class
                        )
        );

        theActorInTheSpotlight().attemptsTo(
                deleteWorkShifts()
        );


    }

}
