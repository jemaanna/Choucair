package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Personal {
    public static final Target FIRST_NAME = Target.the("first name").
            locatedBy("//input[@id=\"firstName\"]");
    public static final Target LAST_NAME = Target.the("last name").
            locatedBy("//input[@id=\"lastName\"]");
    public static final Target EMAIL = Target.the("email").
            locatedBy("//input[@id=\"email\"]");
    public static final Target MONTH = Target.the("month").
            locatedBy("//select[@id=\"birthMonth\"]");
    public static final Target DAY = Target.the("day").
            locatedBy("//select[@id=\"birthDay\"]");
    public static final Target YEAR = Target.the("year").
            locatedBy("//select[@id=\"birthYear\"]");
    public static final Target NEXTLOCATION = Target.the("next button").
            locatedBy("//a[@class=\"btn btn-blue\"]");
}