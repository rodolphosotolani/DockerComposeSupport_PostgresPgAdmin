package br.com.rts.estudos.docker.postgrespgadmin;

import br.com.rts.estudos.docker.postgrespgadmin.event.EventService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PostgresPgAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostgresPgAdminApplication.class, args);
    }

    @Bean
    CommandLineRunner populateEvents(EventService eventService){
        return args -> {
            for (int count = 0; count < 100; count++) {
                eventService.populateEvents();
            }
        };
    }
}
