package activities;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainScreen {
    public static Target eightButton = Target
            .the("[8] button")
            .located(By.id("com.android.calculator2:id/digit_8"));

    public static Target nineButton = Target
            .the("[9] button")
            .located(By.id("com.android.calculator2:id/digit_9"));
    public static Target addButton = Target
            .the("[+] button")
            .located(By.id("com.android.calculator2:id/op_add"));
    public static Target equalButton = Target
            .the("[=] button")
            .located(By.id("com.android.calculator2:id/eq"));

    public static Target resultLabel = Target
            .the("result label")
            .located(By.id("com.android.calculator2:id/result"));
}
