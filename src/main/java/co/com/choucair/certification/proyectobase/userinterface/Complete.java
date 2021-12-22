package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Complete {
    public static final Target PASSWORD = Target.the("password").
            locatedBy("//input[@id=\"password\"]");
    public static final Target CONFIRMPASSWORD = Target.the("confirmPassword").
            locatedBy("//input[@id=\"confirmPassword\"]");
    public static final Target CHECKON = Target.the("checkon").
            locatedBy("//span[@class=\"checkmark signup-consent__checkbox error\"]");
    public static final Target CHECK_ON = Target.the("check on").
            locatedBy("//span[@ng-class=\"{error: userForm.privacySetting.$error.required}\"]");
    public static final Target BUTTON_COMPLETE = Target.the("button complete").
            locatedBy("//a[@class=\"btn btn-blue\"]");
    //a[@class="btn btn-blue"]

}
