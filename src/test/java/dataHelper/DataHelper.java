package dataHelper;

import db.DataBaseConnections;
import lombok.*;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class DataHelper {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor

    public static class AuthInfo {
        String user;
        String pass;
    }

    public DataHelper() {
    }

    @Data
    @Getter
    @Setter
    public static class RegisteredAuthInfo {
        String user = "vasya";
        String password = "qwerty123";

        public static AuthInfo getAuthInfo() {
            RegisteredAuthInfo info = new RegisteredAuthInfo();
            return new AuthInfo(info.user,info.password ); //TODO ДОПИСАТЬ МЕТОДЫ ДЛЯ ПОЛЕЧЕНИЯ ЗАРЕГИСТРИРОВАННЫХ ПОЛЬЗОВАТЕЛЕЙУ
        }

    }
    @Data
    @Getter
    @Setter
    public static class VerificationCode {
        String code;

        public int getLastGeneratedCode() {
            return DataBaseConnections.shouldSendCode();
        }
    }

}
