package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Utest.REGISTER),
                SendKeys.of("jesus").into(Personal.FIRST_NAME),
                SendKeys.of("andrade").into(Personal.LAST_NAME),
                SendKeys.of("j@gmail.com").into(Personal.EMAIL),
                SendKeys.of("November").into(Personal.MONTH),
                SendKeys.of("11").into(Personal.DAY),
                SendKeys.of("1997").into(Personal.YEAR),
                Click.on(Personal.NEXTLOCATION),
                Click.on(Location.BUTTONLOCATION),
                Click.on(Devices.SYSTEM),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSION),
                Click.on(Devices.XP),
                Click.on(Devices.IDIOM),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.BUTTON_FINAL),
                SendKeys.of("Jesusmauricio.1997").into(Complete.PASSWORD),
                SendKeys.of("Jesusmauricio.1997").into(Complete.CONFIRMPASSWORD),
                Click.on(Complete.CHECKON),
                Click.on(Complete.CHECK_ON),
                Click.on(Complete.BUTTON_COMPLETE)



        );


    }
    public static RegisterUser makeinformation(){
        return instrumented(RegisterUser.class);
    }
}
