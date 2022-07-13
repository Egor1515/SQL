package dataHelper;

import db.DataBaseConnections;
<<<<<<< HEAD
import lombok.*;
=======
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
>>>>>>> 4c7aecdc57cf7c50aa3bba8ff892fc50c665b5ab
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

<<<<<<< HEAD
        public int getLastGeneratedCode() {
            return DataBaseConnections.shouldSendCode();
        }
=======
    public static VerificationCode getVerificationCode() {
        String code = DataBaseConnections.shouldSendCode();
        return new VerificationCode(code);
>>>>>>> 4c7aecdc57cf7c50aa3bba8ff892fc50c665b5ab
    }

}
