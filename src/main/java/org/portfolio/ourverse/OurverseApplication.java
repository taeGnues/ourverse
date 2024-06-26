package org.portfolio.ourverse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OurverseApplication {

    public static void main(String[] args) {
        SpringApplication.run(OurverseApplication.class, args);
    }

}
