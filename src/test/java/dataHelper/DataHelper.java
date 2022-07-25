package dataHelper;

import lombok.Value;
import lombok.experimental.UtilityClass;

@UtilityClass
public class DataHelper {

    @Value

    public static class AuthInfo {
        String user;
        String pass;

    }

    public static AuthInfo getUser() {
        return new AuthInfo(getRegisteredUser(), getRegisteredPassword());
    }

    public static String getRegisteredUser() {
        return "vasya";
    }

    public static String getRegisteredPassword() {
        return "qwerty123";
    }


    @Value

    public static class VerificationCode {
        String code;

    }

}
