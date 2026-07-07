package ao.morgado.bootstrapper;

public class PingConfig {

    AnywhereRestClient client = new AnywhereRestClient();

    public void execute () {
        client.requestExternalHost();
        client.testConfig();
    }
}
