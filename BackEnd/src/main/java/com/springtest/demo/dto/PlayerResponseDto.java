package com.springtest.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerResponseDto {
    private String name;
    private String nation;
    private String position;
    private int age;
    private int matchPlayed;
    private int starts;
    private double minutesPlayed;
    private double goals;
    private double assists;
    private double penaltyGoals;
    private double yellowCards;
    private double redCards;
    private double xG;
    private double xA;
    private String club;
}
