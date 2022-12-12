package activities;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateTaskScreen {
    public static Target titleTextBox= Target
            .the("[title] textbox")
            .located(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public static Target noteTextBox= Target
            .the("[note] textbox")
            .located(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public static Target saveButton= Target
            .the("[save] button")
            .located(By.id("com.vrproductiveapps.whendo:id/saveItem"));



}
