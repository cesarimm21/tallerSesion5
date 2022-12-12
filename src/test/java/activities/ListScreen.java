package activities;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListScreen {
    public static Target addTaskButton= Target
            .the("[add task] button")
            .located(By.id("com.vrproductiveapps.whendo:id/fab"));

    public static Target firstTaskLabel = Target
            .the("[add task] button")
            .located(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
    public static Target editTaskButton= Target
            .the("[edit task] button")
            .located(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));

}


