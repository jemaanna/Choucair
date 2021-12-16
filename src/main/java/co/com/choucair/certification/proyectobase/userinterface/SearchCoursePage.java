package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("selecciona cursos y cetificaciones")
            .located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the("buscar cursos")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("dar click para buscar el curso")
            .located(By.xpath("//button[contains(@class, 'btn btn-secondary')]"));
    public static final Target SELECT_COURSE = Target.the("da click para buscar curso")
            .located(By.xpath("//div[contains(@class, 'result-title')]//h4[contains(text(),'Certified Data &amp; Analytics Tester (CDAT)']"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//h4[contains(text(),'Certified Data &amp; Analytics Tester (CDAT)')]"));
}
