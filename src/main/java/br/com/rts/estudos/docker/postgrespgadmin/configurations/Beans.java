package br.com.rts.estudos.docker.postgrespgadmin.configurations;

import net.datafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

@Configuration
public class Beans {

    @Bean
    public Faker getFaker(){
        return new Faker(Locale.of("pt-BR.yml"));
    }
}
