package com.springtest.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.springtest.demo.dto.PlayerResponseDto;
import com.springtest.demo.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {

    PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/name")
    public  ResponseEntity<List<PlayerResponseDto>> getPlayerByName(@RequestParam String name) {
        List<PlayerResponseDto> playerDto = playerService.getPlayerByName(name);
        return ResponseEntity.ok(playerDto);
    }

    @GetMapping("/nation")
    public ResponseEntity<List<PlayerResponseDto>> getPlayerByNationality(@RequestParam String nation){
        List<PlayerResponseDto> playerDto = playerService.findByNation(nation);
        return playerDto == null || playerDto.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(playerDto);
    }

    @GetMapping("/nation-position")
    public ResponseEntity<List<PlayerResponseDto>> getPlayerByNationalityAndPosition(@RequestParam String nation, @RequestParam String position){
        List<PlayerResponseDto> playerDto = playerService.findByNationAndPosition(nation,position);
        return playerDto == null || playerDto.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(playerDto);
    }

    @GetMapping("/club")
    public ResponseEntity<List<PlayerResponseDto>> getPlayerByClub(@RequestParam String club){
        List<PlayerResponseDto> playerDto = playerService.findByClub(club);
        return playerDto == null || playerDto.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(playerDto);
    }

    @GetMapping("/club-position")
    public ResponseEntity<List<PlayerResponseDto>> getPlayerByClubAndPosition(@RequestParam String club, @RequestParam String position){
        List<PlayerResponseDto> playerDto = playerService.findByClubAndPostion(club,position);
        return playerDto == null || playerDto.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(playerDto);
    }

}
