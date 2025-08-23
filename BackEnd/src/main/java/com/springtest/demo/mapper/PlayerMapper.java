package com.springtest.demo.mapper;

import org.springframework.stereotype.Component;

import com.springtest.demo.dto.PlayerResponseDto;
import com.springtest.demo.entity.Player;

@Component
public class PlayerMapper {
    public PlayerResponseDto toDto(Player player){
        if(player == null) return null;
        return PlayerResponseDto.builder()
        .name(player.getName())
        .nation(player.getNation())
        .position(player.getPosition())
        .age(player.getAge())
        .matchPlayed(player.getMatchPlayed())
        .starts(player.getStarts())
        .minutesPlayed(player.getMinutesPlayed())
        .goals(player.getGoals())
        .assists(player.getAssists())
        .penaltyGoals(player.getPenaltyGoals())
        .yellowCards(player.getYellowCards())
        .redCards(player.getRedCards())
        .xG(player.getxG())
        .xA(player.getxA())
        .club(player.getClub())
        .build();
    }

    public Player toEntity(PlayerResponseDto dto){
        if(dto == null) return null;
        Player player = new Player();
        player.setName(dto.getName());
        player.setNation(dto.getNation());
        player.setPosition(dto.getPosition());
        player.setAge(dto.getAge());
        player.setMatchPlayed(dto.getMatchPlayed());
        player.setStarts(dto.getStarts());
        player.setMinutesPlayed(dto.getMinutesPlayed());
        player.setGoals(dto.getGoals());
        player.setAssists(dto.getAssists());
        player.setPenaltyGoals(dto.getPenaltyGoals());
        player.setYellowCards(dto.getYellowCards());
        player.setRedCards(dto.getRedCards());
        player.setxG(dto.getXG());
        player.setxA(dto.getXA());
        player.setClub(dto.getClub());
        return player;
    }
}
