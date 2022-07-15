package dataHelper;

import db.DataBaseConnections;
import lombok.*;

public class DataHelper {

    @Value

    public static class AuthInfo {
        String user;
        String pass;

    }

    public AuthInfo getUser() {
        return new AuthInfo(getRegisteredUser(), getRegisteredPassword());
    }

    public String getRegisteredUser() {
        return "vasya";
    }

    public String getRegisteredPassword() {
        return "qwerty123";
    }


    @Value

    public static class VerificationCode {
        int code;

    }

}
