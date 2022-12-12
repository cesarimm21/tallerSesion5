package calculatorTest;

import activities.MainScreen;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.actions.Click;
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
public class CalculatorTest {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @BeforeEach
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @AfterEach
    public void after(){}

    @Test
    public void verifyCalculator(){
      theActorCalled("Eynar").attemptsTo(Click.on(MainScreen.eightButton));
      theActorInTheSpotlight().attemptsTo(Click.on(MainScreen.addButton));
      theActorInTheSpotlight().attemptsTo(Click.on(MainScreen.nineButton));
      theActorInTheSpotlight().attemptsTo(Click.on(MainScreen.equalButton));
      theActorInTheSpotlight().should(
              seeThat("verify the result is ", Text.of(MainScreen.resultLabel),equalTo("17"))
      );
    }

}
