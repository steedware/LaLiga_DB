package com.example.laliga.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Competition {
    @Id
    private Long id;
    private String name;
    private String code;
    private String areaName;
}