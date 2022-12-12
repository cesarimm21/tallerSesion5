package step;

import activities.CreateTaskScreen;
import activities.ListScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class MyStepWhenDo {
    @Given("{actor} have access to WhenDo app")
    public void joseHaveAccessToWhenDoApp(Actor actor) {
    }

    @When("{actor} creates a new task")
    public void heCreatesANewTask(Actor actor, Map<String, String> data) {
        actor.attemptsTo(Click.on(ListScreen.addTaskButton));
        actor.attemptsTo(SendKeys.of(data.get("title")).into(CreateTaskScreen.titleTextBox));
        actor.attemptsTo(SendKeys.of(data.get("note")).into(CreateTaskScreen.noteTextBox));
        actor.attemptsTo(Click.on(CreateTaskScreen.saveButton));
    }

    @Then("{actor} expected the task {string} should be created")
    public void heExpectedTheTaskShouldBeCreated(Actor actor, String expectedResult) {
        actor.should(
                seeThat("verify> the task name is ", Text.of(ListScreen.firstTaskLabel), equalTo(expectedResult))
        );
    }

    @And("{actor} edit the new task")
    public void heEditTheNewTask(Actor actor, Map<String, String> data) {
        actor.attemptsTo(Click.on(ListScreen.editTaskButton));
        actor.attemptsTo(SendKeys.of(data.get("title")).into(CreateTaskScreen.titleTextBox));
        actor.attemptsTo(SendKeys.of(data.get("note")).into(CreateTaskScreen.noteTextBox));
        actor.attemptsTo(Click.on(CreateTaskScreen.saveButton));
    }

    @Then("{actor} expected the task {string} should be edited")
    public void heExpectedTheTaskShouldBeEdited(Actor actor, String expectedResult) {
        actor.should(
                seeThat("verify> the task update name is ", Text.of(ListScreen.firstTaskLabel), equalTo(expectedResult))
        );
    }
}
