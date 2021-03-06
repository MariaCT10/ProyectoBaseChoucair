package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Select the university Choucair")
            .located(By.xpath("//div[@id='universidad']//a"));

    public static final Target INPUT_COURSE = Target.the("Search the course")
            .located(By.xpath("//input[contains(@id,'coursesearchbox')]"));

    public static final Target BUTTON_GO = Target.the("Click to search course")
            .located(By.xpath("(//button[contains(@class,'btn btn-secondary')])"));

    public static final Target SELECT_COURSE = Target.the("Click to select course")
            .located(By.xpath("(//a[@href='https://operacion.choucairtesting.com/academy/course/view.php?id=489'])[1]"));

    public static final Target NAME_COURSE = Target.the("Extract name of course")
            .located(By.xpath("//div[@class='mr-auto'][contains(.,' Bancolombia')]"));

}
