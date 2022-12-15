package StepDefinitions;

import activities.MainScreen;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class StepCalculator {
    @Given("{actor} is an user in the calculator")
    public void eynarIsAnUserInTheCalculator(Actor actor) {
    }

    @When("{actor} wants to add {string} + {string}")
    public void heWantsToAdd(Actor actor,String number1, String number2) {
        actor.attemptsTo(Click.on(MainScreen.eightButton));
        actor.attemptsTo(Click.on(MainScreen.addButton));
        actor.attemptsTo(Click.on(MainScreen.nineButton));
        actor.attemptsTo(Click.on(MainScreen.equalButton));
    }

    @Then("{actor} expected the result should be {string}")
    public void heExpectedTheResultShouldBe(Actor actor,String expectedResult) {
        actor.should(
                seeThat("verify the result is ", Text.of(MainScreen.resultLabel),equalTo(expectedResult))
        );
    }

    @ParameterType(".*")
    public Actor actor(String actorName){
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }


}
