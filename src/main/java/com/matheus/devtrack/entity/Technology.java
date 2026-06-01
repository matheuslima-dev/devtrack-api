package com.matheus.devtrack.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "technologies")
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private Integer targetHours;

    private Integer studiedHours;

    public Technology()
    {}

    public Technology (
            Long id,
            String name,
            Integer targetHours,
            Integer studiedHours)
    {
        this.id = id;
        this.name = name;
        this.targetHours = targetHours;
        this.studiedHours = studiedHours;
    }
}
