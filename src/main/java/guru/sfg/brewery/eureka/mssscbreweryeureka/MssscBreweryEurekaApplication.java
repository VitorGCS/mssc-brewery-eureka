package guru.sfg.brewery.eureka.mssscbreweryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MssscBreweryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MssscBreweryEurekaApplication.class, args);
    }

}
