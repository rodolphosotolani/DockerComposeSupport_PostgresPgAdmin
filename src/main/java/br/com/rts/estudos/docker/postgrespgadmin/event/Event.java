package br.com.rts.estudos.docker.postgrespgadmin.event;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_EVENTS")
public class Event {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private LocalDateTime cfpStartDate;

    private LocalDateTime cfpEndDate;

    private String location;

    private String website;

}
