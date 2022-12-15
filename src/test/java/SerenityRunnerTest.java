import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "classpath:features"
        ,tags = "@Calculator"
)
public class SerenityRunnerTest {

}
