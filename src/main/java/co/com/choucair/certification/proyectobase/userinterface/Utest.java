package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Utest {
    public static final Target REGISTER = Target.the("register").
            locatedBy("//a[@href=\"/signup/personal\"]");

}
