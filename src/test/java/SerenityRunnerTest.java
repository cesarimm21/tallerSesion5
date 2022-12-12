import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"},
        glue = "step",
        features = "src/test/resources"
)
public class SerenityRunnerTest {
}
