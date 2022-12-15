package whendoTest;

import activities.CreateTaskScreen;
import activities.ListScreen;
import activities.MainScreen;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhendoTest {
    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @BeforeEach
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @AfterEach
    public void after(){}

    @Test
    public void verifyWhenDo(){
        theActorCalled("Cesar").attemptsTo(Click.on(ListScreen.addTaskButton));
        theActorInTheSpotlight().attemptsTo(SendKeys.of("Taller Final").into(CreateTaskScreen.titleTextBox));
        theActorInTheSpotlight().attemptsTo(SendKeys.of("this is a note for taller final").into(CreateTaskScreen.noteTextBox));
        theActorInTheSpotlight().attemptsTo(Click.on(CreateTaskScreen.saveButton));
        theActorInTheSpotlight().should(
                seeThat("verify> the task name is ", Text.of(ListScreen.firstTaskLabel), equalTo("Taller Final"))
        );
        theActorInTheSpotlight().attemptsTo(Click.on(ListScreen.editTaskButton));
        theActorInTheSpotlight().attemptsTo(SendKeys.of("Taller Final Update").into(CreateTaskScreen.titleTextBox));
        theActorInTheSpotlight().attemptsTo(SendKeys.of("this is a note for taller final update").into(CreateTaskScreen.noteTextBox));
        theActorInTheSpotlight().attemptsTo(Click.on(CreateTaskScreen.saveButton));
        theActorInTheSpotlight().should(
                seeThat("verify> the task update name is ", Text.of(ListScreen.firstTaskLabel), equalTo("Taller Final Update"))
        );
    }
}
