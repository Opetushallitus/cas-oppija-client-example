package fi.vm.sade.cas.oppija;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCasClient
public class CasOppijaClientExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasOppijaClientExampleApplication.class, args);
    }

}
