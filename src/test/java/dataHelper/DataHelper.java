package dataHelper;

import db.DataBaseConnections;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
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

    @Contract(" -> new")
    public static @NotNull
    AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    @Value
    public static class VerificationCode {
        String code;
    }

    public static VerificationCode getVerificationCode() {
        String code = DataBaseConnections.shouldSendCode();
        return new VerificationCode(code);
    }

}
