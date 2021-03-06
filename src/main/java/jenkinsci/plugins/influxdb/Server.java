package jenkinsci.plugins.influxdb;

/**
 *
 * @author jrajala-eficode
 * @author joachimrodrigues
 */
public class Server {

    private String host;

    private String port;

    private String description;

    private String user;

    private String password;

    private String databaseName;

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getDescription() {
        return description;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
}
