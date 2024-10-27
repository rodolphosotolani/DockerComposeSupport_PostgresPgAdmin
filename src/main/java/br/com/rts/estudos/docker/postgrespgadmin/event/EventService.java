package br.com.rts.estudos.docker.postgrespgadmin.event;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.concurrent.TimeUnit;

@Log4j2
@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository repository;

    private final Faker faker;

    public void populateEvents() {
        repository.save(Event
                .builder()
                .name(faker.superhero().name())
                .description(faker.superhero().descriptor())
                .startDate(LocalDateTime.ofInstant(faker.timeAndDate().future(60, TimeUnit.DAYS), ZoneId.systemDefault()))
                .endDate(LocalDateTime.ofInstant(faker.timeAndDate().future(90, TimeUnit.DAYS), ZoneId.systemDefault()))
                .cfpStartDate(LocalDateTime.ofInstant(faker.timeAndDate().future(10, TimeUnit.DAYS), ZoneId.systemDefault()))
                .cfpEndDate(LocalDateTime.ofInstant(faker.timeAndDate().future(50, TimeUnit.DAYS), ZoneId.systemDefault()))
                .location(faker.location().privateSpace())
                .website(faker.internet().webdomain())
                .build());
    }
}
