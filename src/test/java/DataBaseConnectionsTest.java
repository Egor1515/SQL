import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class DataBaseConnectionsTest {

    @Test

    void shouldConnectMysql() throws SQLException, ClassNotFoundException {
        DataBaseConnections.mysql();
    }
}
